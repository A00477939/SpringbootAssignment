package com.example.HotelAssignment.Hotel.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "hotels")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    @Column(name = "hotel_id")
    private int id;
    @Column(name ="hotel_name")
    private String Name;
    @Column(name ="location")
    private String Location;
    @Column(name = "rating")
    private Double Rating;
    @Column(name = "total_rooms")
    private int RoomNumber;
    @Column(name="contact_number")
    private String Number;



}