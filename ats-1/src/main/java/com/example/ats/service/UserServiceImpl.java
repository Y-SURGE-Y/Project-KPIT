//package com.example.ats.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import com.example.ats.controller.UserRegistrationForm;
//import com.example.ats.model.User;
//import com.example.ats.repository.UserRepository;
//
//
//@Service
//public class UserServiceImpl implements UserService{
//
//	@Autowired
//	private UserRepository userRepository;
//
//	@Autowired
//	private PasswordEncoder passwordEncoder;
//
//	@Override
//	public void registerUser(UserRegistrationForm form) {
//		User user = new User();
//		user.setUsername(form.getUsername());
//		user.setPassword(passwordEncoder.encode(form.getPassword()));
//		user.setRole(form.getRole());
//		userRepository.save(user);
//	}
//
//	@Override
//	public void saveUser(User user) {
//		userRepository.save(user);
//	}
//
//	@Override
//	public boolean isUserExists(String username) {
//		return userRepository.findByUsername(username) != null;
//	}
//
//}	
