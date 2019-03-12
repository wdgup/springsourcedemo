import bean.User;
import config.BeanConfiguration;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.io.IOException;

/**
 * @author WDG
 * @date 2019-3-9
 */


//@SpringJUnitConfig
public class BeanFactoryTest {

    private ApplicationContext context ;

    @Before
    public void setUp(){
          context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        BeanFactory
    }

    @Test
    public void test1(){
        System.out.println(context);
        User user = context.getBean(User.class);
        System.out.println(user);

        PropertiesFactoryBean pro = context.getBean(PropertiesFactoryBean.class);
        System.out.println(pro);

        try {
            System.out.println(pro.getObject().getProperty("log4j.appender.stdout"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
