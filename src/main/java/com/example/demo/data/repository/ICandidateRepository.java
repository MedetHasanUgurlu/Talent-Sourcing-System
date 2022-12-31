package com.example.demo.data.repository;

import com.example.demo.data.entity.concretes.Candidate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICandidateRepository extends CrudRepository<Candidate,Long> {
}
