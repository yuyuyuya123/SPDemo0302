package com.ex.spring.service;

import javax.servlet.http.HttpServlet;

//@WebServlet("/get_data")
public class deptServlet extends HttpServlet {
  /*  @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ApplicationContext ac=new ClassPathXmlApplicationContext("springJdbc.xml");
        DeptServiceImpl ds = (DeptServiceImpl) ac.getBean("deptServiceImpl");
        List<Dept> all = ds.getAll();
        HttpSession session = req.getSession();
        session.setAttribute("all",all);
        resp.sendRedirect("success.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }*/
}
