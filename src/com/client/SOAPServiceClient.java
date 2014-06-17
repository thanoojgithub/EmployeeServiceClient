package com.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.customerservice.CustomerId;
import com.customerservice.CustomerService;
import com.customerservice.CustomerServiceService;
import com.customerservice.GetCustomerListResponse;
import com.employeeservice.GetEmployeeListResponse;


public class SOAPServiceClient {
	static final Logger logger = Logger.getLogger(SOAPServiceClient.class);
	
	public static void main(String[] args) {
		PropertyConfigurator.configure("../EmployeeServiceClient/resources/log4j.properties");
		tracingSOAPReqEmp();
		empployeeServiceSOAP();
		tracingSOAPReqCust();
		customerServiceSOAP();
	}

	
	public static void tracingSOAPReqEmp() {
		logger.trace("Using URL, QName, Service, Port :: Employee");
		URL url = null;
		try {
			url = new URL("http://localhost:8080/EmployeeService/emp?wsdl");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	    QName qname = new QName("http://com/", "EmployeeServiceService");
	    Service service = Service.create(url, qname);
	 
	    com.employeeservice.EmployeeService employeeService = service.getPort(com.employeeservice.EmployeeService.class);
	    com.employeeservice.EmployeeId employeeId = new com.employeeservice.ObjectFactory().createEmployeeId();
	    employeeId.setEId(101);
	    EmployeePOJO employee = new EmployeePOJO(employeeService.getEmployeeById(employeeId).getEId(), employeeService.getEmployeeById(employeeId).getEName());
	    logger.trace(employee);
	} 

	public static void  empployeeServiceSOAP() {
		logger.trace("Using getEmployeeServicePort :: Employee");
		com.employeeservice.EmployeeServiceService employeeServiceService = new com.employeeservice.EmployeeServiceService();
		com.employeeservice.EmployeeService employeeService = employeeServiceService.getEmployeeServicePort();
		com.employeeservice.Employee employeeReturn = employeeService.getEmployee();
		EmployeePOJO employee1 = new EmployeePOJO(employeeReturn.getEId(), employeeReturn.getEName());
		logger.trace(employee1);
		GetEmployeeListResponse.Return employeeListReturn = employeeService.getEmployeeList();
		List<com.employeeservice.Employee> employeeList= employeeListReturn.getEmployee();
		for (com.employeeservice.Employee emp : employeeList){
			EmployeePOJO employee2 = new EmployeePOJO(emp.getEId(),emp.getEName());
			logger.trace("employeeList : "+employee2);
		}
	}
	
	public static void tracingSOAPReqCust() {
		logger.trace("------------------------------------------------------------------");
		logger.trace("Using URL, QName, Service, Port :: Customer");
		URL url = null;
		try {
			url = new URL("http://localhost:8080/EmployeeService/cust?wsdl");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	    QName qname = new QName("http://com/", "CustomerServiceService");
	    Service service = Service.create(url, qname);
	 
	    CustomerService customerService = service.getPort(CustomerService.class);
	    CustomerId customerId = new com.customerservice.ObjectFactory().createCustomerId();
	    customerId.setCId(1);
	    CustomerPOJO customer = new CustomerPOJO(customerService.getCustomerById(customerId).getCId(), customerService.getCustomerById(customerId).getCName());
	    logger.trace(customer);
	} 

	public static void  customerServiceSOAP() {
		logger.trace("Using getCustomerServicePort :: Customer");
		CustomerServiceService customerServiceService = new CustomerServiceService();
		CustomerService customerService = customerServiceService.getCustomerServicePort();
		CustomerId customerId = new com.customerservice.ObjectFactory().createCustomerId();
	    customerId.setCId(11);
		com.customerservice.Customer customerReturn = customerService.getCustomerById(customerId);
		CustomerPOJO customer1 = new CustomerPOJO(customerReturn.getCId(), customerReturn.getCName());
		logger.trace(customer1);
		GetCustomerListResponse.Return customerListReturn = customerService.getCustomerList();
		List<com.customerservice.Customer> customerList= customerListReturn.getCustomer();
		for (com.customerservice.Customer cust : customerList){
			CustomerPOJO customer2 = new CustomerPOJO(cust.getCId(),cust.getCName());
			logger.trace("customerList : "+customer2);
		}
	}
}