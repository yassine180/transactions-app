package ma.ensa.transactions_v2;

import ma.ensa.transactions_v2.Dao.Impl.TransactionDaoImpl;
import ma.ensa.transactions_v2.Dao.TransactionDao;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet(name = "AddTransactionServlet", value = "/transactions/add")
public class AddTransactionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Transaction trans = new Transaction(req.getParameter("ref"), req.getParameter("cptDeb"), req.getParameter("cptCred"), Double.parseDouble(req.getParameter("montant")));

        TransactionDao dao = new TransactionDaoImpl();
        int r = dao.save(trans);

        resp.sendRedirect("/list");
    }
}
