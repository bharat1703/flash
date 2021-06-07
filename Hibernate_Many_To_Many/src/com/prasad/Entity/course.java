package com.prasad.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "course")
public class course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	public course(String cname) {
		super();
		this.cname = cname;
	}

	private String cname;

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public course() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "course [cid=" + cid + ", cname=" + cname + "]";
	}

}
