package com.nirvana.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Nirvana
 * 处理异常
 */
public class ExceptionAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	@Override
	public String execute() throws Exception {
		
		return ERROR;
	}

}
