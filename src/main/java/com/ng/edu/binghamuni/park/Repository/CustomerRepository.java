package com.ng.edu.binghamuni.park.Repository;

import com.ng.edu.binghamuni.park.Domain.CustomerInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository <CustomerInformation, Long> {



    long countByAdSource(String adSource);
}
