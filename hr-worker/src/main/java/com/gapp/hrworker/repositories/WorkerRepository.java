package com.gapp.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gapp.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}