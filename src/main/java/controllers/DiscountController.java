/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import DAOO.DAO;
import DAOO.DataSourceFactory;
import DAOO.Discount_Code;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pedago
 */
@WebServlet(name = "DiscountController", urlPatterns = {"/DiscountController"})
public class DiscountController extends HttpServlet {
    
    
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		try {
                    DAO dao = new DAO(DataSourceFactory.getDataSource());
                    
                    List<Discount_Code> codes = dao.listCode();
                    String Code = request.getParameter("code");
                    String Rate = request.getParameter("code");
                    String action = request.getParameter("action");
                    
                    float taux = Float.valueOf(Rate);
                    char code = Code.charAt(0);
                    
                    if (action.equals("add")){
                        dao.addCode(code,taux);
                        codes.add(new Discount_Code(code,taux));
                        request.setAttribute("Code", Code);
                        request.getRequestDispatcher("views/clientsDiscount.jsp").forward(request, response);
                    }else if (action.equals("delete")){
                        dao.supprCode(code);
                        codes.
                    }
                    
                    codes.add(new Discount_Code(code,taux));
                            
                    
                    
                    request.setAttribute("Rate", Rate);
                    
                
                   
                } catch (Exception e) {
			// On renseigne un attribut utilisé par la vue
			request.setAttribute("error", e.getMessage());			
			// On redirige vers la page d'erreur
			request.getRequestDispatcher("views/errorView.jsp").forward(request, response);
		}
    
}
}
