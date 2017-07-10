package com.binding.converter;

import org.example.entities.timestamp.TimestampRequestType;
import com.binding.dao.TimestampJPO;

public class TimestampSdoToJpo {
	public TimestampJPO convert(TimestampRequestType req) {
		TimestampJPO timestampJPO = new TimestampJPO();
		timestampJPO.setTimestampReq(req.getTimestampReq());
		return timestampJPO;
	}
}
