package br.aula.carros;

import br.aula.carros.model.Carro;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.text.DecimalFormat;

@WebServlet("/carro")
public class CarroServlet extends HttpServlet {

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

        DecimalFormat df = new DecimalFormat("#0.00");

        Carro carro = new Carro();

        carro.setTipo(req.getParameter("tipo"));
        carro.setModelo(req.getParameter("modelo"));
        carro.setMotor(req.getParameter("motor"));

        carro.setImportado(req.getParameter("importado") != null);
        carro.setAr(req.getParameter("ar") != null);
        carro.setCambio(req.getParameter("cambio") != null);
        carro.setAlarme(req.getParameter("alarme") != null);
        carro.setPintura(req.getParameter("pintura") != null);
        carro.setTeto(req.getParameter("teto") != null);
        carro.setMultimidia(req.getParameter("multimidia") != null);

        double total = carro.calcularTotal();

        req.setAttribute("carro", carro);
        req.setAttribute("total", df.format(total));

        RequestDispatcher rd = req.getRequestDispatcher("ResultadoForward.jsp");
        rd.forward(req, resp);
    }
}
