package com.jaime.pos.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserModel 
{
	
	private int id;
	private String name;
	private LocalDateTime lastAccess;
	private int roleId;

}
