package com.nirvana.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport {
	private List<Integer> ages;

	public IndexAction() {
		// TODO Auto-generated constructor stub
		ages = new ArrayList<Integer>();
		ages.add(24);
		ages.add(20);
		ages.add(30);
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return SUCCESS;
	}

	public List<Integer> getAges() {
		return ages;
	}
}
