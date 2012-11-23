package com.fasterxml.jackson.module.jsonSchema.factories;

import java.util.Set;

import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;
import com.fasterxml.jackson.module.jsonSchema.types.StringSchema;

public class StringVisitor implements JsonStringFormatVisitor, JsonSchemaProducer{

	protected ValueTypeSchemaFactory parent;
	protected StringSchema schema;
	
	public StringVisitor(ValueTypeSchemaFactory parent, StringSchema schema) {
		this.parent = parent;
		this.schema = schema;
	}

	public void enumTypes(Set<String> enums) {
		parent.enumTypes(enums);
	}

	public void format(JsonValueFormat format) {
		parent.format(format);
	}

	public ValueTypeSchemaFactory getParent() {
		return parent;
	}

	public StringSchema getSchema() {
		return schema;
	}

	public void setParent(ValueTypeSchemaFactory parent) {
		this.parent = parent;
	}

	public void setSchema(StringSchema schema) {
		this.schema = schema;
	}


}