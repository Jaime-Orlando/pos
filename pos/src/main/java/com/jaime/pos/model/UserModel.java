package com.jaime.pos.model;

import lombok.Data;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
@Data
public class UserModel 
{
	@Id
	private int id;
	private String name;
	private LocalDateTime lastAccess;
	private int roleId;
}
