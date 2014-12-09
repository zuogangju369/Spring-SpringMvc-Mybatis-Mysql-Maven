import com.model.User;
import com.service.UserServiceI;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.swing.*;
import java.util.Scanner;

/**
 * Created by Feeling on 2014/12/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml","classpath:spring-mybatis.xml"})
public class TestMybatis {

    private static final Logger logger = Logger.getLogger(TestMybatis.class);
    private UserServiceI userService;

    public UserServiceI getUserService() {
        return userService;
    }
    @Autowired
    public void setUserService(UserServiceI userService) {
        this.userService = userService;
    }

    @Test
    public void test1(){
        User user=userService.getUserById("1");

        logger.info(user.getUsername()+"-------------------------------------");
    }

}
