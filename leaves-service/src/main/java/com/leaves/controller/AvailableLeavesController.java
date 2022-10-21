package com.leaves.controller;

import com.commons.Constants;
import com.commons.ResponceHandler;
import com.leaves.services.LeavesServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
@RequestMapping(Constants.ADMINURL)
public class AvailableLeavesController {

    @Inject
    private LeavesServices leavesServices;

    @GetMapping("/leaves/{id}")
    public ResponseEntity<Object> getLeaves(@PathVariable long id){
        return ResponceHandler.generateResponce(HttpStatus.OK , true , leavesServices.getLeaves(id));
    }

}
