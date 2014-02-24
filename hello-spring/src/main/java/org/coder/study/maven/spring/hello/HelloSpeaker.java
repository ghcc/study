package org.coder.study.maven.spring.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloSpeaker {

	@Autowired
	private HelloService service;
	
	public void speak(String who) {
		System.out.println(service.hello(who));
	}
}
