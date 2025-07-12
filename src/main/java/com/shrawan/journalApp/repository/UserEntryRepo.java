package com.shrawan.journalApp.repository;

import com.shrawan.journalApp.controller.entity.JournalEntry;
import com.shrawan.journalApp.controller.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserEntryRepo extends MongoRepository<User, ObjectId> {

         User findByUserName(String username);

         void deleteByUserName(String username);
}
