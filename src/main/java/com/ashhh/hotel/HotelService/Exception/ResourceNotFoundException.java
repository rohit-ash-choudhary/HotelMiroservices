package com.ashhh.hotel.HotelService.Exception;

public class ResourceNotFoundException extends RuntimeException {


    public ResourceNotFoundException(){

        super();

    }

    public ResourceNotFoundException(String s){

        super(s);

    }
}
