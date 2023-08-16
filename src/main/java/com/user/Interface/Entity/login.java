package com.user.Interface.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class login {
	    private @Id @GeneratedValue int id;
	    private String username;
	    private String password;
		public int getId() {
			return id;
		}
		public String getUsername() {
			return username;
		}
		public String getPassword() {
			return password;
		}
	    


	

}
