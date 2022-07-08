package com.jaime.pos.model;

import lombok.Data;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "client")
public class ClientModel 
{
	@Id
	private int id;
	private String firstName;
	private String middleName;
	private String lastName;
	private char sex;
	private String rfc;
	private LocalDate birthdate;
}
