package com.tamanna.hotellimo.repository;

import com.tamanna.hotellimo.models.Guest;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GuestRepository extends JpaRepository<Guest,Long> {
}
