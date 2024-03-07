package com.example.HotelAssignment.Hotel.Repository;

import com.example.HotelAssignment.Hotel.Entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel,Integer> {
}
