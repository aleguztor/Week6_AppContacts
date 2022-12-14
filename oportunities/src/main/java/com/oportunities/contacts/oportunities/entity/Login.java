package com.oportunities.contacts.oportunities.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="loggers")
public class Login {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message = "Email is required.")
	@Size(min = 1, message = "Email is required.")
	private String email;
	
	@NotNull(message = "Password is required.")
	@Size(min = 6, message = "Password should be atleast 6 characters.")
	private String password;
	private boolean logedstatus;
	public Login() {
		super();
	}
	public Login(String email, String password) {
		
		super();
		this.email = email;
		this.password = password;
	}
	
	
	public Long getId() {
		return id;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public int hashCode() {
		return Objects.hash(email, id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Login other = (Login) obj;
		return Objects.equals(email, other.email) && Objects.equals(id, other.id);
	}


	public boolean isLogedstatus() {
		return logedstatus;
	}


	public void setLogedstatus(boolean logedstatus) {
		this.logedstatus = logedstatus;
	}
	

}
