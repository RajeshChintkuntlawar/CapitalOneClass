package com.capital.one.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlets.DefaultServlet;
import org.apache.log4j.Logger;

import com.capital.one.beans.Account;
import com.capital.one.exceptions.UrlNotMappedException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FrontController extends DefaultServlet {
	private Logger log = Logger.getRootLogger();
	
	private List<Account> accounts;
	
	@Override
	public void init() throws ServletException {
		accounts = new ArrayList<Account>();
		accounts.add(new Account(1, 25, "Mehrab"));
		accounts.add(new Account(2, 50, "Uday"));
		accounts.add(new Account(3, 42, "Devi"));
		super.init();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		log.trace("full url: " + req.getRequestURI());
		String requestUrl = req.getRequestURI().substring(req.getContextPath().length());
		log.debug("get request made with url: " + requestUrl);
			
		// route static content normally
		if (requestUrl.startsWith("/static/")) {
			super.doGet(req, resp);
			return;
		}
		
		
		if(requestUrl.equals("/accounts")) {
			
			List<Object> objects = new ArrayList<Object>();
			objects.add(accounts);
			objects.add("hello");
			
//			// convert to json
//			ObjectMapper om = new ObjectMapper();
//			String json = om.writeValueAsString(this.accounts);
			
			ObjectMapper om = new ObjectMapper();
			String json = om.writeValueAsString(objects);
			
			
			// write json to body of response
			resp.getWriter().println(json);
			return;
		}
		
		throw new UrlNotMappedException();
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		super.doPost(request, response);
	}
}
