package com.example.demo.bathroom;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BathroomRepository
        extends JpaRepository<Bathroom,Long> {
}
