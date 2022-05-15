package com.pytha.springjpa.service;

import com.pytha.springjpa.dto.BookingRequest;
import com.pytha.springjpa.dto.BookingResponse;

public interface BookingService {
    public BookingResponse bookingTicket(BookingRequest bookingRequest);
}
