package com.kkb.mybatis.config;

public class TextSqlNode implements SqlNode {

	private String sqlText;

	public TextSqlNode(String sqlText) {
		this.sqlText = sqlText;
	}

	@Override
	public void apply(DynamicContext context) {

	}

	public boolean isDynamic() {
		if (sqlText.indexOf("${") > -1) {
			return true;
		}
		return false;
	}

}
