package com.findmeahostel.service;

import com.findmeahostel.model.Hostel;
import com.findmeahostel.repository.HostelRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HostelService {

    @Autowired
    private HostelRepository repository;

    //CRUD  CREATE , READ , UPDATE , DELETE


    public Hostel addHostel(Hostel hostel) {
        hostel.setHostelId(UUID.randomUUID().toString().split("-")[0]);
        return repository.save(hostel);
    }

    public List<Hostel> findAllHostels() {
        return repository.findAll();
    }

    public Hostel getHostelByHostelId(String hostelId){
        return repository.findById(hostelId).get();
    }


//    public Task updateTask(Task taskRequest){
//        //get the existing document from DB
//        // populate new value from request to existing object/entity/document
//        Task existingTask = repository.findById(taskRequest.getHostelId()).get();
//        existingTask.setAddress(taskRequest.getAddress());
//        existingTask.set(taskRequest.get());
//        existingTask.set(taskRequest.get());
//        existingTask.set(taskRequest.get());
//        existingTask.set(taskRequest.get());
//        existingTask.set(taskRequest.get());
//        existingTask.set(taskRequest.get());
//        
//        return repository.save(existingTask);
//    }

    public String deleteHostel(String HostelId){
        repository.deleteById(HostelId);
        return HostelId+" hostel deleted from dashboard ";
    }
}
