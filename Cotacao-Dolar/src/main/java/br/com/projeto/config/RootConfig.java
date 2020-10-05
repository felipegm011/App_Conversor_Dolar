package br.com.projeto.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration // indicando que essa classe é uma Bena
@ComponentScan("br.com.projeto") // indicando ao spring a localização das class para gerenciar
@EnableWebMvc // indicando que vamos usar Spring MVC
public class RootConfig {

}
