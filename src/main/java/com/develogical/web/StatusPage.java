package com.develogical.web;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class StatusPage {

  public void writeTo(HttpServletResponse resp) throws IOException {
    resp.setContentType("text/html");
    PrintWriter writer = resp.getWriter();
    writer.println("<html>");
    writer.println("<body>");
    writer.println("<h3>The server is running!</h3>");
    writer.println("</body>");
    writer.println("</html>");
  }
}
