package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootGitDemoApplication {
	
	private Map<String,Object> cache= new HashMap<String,Object>();
	 

	public static void main(String[] args) {
		ConfigurableApplicationContext run=SpringApplication.run(SpringBootGitDemoApplication.class, args);
		run.close();
		//Changes for HIS-134
	}
	
	public void loadDataToCache() {
		
	}

}
