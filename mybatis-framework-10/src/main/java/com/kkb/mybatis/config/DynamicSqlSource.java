package com.kkb.mybatis.config;

/**
 * 专门封装和处理带有${}和动态sql标签的sql语句
 * 
 * @author 灭霸詹
 *
 */
public class DynamicSqlSource implements SqlSource {

	private SqlNode rootSqlNode;

	public DynamicSqlSource(MixedSqlNode rootSqlNode) {
		this.rootSqlNode = rootSqlNode;
	}

	/**
	 * 在sqlsession执行的时候，才调用该方法
	 */
	@Override
	public BoundSql getBoundSql(Object param) {
		return null;
	}

}
