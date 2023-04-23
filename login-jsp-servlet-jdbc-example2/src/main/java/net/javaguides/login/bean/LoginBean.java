package net.javaguides.login.bean;

import java.io.Serializable;

public class LoginBean implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    private String empid;
    
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

    
}
