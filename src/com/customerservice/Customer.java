
package com.customerservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Customer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Customer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Customer", namespace = "http://com", propOrder = {
    "cId",
    "cName"
})
public class Customer {

    protected int cId;
    @XmlElement(required = true)
    protected String cName;

    /**
     * Gets the value of the cId property.
     * 
     */
    public int getCId() {
        return cId;
    }

    /**
     * Sets the value of the cId property.
     * 
     */
    public void setCId(int value) {
        this.cId = value;
    }

    /**
     * Gets the value of the cName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCName() {
        return cName;
    }

    /**
     * Sets the value of the cName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCName(String value) {
        this.cName = value;
    }

}
