package org.coder.study.maven.spring.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@ComponentScan
public class App 
{
	@Bean
	HelloService mockMessageService() {
		return new HelloService() {

			public String hello(String who) {
				return "hello," + who + "!";
			}
			
		};
	};

	/**
	 * a simple app--from t3
	 * @param args
	 */
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = 
    	          new AnnotationConfigApplicationContext(App.class);
    	HelloSpeaker speaker = context.getBean(HelloSpeaker.class);
		speaker.speak("world");
		
    }
}
