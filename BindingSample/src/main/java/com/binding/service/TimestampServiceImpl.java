package com.binding.service;

import java.time.LocalDateTime;
import javax.jws.WebService;
import org.example.entities.timestamp.TimestampRequestType;
import org.example.entities.timestamp.TimestampResponseType;
import org.example.services.timestampservice.ITimestampService;
import com.binding.dao.TimestampCrud;
import com.binding.dao.TimestampDao;

@WebService(serviceName="TimestampService", endpointInterface="org.example.services.timestampservice.ITimestampService",
targetNamespace="http://www.example.org/services/TimestampService/", portName="TimestampServicePort", name="TimestampServiceImpl")
public class TimestampServiceImpl implements ITimestampService{

	@Override
	public TimestampResponseType setDateTimestamp() {
		TimestampDao dateTimestampDAO = new TimestampCrud();
		TimestampRequestType req = new TimestampRequestType();
		req.setTimestampReq(LocalDateTime.now());
		TimestampResponseType res = new TimestampResponseType();
		res.setTimestampRes(dateTimestampDAO.createTimestampp(req));
		return res;
	}

}
