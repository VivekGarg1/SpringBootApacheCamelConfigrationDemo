package com.home.app.config;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("file:G:/Java Development/SpringBootApacheCamelConfigrationDemo/input")
		.to("file:G:/Java Development/SpringBootApacheCamelConfigrationDemo/output");
	}

}
