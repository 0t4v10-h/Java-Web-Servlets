package br.aula.carros;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/modelo")
public class ModeloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doRequest(req, resp);
    }

    private void doRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        String tipo = req.getParameter("tipo");
        PrintWriter out = resp.getWriter();

        if ("popular".equals(tipo)){
            out.println("<option>Gol</option><option>Celta</option><option>Uno</option>");
        } else if ("basico".equals(tipo)){
            out.println("<option>Fiesta</option><option>Palio</option><option>Fox</option>");
        } else if ("suv".equals(tipo)){
            out.println("<option>Fremmont</option><option>Jeep</option><option>HRV</option>");
        } else if ("utilitario".equals(tipo)){
            out.println("<option>Strada</option><option>Saveiro</option><option>S10</option>");
        } else if ("sedan".equals(tipo)){
            out.println("<option>Corolla</option><option>Fusion</option><option>Civic</option>");
        }
    }
}
