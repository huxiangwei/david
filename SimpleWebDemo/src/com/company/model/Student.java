package com.company.model;

public class Student {
	private int id;

	private String name;
    private int sex;
    private String sexName;
    private String memo;
    public Student (){
    	
    }
    public Student(String name, int sex, String memo){
    	this.name = name;
    	this.sex = sex;
    	this.memo = memo;
    }
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getSexName() {
		if (this.sex==0)
			return "男";
		else 
			return "女";
	}
	public void setSexName(String sexName) {
		this.sexName = sexName;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
    
}
