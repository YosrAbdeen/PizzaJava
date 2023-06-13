package com.restaurant.pizza.beans;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User extends BaseBean  {

	private static final long serialVersionUID = 3913386446048421246L;

	public User() {
		super();

	}

	@Column(name = "user_name")
	private String UserName;
	@Column(name = "first_name")
	private String FirstName;
	@Column(name = "last_name")
	private String lasttName;
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String password;
	@Column(name = "image")
	private byte[] image;

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLasttName() {
		return lasttName;
	}

	public void setLasttName(String lasttName) {
		this.lasttName = lasttName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "User [FirstName=" + FirstName + ", lasttName=" + lasttName + ", email=" + email + ", password="
				+ password + "]";
	}
}
	
