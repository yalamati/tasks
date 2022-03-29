package com.self.todo.tasks.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author syalama
 *
 */

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity(name = "users")
public class User {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    private String usernme;
    private String password;
    private boolean status = Boolean.TRUE;
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsernme() {
		return usernme;
	}
	public void setUsernme(String usernme) {
		this.usernme = usernme;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
    	
}
