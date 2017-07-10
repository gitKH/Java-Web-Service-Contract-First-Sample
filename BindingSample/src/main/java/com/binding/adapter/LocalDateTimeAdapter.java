package com.binding.adapter;

import java.time.LocalDateTime;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class LocalDateTimeAdapter extends XmlAdapter<String, LocalDateTime>{

	@Override
	public LocalDateTime unmarshal(String input) throws Exception {
		return LocalDateTime.parse(input);
	}

	@Override
	public String marshal(LocalDateTime input) throws Exception {
		return input.toString();
	}

}
