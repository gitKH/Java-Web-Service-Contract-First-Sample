
package org.example.entities.timestamp;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="timestampRes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "timestampRes"
})
@XmlRootElement(name = "TimestampResponseType")
public class TimestampResponseType
    implements Serializable
{

    private final static long serialVersionUID = 7702L;
    @XmlElement(required = true)
    protected String timestampRes;

    /**
     * Gets the value of the timestampRes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimestampRes() {
        return timestampRes;
    }

    /**
     * Sets the value of the timestampRes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimestampRes(String value) {
        this.timestampRes = value;
    }

}
