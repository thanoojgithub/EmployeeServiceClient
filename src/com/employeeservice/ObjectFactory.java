
package com.employeeservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.employeeservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetEmployeeList_QNAME = new QName("http://com/", "getEmployeeList");
    private final static QName _Employee_QNAME = new QName("http://com", "Employee");
    private final static QName _GetEmployeeById_QNAME = new QName("http://com/", "getEmployeeById");
    private final static QName _GetEmployeeResponse_QNAME = new QName("http://com/", "getEmployeeResponse");
    private final static QName _EmployeeId_QNAME = new QName("http://com", "EmployeeId");
    private final static QName _GetEmployee_QNAME = new QName("http://com/", "getEmployee");
    private final static QName _GetEmployeeListResponse_QNAME = new QName("http://com/", "getEmployeeListResponse");
    private final static QName _GetEmployeeByIdResponse_QNAME = new QName("http://com/", "getEmployeeByIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.employeeservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEmployeeListResponse }
     * 
     */
    public GetEmployeeListResponse createGetEmployeeListResponse() {
        return new GetEmployeeListResponse();
    }

    /**
     * Create an instance of {@link GetEmployeeResponse }
     * 
     */
    public GetEmployeeResponse createGetEmployeeResponse() {
        return new GetEmployeeResponse();
    }

    /**
     * Create an instance of {@link GetEmployeeListResponse.Return }
     * 
     */
    public GetEmployeeListResponse.Return createGetEmployeeListResponseReturn() {
        return new GetEmployeeListResponse.Return();
    }

    /**
     * Create an instance of {@link GetEmployee }
     * 
     */
    public GetEmployee createGetEmployee() {
        return new GetEmployee();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link EmployeeList }
     * 
     */
    public EmployeeList createEmployeeList() {
        return new EmployeeList();
    }

    /**
     * Create an instance of {@link GetEmployeeById }
     * 
     */
    public GetEmployeeById createGetEmployeeById() {
        return new GetEmployeeById();
    }

    /**
     * Create an instance of {@link EmployeeId }
     * 
     */
    public EmployeeId createEmployeeId() {
        return new EmployeeId();
    }

    /**
     * Create an instance of {@link GetEmployeeList }
     * 
     */
    public GetEmployeeList createGetEmployeeList() {
        return new GetEmployeeList();
    }

    /**
     * Create an instance of {@link GetEmployeeByIdResponse }
     * 
     */
    public GetEmployeeByIdResponse createGetEmployeeByIdResponse() {
        return new GetEmployeeByIdResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "getEmployeeList")
    public JAXBElement<GetEmployeeList> createGetEmployeeList(GetEmployeeList value) {
        return new JAXBElement<GetEmployeeList>(_GetEmployeeList_QNAME, GetEmployeeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Employee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com", name = "Employee")
    public JAXBElement<Employee> createEmployee(Employee value) {
        return new JAXBElement<Employee>(_Employee_QNAME, Employee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "getEmployeeById")
    public JAXBElement<GetEmployeeById> createGetEmployeeById(GetEmployeeById value) {
        return new JAXBElement<GetEmployeeById>(_GetEmployeeById_QNAME, GetEmployeeById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "getEmployeeResponse")
    public JAXBElement<GetEmployeeResponse> createGetEmployeeResponse(GetEmployeeResponse value) {
        return new JAXBElement<GetEmployeeResponse>(_GetEmployeeResponse_QNAME, GetEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com", name = "EmployeeId")
    public JAXBElement<EmployeeId> createEmployeeId(EmployeeId value) {
        return new JAXBElement<EmployeeId>(_EmployeeId_QNAME, EmployeeId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "getEmployee")
    public JAXBElement<GetEmployee> createGetEmployee(GetEmployee value) {
        return new JAXBElement<GetEmployee>(_GetEmployee_QNAME, GetEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "getEmployeeListResponse")
    public JAXBElement<GetEmployeeListResponse> createGetEmployeeListResponse(GetEmployeeListResponse value) {
        return new JAXBElement<GetEmployeeListResponse>(_GetEmployeeListResponse_QNAME, GetEmployeeListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "getEmployeeByIdResponse")
    public JAXBElement<GetEmployeeByIdResponse> createGetEmployeeByIdResponse(GetEmployeeByIdResponse value) {
        return new JAXBElement<GetEmployeeByIdResponse>(_GetEmployeeByIdResponse_QNAME, GetEmployeeByIdResponse.class, null, value);
    }

}
