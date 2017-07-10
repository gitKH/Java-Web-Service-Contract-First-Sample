package org.example.services.timestampservice;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.2
 * 2017-07-10T21:41:10.291+03:00
 * Generated source version: 3.0.2
 * 
 */
@WebService(targetNamespace = "http://www.example.org/services/TimestampService/", name = "ITimestampService")
@XmlSeeAlso({org.example.entities.timestamp.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ITimestampService {

    @WebMethod
    @WebResult(name = "TimestampResponseType", targetNamespace = "http://www.example.org/entities/Timestamp", partName = "parameters")
    public org.example.entities.timestamp.TimestampResponseType setDateTimestamp();
}
