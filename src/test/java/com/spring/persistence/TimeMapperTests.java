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
		log.info("getTime()�޼ҵ� ����");
		log.info(timeMapper.getTime());
		log.info("getTime2()�޼ҵ� ����");
		log.info(timeMapper.getTime2());
		log.info("getName()�޼ҵ� ����");
		log.info(timeMapper.getName("korea"));
		log.info("getSubjectName()�޼ҵ� ����");
		log.info(timeMapper.getSubjectName());
		log.info("getSubjectName2()�޼ҵ� ����");
		log.info(timeMapper.getSubjectName2("02"));
		
	}
}
