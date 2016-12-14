package com.chen.config;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

public class MyBatisConfig {
	
	static Logger logger = Logger.getLogger(MyBatisConfig.class);

	static SqlSessionFactory sqlSessionFactory = null;
	
	static{
		try {
			String resource = "mybatis.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			logger.error("解析mybatis配置文件出错！", e);
		}
	}
	
	/**
	 * 获取SqlSessionFactory
	 * @return
	 */
	public static SqlSessionFactory getSqlSessionFactory(){
		return sqlSessionFactory;
	}
	
	/**
	 * 获取SqlSession
	 * @return
	 */
	public static SqlSession getSqlSession(){
		return sqlSessionFactory.openSession(true);
	}
	
	
	public static void main(String[] args) {
		SqlSession sqlSession = MyBatisConfig.getSqlSession();
		System.out.println(sqlSession);
	}
}
