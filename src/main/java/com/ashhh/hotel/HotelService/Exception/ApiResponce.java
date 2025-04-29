package com.ashhh.hotel.HotelService.Exception;

import lombok.*;
import org.springframework.http.HttpStatus;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponce {

    private String message;
    private boolean success;
    private HttpStatus status;

}
