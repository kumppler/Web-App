package com.jwt.dao;
 
import java.util.List;
import org.hibernate.SessionFactory;
import com.jwt.model.Department;
 

public class DepartmentDAOImpl implements DepartamentDAO {
 
    
    private SessionFactory sessionFactory;
 
    public void createDepartment(Department department) {
        sessionFactory.getCurrentSession().saveOrUpdate(department);
 
    }
 
    @SuppressWarnings("unchecked")
    public List<Department> getAllDepartments() {
 
        return sessionFactory.getCurrentSession().createQuery("from Department")
                .list();
    }
 
    
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