package com.xjk.practice.servlet;

import com.xjk.practice.systemtest.PathTest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Intro:
 * Project: practice
 * Date:    8/8/15
 * Author:  xujinkai
 */


public class TestServlet extends HttpServlet {


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);

		String test = req.getParameter("test");

		System.out.println(test);

	}
}
