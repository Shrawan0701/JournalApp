package com.shrawan.journalApp.service;

import com.shrawan.journalApp.controller.entity.JournalEntry;
import com.shrawan.journalApp.controller.entity.User;
import com.shrawan.journalApp.repository.JournalEntryRepo;
import com.shrawan.journalApp.repository.UserEntryRepo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


@Component
public class UserEntryService {

   @Autowired
    private UserEntryRepo userEntryRepo;

    private static final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public void saveEntry(User user) {
        String rawPassword = user.getPassword();
        // Check if password is already hashed — bcrypt always starts with "$2a$"
        if (!rawPassword.startsWith("$2a$")) {
            user.setPassword(passwordEncoder.encode(rawPassword));
        }
        user.setRoles(Arrays.asList("USER"));
        userEntryRepo.save(user);
    }



    public List<User> getAll() {
       return userEntryRepo.findAll();
   }

   public Optional<User> findById(ObjectId id) {
       return userEntryRepo.findById(id);
   }

   public void deleteById(ObjectId id) {
       userEntryRepo.deleteById(id);
   }

   public User findByUserName(String userName) {
       return userEntryRepo.findByUserName(userName);
   }


    public void deleteByUserName(String userName) {
        userEntryRepo.deleteByUserName(userName);
    }

    public void saveAdmin(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRoles(Arrays.asList("USER","ADMIN"));
        userEntryRepo.save(user);
    }
}
