/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewu.control;

import com.ewu.dao.DataDAOLocal;
import com.ewu.model.EWUData;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cadav
 */
@WebServlet(name= "EWUServlet", urlPatterns = {"/EWUServlet"})
public class EWUServlet extends HttpServlet {

    @EJB
    private DataDAOLocal dataDAO;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        String action = request.getParameter("action");
        String idStr = request.getParameter("id");
        long id = 0;
        if(id != 0 && !idStr.equals("")){
        id = Integer.parseInt(idStr);
        }
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String report = request.getParameter("report");
        
        EWUData data = new EWUData();
        data.setEmail(email);
        data.setFirstName(firstName);
        data.setLastName(lastName);
        data.setReport(report);
        data.setId(id);
        
        
        
        if("Submit".equalsIgnoreCase(action)){
            dataDAO.addReport(data);
        }else if("Edit".equalsIgnoreCase(action)){
            dataDAO.editReport(data);
        }else if("Delete".equalsIgnoreCase(action)){
            dataDAO.deleteReport(id);
        }else if("Search".equalsIgnoreCase(action)){
            data = dataDAO.getReport(id);
        }
        
        request.setAttribute("data", data);
        request.setAttribute("AllData", dataDAO.getAll());
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
