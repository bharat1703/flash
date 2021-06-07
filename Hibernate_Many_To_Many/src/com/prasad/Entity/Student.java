package com.prasad.Entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity(name = "STUDENT3")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	private String sName;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "STUDENT_COURSE", joinColumns = { @JoinColumn(name = "sid") }, inverseJoinColumns = {
			@JoinColumn(name = "cid") })
	private Set<course> setcourse = new HashSet();

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public Set<course> getSetcourse() {
		return setcourse;
	}

	public void setSetcourse(Set<course> setcourse) {
		this.setcourse = setcourse;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String sName, Set<course> setcourse) {
		this.sName = sName;
		this.setcourse = setcourse;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sName=" + sName + ", setcourse=" + setcourse + "]";
	}

}
