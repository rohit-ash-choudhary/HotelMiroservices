package com.ashhh.hotel.HotelService.Controller;


import com.ashhh.hotel.HotelService.Entity.Hotel;
import com.ashhh.hotel.HotelService.Services.HotelServices;
import com.ashhh.hotel.HotelService.Services.impl.HotelServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelRestController {


        @Autowired
       private HotelServices hotelservices;

       @PostMapping
       public ResponseEntity<Hotel> createUser(@RequestBody Hotel hotel)
       {
           Hotel hotels=hotelservices.createHotel(hotel);
           return  new ResponseEntity<>(hotels, HttpStatus.CREATED);
       }

       @GetMapping
       public  ResponseEntity<List<Hotel>> getAllhotel()
       {
           List<Hotel> list_ofhotel=hotelservices.getAllHotel();
           return new ResponseEntity<>(list_ofhotel,HttpStatus.OK);


       }

    @GetMapping("/{hotel_id}")
    public  ResponseEntity<Hotel> getAllhotel(@PathVariable String hotel_id)
    {



        return  new ResponseEntity<>( hotelservices.getHotelById(hotel_id),HttpStatus.OK);

    }
}
