package com.kkb.mybatis.config;

public class RawSqlSource implements SqlSource {

	private SqlNode rootSqlNode;

	public RawSqlSource(SqlNode rootSqlNode) {
		this.rootSqlNode = rootSqlNode;
		// 在这里要先对sql节点进行解析
	}

	@Override
	public BoundSql getBoundSql(Object param) {
		return null;
	}

}
