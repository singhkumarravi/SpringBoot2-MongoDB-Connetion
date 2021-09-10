package com.olive.model;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
	private Integer pid;
	private String pname;
	private Double pcost;
	private String pType;
	
}
