package com.capital.one.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlets.DefaultServlet;

import com.capital.one.beans.FlashCard;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FrontController extends DefaultServlet {
	private List<FlashCard> flashcards = new ArrayList<FlashCard>();

	@Override
	public void init() throws ServletException {
		flashcards.add(new FlashCard(1, "qustion 1", "answer to question 1"));
		flashcards.add(new FlashCard(2, "qustion 2", "answer to question 2"));
		flashcards.add(new FlashCard(3, "qustion 3", "answer to question 3"));
		flashcards.add(new FlashCard(4, "qustion 4", "answer to question 4"));
		super.init();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String requestUrl = request.getRequestURI().substring(request.getContextPath().length());

		response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
		response.setHeader("Access-Control-Allow-Methods", "GET, PUT, POST, OPTIONS, DELETE");

		// route static content normally
		if (requestUrl.startsWith("/static/")) {
			super.doGet(request, response);
			return;
		}

		if (requestUrl.equals("/flashcards")) {
			ObjectMapper om = new ObjectMapper();
			String json = om.writeValueAsString(flashcards);

			response.getWriter().println(json);
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String requestUrl = request.getRequestURI().substring(request.getContextPath().length());

		if (requestUrl.equals("/flashcards")) {
			String json = request.getReader().readLine();
			ObjectMapper om = new ObjectMapper();

			FlashCard fc = om.readValue(json, FlashCard.class);

			flashcards.add(fc);
			System.out.println(flashcards);
		}
	}
}
