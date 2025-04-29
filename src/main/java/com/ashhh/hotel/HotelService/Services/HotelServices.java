package com.ashhh.hotel.HotelService.Services;


import com.ashhh.hotel.HotelService.Entity.Hotel;

import java.util.List;
import java.util.Optional;

public interface HotelServices {


    public Hotel createHotel(Hotel hotel);

    public List<Hotel> getAllHotel();

    public Hotel getHotelById(String Id);

}
