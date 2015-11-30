package simple.spring.mongo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import simple.spring.document.Profile;
import simple.spring.document.UserDetail;
import simple.spring.repository.UserDetailRepository;

/**
 * Simple spring application with mongoDB.
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"spring-with-mongo-context.xml");
		UserDetailRepository userDetailRepository = applicationContext
				.getBean(UserDetailRepository.class);
		
		//Save User Object
		UserDetail userDetail = new UserDetail();
		Profile profile = new Profile();
		profile.setEmail("x.x@xx.com");
		//setting all other values
		userDetail.setProfile(profile);
		userDetailRepository.save(userDetail);
		
		//Get By Id
		userDetail = userDetailRepository
				.findByUserId("56022974e4b0ea9e1c18119e");
		System.out.println("Email :" + userDetail.getProfile().getEmail()
				+ ", Country :" + userDetail.getAddress().getCountry());
		
		//Update 
		userDetail = userDetailRepository
				.findByUserId("56022974e4b0ea9e1c18119e");
		profile = userDetail.getProfile();
		profile.setEmail("x.x@xx.com");
		//setting all other updated values here...
		userDetail.setProfile(profile);
		userDetailRepository.save(userDetail);
		
		//Getting all records
		List<UserDetail> userDetails = userDetailRepository.findAll();
		
		
		//Getting the data by using pagination
		Page<UserDetail> userDetailPage = userDetailRepository.findAll(new PageRequest(0, 100)); // 0 is index / page  number & 100 is per page / size of
		userDetails = userDetailPage.getContent();
		
		
		//Getting count of the documents
		Long count = userDetailRepository.countByAddress_CountryAndProfile_Gender("US", "Male");
		
	}
}
