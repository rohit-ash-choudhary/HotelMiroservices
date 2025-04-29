package com.ashhh.hotel.HotelService.Services.impl;

import com.ashhh.hotel.HotelService.Entity.Hotel;
import com.ashhh.hotel.HotelService.Exception.ResourceNotFoundException;
import com.ashhh.hotel.HotelService.Repositories.HotelRepository;
import com.ashhh.hotel.HotelService.Services.HotelServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class HotelServicesImpl implements HotelServices {

    @Autowired
    private HotelRepository hotelrepository;

    @Override
    public Hotel createHotel( Hotel hotel) {

        String Id_uini= UUID.randomUUID().toString();

        hotel.setId(Id_uini);
       return  hotelrepository.save(hotel);

    }

    @Override
    public List<Hotel> getAllHotel() {
        return hotelrepository.findAll();
    }

    @Override
    public Hotel getHotelById(String Id) {
        return hotelrepository.findById(Id).orElseThrow(()-> new ResourceNotFoundException("no found"));
    }
}
