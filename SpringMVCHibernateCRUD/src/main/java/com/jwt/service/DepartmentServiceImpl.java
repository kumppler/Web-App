package com.jwt.service;
 
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.model.Department;
 
@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {
 
    
    private SessionFactory sessionFactory;
 
    @Transactional
    public void createDepartment(Department department) {
        sessionFactory.getCurrentSession().saveOrUpdate(department);
 
    }
    @Transactional
    @SuppressWarnings("unchecked")
    public List<Department> getAllDepartments() {
 
        return sessionFactory.getCurrentSession().createQuery("from Department")
                .list();
    }
 
    @Transactional
    public void deleteDepartment(Integer departmentId) {
        Department department = (Department) sessionFactory.getCurrentSession().load(
                Department.class, departmentId);
        if (null != department) {
            this.sessionFactory.getCurrentSession().delete(department);
        }
 
    }
 
    public Department getDepartment(int empid) {
        return (Department) sessionFactory.getCurrentSession().get(
                Department.class, empid);
    }
 
    
    public Department updateDepartment(Department department) {
        sessionFactory.getCurrentSession().update(department);
        return department;
    }
 
}