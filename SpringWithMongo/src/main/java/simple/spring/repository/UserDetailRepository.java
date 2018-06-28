//***************************************************************************************************
//***************************************************************************************************
//      Class Name                          : UserDetailRepository
//***************************************************************************************************
//      Class Description: Defines the user detail repository functionality.
//***************************************************************************************************
//***************************************************************************************************

package simple.spring.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import simple.spring.document.UserDetail;

public interface UserDetailRepository extends
		MongoRepository<UserDetail, String> {

	/**
	 * 
	 * @param email
	 * @return
	 */
	UserDetail findByProfile_Email(String email);

	/**
	 * 
	 * @param userId
	 * @return
	 */
	UserDetail findByUserId(String userId);
	
	Long countByAddress_CountryAndProfile_Gender(String country,String gender);
	
	List<UserDetail> findByAddress_CountryAndProfile_Gender(String country,String gender);
	
	List<UserDetail> findByAddress_CountryAndProfile_Gender(String country,String gender,Pageable pageable);
	
	List<UserDetail> findByAddress_Country(String country);
	
	List<UserDetail> findByAddress_Country(String country,Pageable pageable);

}
