package shopping;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lishon.service.UserService;

public class AopTest {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		context.getBean("loginHandler");
		UserService userService = (UserService) context.getBean("userService");
		
		userService.login();
	}
}
