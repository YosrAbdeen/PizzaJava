package com.restaurant.pizza.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client extends BaseBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4410353190705220933L;

	public Client() {
		super();
	}

	@Column(name = "first_name")
	private String FirstName;
	@Column(name = "last_name")
	private String LastName;
	@Column(name = "phone")
	private String Phone;
	@Column(name = "email")
	private String email;
	@Column(name = "address")
	private String address;

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		this.LastName = lastName;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		this.Phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Client [ FirstName=" + FirstName + ", LastName=" + LastName + ", Phone=" + Phone + ", email=" + email
				+ ", address=" + address + "]";
	}

}
