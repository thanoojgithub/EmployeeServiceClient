package com.client;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.employeeservice.Employee;
import com.employeeservice.EmployeeId;
import com.employeeservice.EmployeeList;
import com.employeeservice.ObjectFactory;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class RESTServiceClient {
	static final Logger logger = Logger.getLogger(RESTServiceClient.class);

	public static void main(String[] args) {
		PropertyConfigurator
				.configure("../EmployeeServiceClient/resources/log4j.properties");
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource webResource = client
				.resource(UriBuilder.fromUri(
						"http://localhost:8080/EmployeeService/rest/")
						.build());

		/**
		 * TEXT based response
		 */
		ClientResponse textResponse = webResource.path("emp/TEXT")
				.accept(MediaType.TEXT_HTML).get(ClientResponse.class);
		System.out.println(textResponse.getResponseDate() + " "
				+ textResponse.getStatus());
		String textOutput = textResponse.getEntity(String.class);
		System.out.println(textOutput);

		/**
		 * Employee XML based response
		 */
		GenericType<JAXBElement<Employee>> employee = new GenericType<JAXBElement<Employee>>() {
		};
		JAXBElement<Employee> response = webResource.path("emp/XML")
				.type(MediaType.APPLICATION_XML).get(employee);
		EmployeePOJO employeePOJO = new EmployeePOJO(response.getValue()
				.getEId(), response.getValue().getEName());
		System.out.println(employeePOJO);

		/**
		 * Employee List XML based response
		 */
		EmployeeList employeeList = webResource
				.path("emp/xmlEmployeeList")
				.accept(MediaType.APPLICATION_XML).get(EmployeeList.class);
		for (Employee emp : employeeList.getEmployee()) {
			employeePOJO = new EmployeePOJO(emp.getEId(), emp.getEName());
			System.out.println(employeePOJO);
		}

		/**
		 * Employee XML based request & response
		 */
		EmployeeId employeeId = new ObjectFactory().createEmployeeId();
		employeeId.setEId(111);
		Employee postXmlEmployee = webResource

				.path("emp/postXmlEmployee")
				.accept(MediaType.APPLICATION_XML)
				.post(Employee.class,
						new JAXBElement<EmployeeId>(new QName("http://com",
								"employee"), EmployeeId.class, null, employeeId));
		employeePOJO = new EmployeePOJO(postXmlEmployee.getEId(),
				postXmlEmployee.getEName());
		System.out.println(employeePOJO);

		/**
		 * Employee JSON based response
		 */
		ClientResponse jSONResponse = webResource
				.path("emp/jsonString")
				.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		System.out.println(jSONResponse.getEntity(String.class));

		Employee jSONEmployee = webResource.path("emp/JSON")
				.accept(MediaType.APPLICATION_JSON).get(Employee.class);
		employeePOJO = new EmployeePOJO(jSONEmployee.getEId(),
				jSONEmployee.getEName());
		System.out.println(employeePOJO);

	}

}