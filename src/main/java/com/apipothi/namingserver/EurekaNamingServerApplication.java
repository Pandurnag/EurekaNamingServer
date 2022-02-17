package com.apipothi.namingserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import jdk.jfr.Enabled;

@SpringBootApplication
@EnableEurekaServer
public class EurekaNamingServerApplication {
	private static String EurekaNamingServerApplication;
	private final static Logger Looger = LoggerFactory.getLogger(EurekaNamingServerApplication);

	public static void main(String[] args) {
		SpringApplication.run(EurekaNamingServerApplication.class, args);
	}

}
