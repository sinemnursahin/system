package com.hotelprject.hotelproject.model.dto;

import com.hotelprject.hotelproject.model.Room;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReservationDto {

    private Long id;
    private String fullName;
    private Room room;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private Double totalPrice;
    private String status;
}
