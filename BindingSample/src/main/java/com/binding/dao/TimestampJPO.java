package com.binding.dao;



import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.binding.converter.JodaLocalDateTimeAttributeConverter;
import com.binding.converter.LocalDateTimeAttributeConverter;

@Entity(name = "Timestamp")
public class TimestampJPO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
	@Column(name="TimestampRecord")
	//For java 8
	@Convert(converter = LocalDateTimeAttributeConverter.class)
	//For java 7
	//@Converter(name = "LocalDateTimeConverter", converterClass = com.binding.converter.JodaLocalDateTimeAttributeConverter.class)
	//@Convert("LocalDateTimeConverter")
	protected LocalDateTime timestampReq;

	public LocalDateTime getTimestampReq() {
		return timestampReq;
	}

	public void setTimestampReq(LocalDateTime timestampReq) {
		this.timestampReq = timestampReq;
	}

	@Override
	public String toString() {
		return "TimestampRequestTypeJPO [timestampReq=" + timestampReq + "]";
	}
}
