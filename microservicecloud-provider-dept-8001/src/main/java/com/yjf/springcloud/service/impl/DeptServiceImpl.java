package com.yjf.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yjf.springcloud.dao.DeptDao;
import com.yjf.springcloud.entities.Dept;
import com.yjf.springcloud.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao dao;

    public boolean add(Dept dept) {
        return dao.addDept(dept);
    }

    public Dept get(Long id) {
        return dao.findById(id);
    }

    public List<Dept> list() {
        return dao.findAll();
    }

}