package com.example.wsclient.controller;

import com.example.wsclient.entity.Product;
import com.example.wsclient.retrofit.RetrofitServiceGenerator;
import com.example.wsclient.service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CreateProducrServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("create.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String name =req.getParameter("name");
        Double price = Double.valueOf(req.getParameter("price"));
        Product obj = new Product(name, price);

//        if (!obj.isValid()) {
//            req.setAttribute("errors", obj.getErrors());
//            req.getRequestDispatcher("/create.jsp").forward(req, resp);
//            return;
//        }
        ProductService productService = RetrofitServiceGenerator.createService(ProductService.class);
        productService.save(obj).execute().body();
        System.out.println("save success.");
        resp.sendRedirect("/products");
    }
}
