package simple.spring.mongo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import simple.spring.document.UserDetail;
import simple.spring.repository.UserDetailRepository;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"spring-with-mongo-context.xml");
		UserDetailRepository userDetailRepository = applicationContext
				.getBean(UserDetailRepository.class);
		UserDetail userDetail = userDetailRepository
				.findByUserId("56022974e4b0ea9e1c18119e");
		System.out.println("Email :" + userDetail.getProfile().getEmail()
				+ ", Country :" + userDetail.getAddress().getCountry());
	}
}
