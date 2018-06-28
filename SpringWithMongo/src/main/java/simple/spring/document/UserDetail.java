//***************************************************************************************************
//***************************************************************************************************
//      Class Name                          : UserDetail
//***************************************************************************************************
//      Class Description: Defines the user detail functionality.
//***************************************************************************************************
//***************************************************************************************************

package simple.spring.document;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import simple.spring.mongo.ISpringWithMongo;

@Document(collection = "UserDetails")
public class UserDetail implements ISpringWithMongo {

	@Id
	@Field("user_id")
	private String userId;

	private String status;

	private Address address;

	private Profile profile;

	@Field("installed_apps")
	private List<String> applications = new ArrayList<String>();

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public List<String> getApplications() {
		return applications;
	}

	public void setApplications(List<String> applications) {
		this.applications = applications;
	}

}
