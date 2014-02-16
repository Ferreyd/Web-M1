/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TP1.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nicolas
 */
import java.io.IOException;  
  
import javax.inject.Inject;  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  
import TP1.BookRepository;  
import TP1.JDBC;
  
@WebServlet("/book/") 

public class BookListServlet extends HttpServlet {  
      
    @Inject @JDBC  
    private BookRepository bookRepo;  
  
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
        request.setAttribute("books", bookRepo.listBooks());  
        getServletContext().getRequestDispatcher("/TP1/book-list.jsp").forward(request, response);  
    }  
  
}  
