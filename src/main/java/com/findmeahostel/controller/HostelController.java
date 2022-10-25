package com.findmeahostel.controller;

import com.findmeahostel.model.Hostel;
import com.findmeahostel.service.HostelService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hostels")
public class HostelController {

    @Autowired
    private HostelService service;

    @PostMapping("/add")
    @CrossOrigin(origins = "http://localhost:3000")
    @ResponseStatus(HttpStatus.CREATED)
    public Hostel createHostel(@RequestBody Hostel hostel){
        return service.addHostel(hostel);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public List<Hostel> getTasks() {
        return service.findAllHostels();
    }


    @GetMapping("/{hostelId}")
    public Hostel getTask(@PathVariable String hostelId){
        return service.getHostelByHostelId(hostelId);
    }

//
//    @PutMapping
//    public Task modifyTask(@RequestBody Task task){
//        return service.updateHostel(task);
//    }

    @DeleteMapping("/{hostelId}")
    public String deleteTask(@PathVariable String hostelId){
        return service.deleteHostel(hostelId);
    }
}
