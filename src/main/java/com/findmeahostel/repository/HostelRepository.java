package com.findmeahostel.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.mongodb.repository.Query;
//
//import java.util.List;

import com.findmeahostel.model.Hostel;

public interface HostelRepository extends MongoRepository<Hostel,String> {

//    List<Task> findBySeverity(int severity);
//
//    @Query("{ assignee: ?0 }")
//    List<Task> getTasksByAssignee(String assignee);
}
