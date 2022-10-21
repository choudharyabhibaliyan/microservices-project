package com.leaves.repository;

import com.leaves.models.PaidLeaves;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaidLeavesRepository extends JpaRepository<PaidLeaves , Long> {

}
