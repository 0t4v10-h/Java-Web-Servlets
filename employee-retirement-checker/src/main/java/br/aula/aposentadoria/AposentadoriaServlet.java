package br.aula.aposentadoria;

import br.aula.aposentadoria.model.Empregado;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.net.URLEncoder;
import java.text.DecimalFormat;

@WebServlet("/aposentadoria")
public class AposentadoriaServlet extends HttpServlet {

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

        Empregado emp = new Empregado();

        emp.setNome(req.getParameter("nome"));
        emp.setIdade(Integer.parseInt(req.getParameter("idade")));
        emp.setTempoTrabalho(Integer.parseInt(req.getParameter("tempo")));

        String resultado = emp.verificarAposentadoria();

        String nome = URLEncoder.encode(emp.getNome(), "UTF-8");
        String res = URLEncoder.encode(resultado, "UTF-8");

        resp.sendRedirect("resultado.jsp?nome=" + nome +
                "&idade=" + emp.getIdade() +
                "&tempo=" + emp.getTempoTrabalho() +
                "&res=" + res);
    }
}
