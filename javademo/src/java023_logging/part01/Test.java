package java023_logging.part01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.LoggerFactory;

public class Test {
     //private final Logger log = LoggerFactory.getLogger(getClass());
	private static final Logger log = LoggerFactory.getLogger(Test.class);
	
     public static void main(String[] args) {//static 붙어있는 것끼리 호출할 수 있다.
    	 log.trace("trace message");//메모리 생성순서도 생각해보자.//상세한 정보를 표시
         log.debug("debug message");//디버깅을 위한 정보 표시
         log.info("info message");// 정보성 로그를 표시
         log.warn("warn message");//시스템 에러의 원인이 될 수 있는 경고성 메시지 표시
         log.error("error message");//요청을 처리하는 중 오류가 발생한 경우 표시
	}
	
	

}

//java

//JDBC API  slf4j

//oracle, mysql, mssql infomix. mongdb

//slf4j

//log4j  logback log4j2

//slf4j + logback
