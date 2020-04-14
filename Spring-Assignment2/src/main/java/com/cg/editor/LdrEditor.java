package com.cg.editor;

import java.beans.PropertyEditorSupport;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LdrEditor extends PropertyEditorSupport{

	@Override
	public String getAsText() {
		return getValue().toString();
	}

	@Override
	public void setAsText(String strDt) throws IllegalArgumentException {
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate ldt=LocalDate.parse(strDt,format);
		setValue(ldt);
	}

	
}
