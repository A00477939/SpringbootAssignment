package com.example.HotelAssignment.Hotel.Service;

import com.example.HotelAssignment.Hotel.Entity.Hotel;

import java.util.List;

public interface HostelService {
    public List<Hotel> getAllHotels();

    Boolean createHotel(Hotel newHotel);
}
