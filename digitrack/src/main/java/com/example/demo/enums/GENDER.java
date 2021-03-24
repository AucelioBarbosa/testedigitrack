package com.example.demo.enums;

public enum GENDER {
	MALE("0", "Masculino"), 
	FEMALE("1", "Feminino");
    
    private String code;
	private String description;
	
	
	private GENDER(String code, String description) {
		this.code = code;
		this.description = description;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}

}
