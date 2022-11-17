package com.bridgelabz.springboot.model;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
//	@Column(name = "mobile_number")
	private String mobileNo;
	private int courseId;
	
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
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
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	
	/*In mySql
	 * create database db_student;
use db_student;
create table student(id int auto_increment primary key, name varchar(50), mobile_no varchar(10), course_id int);
select * from student;*/	

}
