package com.ashhh.hotel.HotelService.Repositories;

import com.ashhh.hotel.HotelService.Entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel,String> {

}
