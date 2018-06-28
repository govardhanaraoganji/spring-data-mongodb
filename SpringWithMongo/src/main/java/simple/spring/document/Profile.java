//***************************************************************************************************
//***************************************************************************************************
//      Class Name                          : Profile
//***************************************************************************************************
//      Class Description: Defines the profile functionality.
//***************************************************************************************************
//***************************************************************************************************

package simple.spring.document;

import simple.spring.mongo.ISpringWithMongo;

public class Profile implements ISpringWithMongo {

	private String phone;

	private String DOB;

	private String email;

	private String gender;

	private String lastname;

	private String firstname;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String DOB) {
		this.DOB = DOB;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

}
