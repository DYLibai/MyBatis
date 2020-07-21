package com.kkb.mybatis.config;

import java.util.List;

import org.dom4j.Element;

/**
 * 针对不同子标签进行处理，处理之后，封装到对应的SqlNode对象中
 * 
 * 比如if标签被处理之后，会封装到IfSqlNode对象中
 * 
 * @author 灭霸詹
 *
 */
public interface NodeHandler {

	void handleNode(Element nodeToHandle, List<SqlNode> targetContents);
}
