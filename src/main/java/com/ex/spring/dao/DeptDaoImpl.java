package com.ex.spring.dao;

import com.ex.spring.entity.Dept;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class DeptDaoImpl implements DeptDao{
    @Override
    public List<Dept> getAll() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("springJdbc.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate)ac.getBean("jdbcTemplate");
        //为测试query的参数，选择查询部门编号大于10的数据
        String sql = "select * from dept WHERE deptno>10";
        List<Dept> deptList = jdbcTemplate.query(sql, new ResultSetExtractor<List<Dept>>() {
            @Override
            public List<Dept> extractData(ResultSet rs) throws DataAccessException, SQLException {
                List<Dept> depts=new ArrayList<Dept>();
                while(rs.next()){
                    Dept dept = new Dept();
                    int deptno = rs.getInt("deptno");
                    String dname = rs.getString("dname");
                    String loc = rs.getString("loc");
                    dept.setDno(deptno);
                    dept.setDname(dname);
                    dept.setLoc(loc);
                    depts.add(dept);
                }
                return depts;
            }
        });
        System.out.println(deptList);//测试用，输入查询结果在控制台
        return deptList;
    }

}
