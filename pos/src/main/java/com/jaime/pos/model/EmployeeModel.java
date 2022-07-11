package com.jaime.pos.model;

import lombok.Data;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
@Data
public class EmployeeModel
{
	@Id
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
