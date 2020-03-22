package com.ex.spring.service;

import com.ex.spring.dao.DeptDaoImpl;
import com.ex.spring.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService{
    @Autowired
    private DeptDaoImpl dd;

    @Override
    public List<Dept> getAll() {
        return dd.getAll();
    }
}
