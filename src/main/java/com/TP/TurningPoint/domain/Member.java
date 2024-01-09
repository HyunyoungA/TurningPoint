package com.TP.TurningPoint.domain;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Member {
	private String userId;
	private String password;
	private String userName;
	private String nickName;
	private String role;
	private String gender;
	private String status;
	private String mobileNumble;
	private String userInformation;
	private String userCareer;
	private String userGymLocation;
}
