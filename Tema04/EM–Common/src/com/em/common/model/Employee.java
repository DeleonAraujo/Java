package com.em.common.model;

public class Employee {
    
    private Long id;
    
    private String firstName;
    
    private String lasttName;
    
    private String designation;
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
    // Other setters and getters

    public String getFirstName() {
		return firstName;
	}

    public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

    public String getLasttName() {
		return lasttName;
	}

    public void setLasttName(String lasttName) {
		this.lasttName = lasttName;
	}

    public String getDesignation() {
		return designation;
	}

    public void setDesignation(String designation) {
		this.designation = designation;
	}
}
