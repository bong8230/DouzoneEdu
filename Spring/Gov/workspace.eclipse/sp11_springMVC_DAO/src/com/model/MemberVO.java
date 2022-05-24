package com.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data    // setter , getter, toString method
@NoArgsConstructor    // default constructor
@AllArgsConstructor     //  all member field  constructor  
public class MemberVO {   // Model 

	private String id, name, pwd, email;
	private int age;
	
}
