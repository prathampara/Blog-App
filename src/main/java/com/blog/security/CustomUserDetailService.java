//package com.blog.security;
//
//import com.blog.entity.User;
//import com.blog.exception.ResourceNotFoundException;
//import com.blog.repository.UserRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class CustomUserDetailService implements UserDetailsService {
//    @Autowired
//    private UserRepo userRepo;
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
////        loading user from database by username
//       User user= this.userRepo.findByEmail(username).orElseThrow(()-> new ResourceNotFoundException("User","Email:"+username,0));
//        return user;
//    }
//}
