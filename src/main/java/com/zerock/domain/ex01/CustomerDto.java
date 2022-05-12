package com.zerock.domain.ex01;

import lombok.Data;

@Data
public class CustomerDto {

	private int id;
	private String customerName;
	private String contactName;
	private String address;
	private String city;
	private String postalCode;
	private String country;
}
