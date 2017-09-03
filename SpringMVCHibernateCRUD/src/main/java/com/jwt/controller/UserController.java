package com.jwt.controller;
 
import java.io.IOException;
import java.util.List;
 
import javax.servlet.http.HttpServletRequest;
 
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.jwt.model.User;
import com.jwt.service.UserService;
 
@Controller
public class UserController {
 
    private static final Logger logger = Logger
            .getLogger(UserController.class);
 
    public UserController() {
        System.out.println("UserController()");
    }
 
    @Autowired
    private UserService userService;
 
    @RequestMapping(value = "/")
    public ModelAndView listUser(ModelAndView model) throws IOException {
        List<User> listUser = userService.getAllUsers();
        model.addObject("listUser", listUser);
        model.setViewName("home");
        return model;
    }
 
    @RequestMapping(value = "/newUser", method = RequestMethod.GET)
    public ModelAndView newContact(ModelAndView model) {
        User user = new User();
        model.addObject("user", user);
        model.setViewName("UserForm");
        return model;
    }
 
    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public ModelAndView saveUser(@ModelAttribute User user) {
        if (user.getId() == 0) { // if user id is 0 then creating the
            // user other updating the user
            userService.createUser(user);
        } else {
            userService.updateUser(user);
        }
        return new ModelAndView("redirect:/");
    }
 
    @RequestMapping(value = "/deleteUser", method = RequestMethod.GET)
    public ModelAndView deleteUser(HttpServletRequest request) {
        int userId = Integer.parseInt(request.getParameter("id"));
        userService.deleteUser(userId);
        return new ModelAndView("redirect:/");
    }
 
    @RequestMapping(value = "/editUser", method = RequestMethod.GET)
    public ModelAndView editContact(HttpServletRequest request) {
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = userService.getUser(userId);
        ModelAndView model = new ModelAndView("UserForm");
 
        return model;
    }
 
}