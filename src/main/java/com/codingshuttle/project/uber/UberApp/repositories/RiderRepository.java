package com.codingshuttle.project.uber.UberApp.repositories;

import com.codingshuttle.project.uber.UberApp.entities.Rider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiderRepository extends JpaRepository<Rider, Long> {
}
