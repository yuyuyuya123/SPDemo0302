package com.ex.spring.service;

import com.ex.spring.entity.Dept;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

/** 
* DeptServiceImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 21, 2020</pre> 
* @version 1.0 
*/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:springJdbc.xml","classpath*:springmvc.xml"})
@WebAppConfiguration(value = "src/main/webapp")
public class DeptServiceImplTest{

    @Autowired
    DeptServiceImpl deptServiceImpl;

@Test
public void testGetAll() throws Exception {
    List<Dept> all = deptServiceImpl.getAll();
    System.out.println("单元测试："+all);
//    System.out.println("测试用例-------");
}


} 
