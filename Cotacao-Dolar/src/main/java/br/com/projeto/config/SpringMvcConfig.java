package br.com.projeto.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
public class SpringMvcConfig {
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		
		//definindo caminho das viws
		resolver.setPrefix("/WEB-INF/views/");
		
		// indicando extesão das views
		resolver.setSuffix(".jsp");
		
		//indicamos ao SpringMVC que utilizaremos JSTL na criação das nossas Views
		resolver.setViewClass(JstlView.class);
		
		// retornando todas as configurações ecapsuladas no obsjeto resolver
		return resolver;
	}
}
