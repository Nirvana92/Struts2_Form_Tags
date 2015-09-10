package com.nirvana.action;

import com.nirvana.entity.Person;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Nirvana 表单验证
 * 
 * 1. User must provide a first name 
 * 2. User must provide an email address 
 * 3. User younger then 18 cannot register
 */
public class ValidateAction extends ActionSupport {
	private Person person;

	@Override
	public String execute() throws Exception {
		System.out.println(person);
		return super.execute();
	}
	
	/**
	 * 如果验证有问题，则execute将返回input字段
	 */
	@Override
	public void validate() {
		if (person.getFirstName().length() == 0) {
			addFieldError("person.firstName", "First Name is Required.");
		}

		if (person.getEmail().length() == 0) {
			addFieldError("person.email", "Email is required.");
		}

		if (person.getAge() < 18) {
			addFieldError("person.age",
					"Age is required and must be 18 or loader");
		}
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
