package org.nontster.ping;

import org.junit.jupiter.api.Test;
import org.nontster.ping.controller.PingController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class PingApplicationTests {

	@Autowired
	private PingController controller;

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	void pingShouldReturnPong (){
		final String url = String.format("http://localhost:%d/ping", port);
		assertThat(this.restTemplate.getForObject(url,String.class)).contains("pong");
	}

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

}
