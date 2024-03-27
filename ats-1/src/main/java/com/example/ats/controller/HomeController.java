//package com.example.ats.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.annotation.Secured;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import com.example.ats.model.User;
//import com.example.ats.service.UserService;
//
//@Controller
//public class HomeController {
//
//    @Autowired
//    private UserService userService;
//
//    @GetMapping("/")
//    public String showHomePage() {
//        return "home"; // This will return the index.html template
//    }
//
//    @GetMapping("/login")
//    public String showLoginPage() {
//        return "login"; // Assuming you have a login page template
//    }
//
//    @GetMapping("/signup")
//    public String showSignupPage(Model model) {
//        model.addAttribute("user", new User());
//        return "signup"; // Assuming you have a signup page template
//    }
//
//    @PostMapping("/signup")
//    public String processSignupForm(@Validated User user, BindingResult result) {
//        if (result.hasErrors()) {
//            return "signup";
//        }
//
//        if (userService.isUserExists(user.getUsername())) {
//            result.rejectValue("username", "error.user", "Username is already taken");
//            return "signup";
//        }
//
//        // Hash the password before storing
//        user.setPassword(user.getPassword());
//
//        // Save user details to the database
//        userService.saveUser(user);
//
//        // Redirect to login page
//        return "redirect:/login";
//    }
//
//    @GetMapping("/admin")
//    @Secured("ROLE_ADMIN")
//    public String adminEndpoint() {
//        return "Admin endpoint accessed!";
//    }
//
//    @GetMapping("/user")
//    @Secured("ROLE_USER")
//    public String userEndpoint() {
//        return "User endpoint accessed!";
//    }
//}
