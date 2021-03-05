package com.google.sps.servlets;

import java.util.ArrayList;
import com.google.gson.Gson;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    //response.setContentType("text/html;");
    //response.getWriter().println("Hello world! This is Carlos Alcazar");
  
  
    ArrayList<String> artists = new ArrayList<String>();
    artists.add("Kanye West");
    artists.add("Eminem");
    artists.add("Drake");

    Gson gson = new Gson();
    String json = gson.toJson(artists);

    response.setContentType("text/html;");
    response.getWriter().println(json);
    }
}

