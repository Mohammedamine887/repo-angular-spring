package com.project.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.backend.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
