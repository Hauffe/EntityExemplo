/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog4.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import prog4.model.Automovel;

/**
 *
 * @author alexandre.hauffe
 */
public class AutomovelNovoServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        RequestDispatcher rd;
        rd= request.getRequestDispatcher("/WEB-INF/View/auto-novo-forum.jsp");
        rd.forward(request, response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String placa = request.getParameter("placa");
        String anoFabricacaoParam = request.getParameter("anoFabricacao");
        
        int anoFabricacao = Integer.parseInt(anoFabricacaoParam);
        
        Automovel auto = new Automovel();
        auto.setPlaca(placa);
        auto.setAnoFabricação(anoFabricacao);
        
        
        EntityManagerFactory fabrica;
        fabrica = Persistence.createEntityManagerFactory("autobd");
        
        
        
    }

}
