package com.jwt.dao;
 
import java.util.List;


import org.hibernate.SessionFactory;



import com.jwt.model.User;
 

public class UserDAOImpl implements UserDAO {
 
    
    private SessionFactory sessionFactory;
 
    public void createUser(User user) {
        sessionFactory.getCurrentSession().saveOrUpdate(user);
 
    }
 
    @SuppressWarnings("unchecked")
    public List<User> getAllUsers() {
 
        return sessionFactory.getCurrentSession().createQuery("from User")
                .list();
    }
 
    
    public void deleteUser(Integer userId) {
        User user = (User) sessionFactory.getCurrentSession().load(
                User.class, userId);
        if (null != user) {
            this.sessionFactory.getCurrentSession().delete(user);
        }
 
    }
 
    public User getUser(int empid) {
        return (User) sessionFactory.getCurrentSession().get(
                User.class, empid);
    }
 
    
    public User updateUser(User user) {
        sessionFactory.getCurrentSession().update(user);
        return user;
    }
 
}