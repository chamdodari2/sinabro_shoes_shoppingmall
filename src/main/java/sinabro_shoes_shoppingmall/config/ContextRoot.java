package sinabro_shoes_shoppingmall.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ContextDataSource.class, ContextSqlSession.class})
@ComponentScan(basePackages = {
		"sinabro_shoes_shoppingmall.service"
		,"sinabro_shoes_shoppingmall.controller"
		,"sinabro_shoes_shoppingmall.mapper"
		})
public class ContextRoot {

}