package com.bytegriffin.datatunnel.meta;

import java.util.List;

import com.bytegriffin.datatunnel.sql.Field;

/**
 * 数据记录
 */
public class Record {
	
	private List<Field> fields;
	
	public List<Field> getFields() {
		return fields;
	}

	public void setFields(List<Field> fields) {
		this.fields = fields;
	}
}