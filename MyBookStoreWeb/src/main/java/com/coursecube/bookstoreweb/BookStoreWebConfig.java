package com.coursecube.bookstoreweb;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@SpringBootApplication
@EnableFeignClients
public class BookStoreWebConfig /* implements WebMvcConfigurer */  {
	
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/myjsps/");
		resolver.setSuffix(".jsp");
		resolver.setViewClass(JstlView.class);
		return resolver;
	}
	
	
	//@Override
	//public void addResourceHandlers(ResourceHandlerRegistry registry) {
		//registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
		//When using option 1: of Readme-Note.txt then uncomment the below line.
		//registry.addResourceHandler("/mycss/**").addResourceLocations("classpath:/META-INF/resources/mycss/"); 
	//}

}
