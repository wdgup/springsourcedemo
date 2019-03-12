package config;

import bean.User;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.ClassPathResource;


/**
 * @author WDG
 * @date 2019-3-9
 */
@Configuration
@PropertySource(value= "log4j2.properties")
//@ImportResource(value = "log4j2.xml")
public class BeanConfiguration {

    @Bean
    public User user(){
        return  new User();
    }

    @Bean
    public PropertiesFactoryBean propertiesFactoryBean(){
        PropertiesFactoryBean propertiesFactoryBean = new PropertiesFactoryBean();
        propertiesFactoryBean.setLocation(new ClassPathResource("log4j2.properties"));
        return  propertiesFactoryBean;
    }
}
