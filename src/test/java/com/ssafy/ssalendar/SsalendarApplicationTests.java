package com.ssafy.ssalendar;

import com.ssafy.ssalendar.repository.group.GroupRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
class SsalendarApplicationTests {

	@Autowired
	private GroupRepository gr;
	@Test
	void contextLoads() {
//		System.out.println(gr.go().get(0));
	}

}
