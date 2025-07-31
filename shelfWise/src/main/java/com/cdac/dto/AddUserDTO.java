package com.cdac.dto;

import java.util.List;

import com.cdac.entities.Book;
import com.cdac.entities.UserRole;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddUserDTO {
	private String name;

    private String email;

    private String password;
    private Long mobile;
    private String address;
   
    private UserRole role; 
}
