package com.cg.service;

import java.beans.PropertyEditorSupport;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LdtEditor extends PropertyEditorSupport {
	
	@Override
	public String getAsText() {
		return getValue().toString();
	}
	
	@Override
	public void setAsText(String strDt) throws IllegalArgumentException {
		DateTimeFormatter dFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate ldt = LocalDate.parse(strDt, dFormatter);
		setValue(ldt);
	}
}
