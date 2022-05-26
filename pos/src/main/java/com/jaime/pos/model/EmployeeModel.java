package com.jaime.pos.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class EmployeeModel
{
	private int id;
	private String firstName;
	private String lastName;
	private String phone;
	private String email;
	private String rfc;
	private LocalDate birthdate;
	private int storeId;
	private int userId;
}
