package com.demo.mvc.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.demo.mvc.validation.CustomerCode;

public class CustomerModel {

	private String firstName;

	@NotNull(message = "is Required")
	@Size(min= 2 , message = "greater than 1")
	private String lastName;

	@Pattern(regexp = "^[0-9]{6}" , message = "Enter Valid postal Code")
	private String postalCode ;

	//Type must be generic to avoid numberFormatException issue
	@NotNull(message = "Must fill expected Package")
	@Min(value = 100000 , message = "minimum must be 1Lakh" )
	@Max(value = 1000000 , message = "maximum must be 10Lakh")
	private Integer expectedPackage;

	//Customized  annotation
	@CustomerCode(value = "code-" , message = "Must starts with code-")
	private String customerCode;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public Integer getExpectedPackage() {
		return expectedPackage;
	}

	public void setExpectedPackage(Integer expectedPackage) {
		this.expectedPackage = expectedPackage;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}


}
