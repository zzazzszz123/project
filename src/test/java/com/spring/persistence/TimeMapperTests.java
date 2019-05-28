package com.spring.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.mapper.TimeMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class TimeMapperTests {
	@Setter(onMethod_ = @Autowired)
	private TimeMapper timeMapper;
	
	@Test
	public void testGetTime() {
		log.info(timeMapper.getClass().getName());
		log.info("getTime()메소드 실행");
		log.info(timeMapper.getTime());
		log.info("getTime2()메소드 실행");
		log.info(timeMapper.getTime2());
		log.info("getName()메소드 실행");
		log.info(timeMapper.getName("korea"));
		log.info("getSubjectName()메소드 실행");
		log.info(timeMapper.getSubjectName());
		log.info("getSubjectName2()메소드 실행");
		log.info(timeMapper.getSubjectName2("02"));
		
	}
}
