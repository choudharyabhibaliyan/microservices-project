package com.leaves.services;

import com.leaves.repository.CasualLeavesRepository;
import com.leaves.repository.PaidLeavesRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LeavesServices {

    @Inject
    private CasualLeavesRepository casualLeavesRepository;

    @Inject
    private PaidLeavesRepository paidLeavesRepository;

    public Map<String , Object> getLeaves(long id){
        Map<String , Object> leavesDetails= new HashMap<>();
        leavesDetails.put("casualLeaves" , casualLeavesRepository.findById(id));
        leavesDetails.put("paidLeaves" , paidLeavesRepository.findById(id));
        return leavesDetails;
    }

}
