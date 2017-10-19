/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ValidaSesionesServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        HttpSession sesion = request.getSession();
        String titulo = null;

        //Pedimos el atributo, y verificamos si existe
        String claveSesion = (String) sesion.getAttribute("claveSesion");

        if (claveSesion.equals("lalitoesquivias")) {
            PrintWriter out = response.getWriter();
            out.println("<center>");
            out.println("<h3>Muy bien</h3>");
            out.println("<br>");
            out.println("<h3>Bienvenido</h3>");
            out.println("<br>");
            out.println("ID de la sesi&oacute;n JSESSIONID: " + sesion.getId());
            out.println("<img src=\"perrito.jpg\">");
            out.println("Fernando Adrian Jimenez Esquivias");
            out.println("</center>");
        } else {
            PrintWriter out = response.getWriter();
            out.println("<center>");
            out.println("<h3>tienes un error</h3>");
            out.println("<br>");
            out.println("ID de la sesi&oacute;n JSESSIONID: " + sesion.getId());
            out.println("<img src=\"perrito2.jpg\">");
            out.println("Fernando Adrian Jimenez Esquivias");
            out.println("</center>");
        }

        //Mostramos los  valores en el cliente
    }

}
