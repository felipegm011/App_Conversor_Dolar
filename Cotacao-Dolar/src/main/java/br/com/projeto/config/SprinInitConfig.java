package br.com.projeto.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SprinInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		/* Aqui são definidas as classes de configuração raíz do Spring. No caso,
		será a classe RootConfig que criamos anteriormente.*/
		 
		return new Class[] {RootConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		/*Isso informa ao Spring que, quando for trabalhar com Servlets, ele irá se basear
		nas configurações que acabamos de definir na classe SpringMvcConfig.*/
		
		return new Class[] {SpringMvcConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		/*Sempre quando uma requisição HTTP for feita para o index da nossa aplicação,
		ela deverá invocar um Servlet para tratá-la.*/
		
		return new String[] {"/"};
	}

}
