package com.nirvana.action;

import java.util.ArrayList;
import java.util.List;

import com.nirvana.entity.Person;
import com.opensymphony.xwork2.ActionSupport;

public class FormTagAction extends ActionSupport {
	private Person person;
	private List<Integer> args;

	public FormTagAction() {
		
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(args);
		//System.out.println(person);
		return SUCCESS;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public void setArgs(List<Integer> args) {
		this.args = args;
	}

}
