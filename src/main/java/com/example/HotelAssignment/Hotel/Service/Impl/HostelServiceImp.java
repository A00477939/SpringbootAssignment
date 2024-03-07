package com.example.HotelAssignment.Hotel.Service.Impl;

import com.example.HotelAssignment.Hotel.Entity.Hotel;
import com.example.HotelAssignment.Hotel.Repository.HotelRepository;
import com.example.HotelAssignment.Hotel.Service.HostelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HostelServiceImp implements HostelService {
    private HotelRepository hotelRepository;

    @Autowired
    public HostelServiceImp(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public Boolean createHotel(Hotel newHotel) {
        hotelRepository.save(newHotel);
        Integer checkId = newHotel.getId();
        if(checkId != null){
            return true;
        }
        return false;
    }
}
