package com.binding.converter;

import java.sql.Timestamp;
import org.eclipse.persistence.mappings.DatabaseMapping;
import org.eclipse.persistence.mappings.converters.Converter;
import org.eclipse.persistence.sessions.Session;
import org.joda.time.LocalDateTime;

public class JodaLocalDateTimeAttributeConverter implements Converter {

	private static final long serialVersionUID = 1L;

	@Override
	public Object convertDataValueToObjectValue(Object dataValue, Session session) {
		return dataValue == null ? null : new LocalDateTime((Timestamp) dataValue);
	}

	@Override
	public Object convertObjectValueToDataValue(Object objectValue, Session session) {
		/*In order to be valid the input of this old Timestamp constructor, in the final step the input is changed
		 * to DateTime. Issue in this example occured, because the storage data type is varchar 
		 * */
		return objectValue == null ? null : new Timestamp(((LocalDateTime) objectValue).toDateTime().getMillis());
	}

	@Override
	public void initialize(DatabaseMapping mapping, Session session) {
	}

	@Override
	public boolean isMutable() {
		return false;
	}

}
