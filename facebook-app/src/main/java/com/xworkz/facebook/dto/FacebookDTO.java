package com.xworkz.facebook.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@RequiredArgsConstructor
@ToString

@Entity
@Table(name = "facebook_details")
public class FacebookDTO {
	
	@Column(name = "FACEBOOK_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int facebookID;
	
	@Column(name = "EMAIL")
	@NonNull
	private String email;
	
	@Column(name = "USER_NAME")
	@NonNull
	private String userName;
	
	@Column(name = "DOB")
	@NonNull
	private String dOB;
	
	@Column(name = "PASSWORD")
	@NonNull
	private String password;
	
	@Column(name = "MOBILE_NO")
	@NonNull
	private String mobileNO;

}
