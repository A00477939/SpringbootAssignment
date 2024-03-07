package com.example.HotelAssignment.Hotel.Contoller;

import com.example.HotelAssignment.Hotel.Entity.Hotel;
import com.example.HotelAssignment.Hotel.Service.Impl.HostelServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HotelController {
    private HostelServiceImp hostelService;

    @Autowired
    public HotelController(HostelServiceImp hostelService) {
        this.hostelService = hostelService;
    }

    @GetMapping("/hotel")
    public ResponseEntity<?> getAllHotels(){
        List<Hotel> hotels = hostelService.getAllHotels();
        if(hotels.isEmpty()) {
            String message = "No hotel found";
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
        }
        return new ResponseEntity<>(hotels,HttpStatus.OK);
    }

    @PostMapping("/hotel")
    public ResponseEntity<?> createHotel(@RequestBody Hotel newHotel){
        Boolean Status = hostelService.createHotel(newHotel);
        if(Status){
            return ResponseEntity.status(HttpStatus.OK).body("Added new Hotel");
        }else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Failed");

        }
    }



}
