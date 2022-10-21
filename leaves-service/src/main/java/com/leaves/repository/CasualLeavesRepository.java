package com.leaves.repository;

import com.leaves.models.CasualLeaves;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CasualLeavesRepository extends JpaRepository<CasualLeaves , Long> {

}
