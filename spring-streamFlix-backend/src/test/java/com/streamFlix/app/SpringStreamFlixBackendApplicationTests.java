package com.streamFlix.app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.streamFlix.app.Service.VideoService;

@SpringBootTest
class SpringStreamFlixBackendApplicationTests {

	@Autowired
	VideoService videoService;
	
	@Test
	void contextLoads() {
		
		
		videoService.processVideo( "20dda69b-e672-4e9b-a039-d6be31367bdb");
		
	}

}
