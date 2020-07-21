package com.kkb.mybatis.config;

/**
 * 提供对sql脚本的解析
 * 
 * @author 灭霸詹
 *
 */
public interface SqlNode {

	void apply(DynamicContext context);
}
