package com.jwt.dao;
import java.util.List;
import com.jwt.model.User;

public interface UserDAO {
	 
	    public void createUser(User user);
	 
	    public List<User> getAllUsers();
	 
	    public void deleteUser(Integer userId);
	 
	    public User updateUser(User user);
	 
	    public User getUser(int userid);

}
