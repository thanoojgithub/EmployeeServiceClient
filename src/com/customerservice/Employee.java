
package com.customerservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Employee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Employee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="eName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Employee", namespace = "http://com", propOrder = {
    "eId",
    "eName"
})
public class Employee {

    protected int eId;
    @XmlElement(required = true)
    protected String eName;

    /**
     * Gets the value of the eId property.
     * 
     */
    public int getEId() {
        return eId;
    }

    /**
     * Sets the value of the eId property.
     * 
     */
    public void setEId(int value) {
        this.eId = value;
    }

    /**
     * Gets the value of the eName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEName() {
        return eName;
    }

    /**
     * Sets the value of the eName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEName(String value) {
        this.eName = value;
    }

}
