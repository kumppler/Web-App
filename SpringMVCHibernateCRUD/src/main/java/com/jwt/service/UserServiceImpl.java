package com.jwt.service;
 
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import com.jwt.dao.UserDAO;
import com.jwt.model.User;
 
@Service
@Transactional
public class UserServiceImpl implements UserService {
 
    
    private UserDAO userDAO;
 
    
    @Transactional
    public void createUser(User user) {
        userDAO.createUser(user);
    }
 
    
    @Transactional
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }
 
    
    @Transactional
    public void deleteUser(Integer userId) {
        userDAO.deleteUser(userId);
    }
 
    public User getUser(int empid) {
        return userDAO.getUser(empid);
    }
 
    public User updateUser(User user) {
        // TODO Auto-generated method stub
        return userDAO.updateUser(user);
    }
 
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
 
}