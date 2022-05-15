package com.pytha.springjpa.service;

import com.pytha.springjpa.dto.BookingRequest;
import com.pytha.springjpa.dto.BookingResponse;
import com.pytha.springjpa.entities.Passenger;
import com.pytha.springjpa.entities.Payment_Info;
import com.pytha.springjpa.repository.PassengerRepository;
import com.pytha.springjpa.repository.Payment_Info_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImp implements BookingService{

    // call the repositories
    @Autowired
    private Payment_Info_Repository payment_info_repository;
    @Autowired
    private PassengerRepository passengerRepository;

    @Override
    public BookingResponse bookingTicket(BookingRequest bookingRequest) {
        //create bookingResponse object
        BookingResponse bookingResponse1 = null;
        Passenger passenger = passengerRepository.save(bookingRequest.getPassenger());
        //return passenger;

        //payment info
        Payment_Info payment_info = bookingRequest.getPayment_info();

        //simulate transaction failure due to insufficient balance in account;

    }

    //Booking method

}
