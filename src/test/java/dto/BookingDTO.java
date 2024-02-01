package dto;

import java.time.LocalDate;
import java.util.Date;

public record BookingDTO(
        String firstname,
        String lastname,
        int totalprice,
        Boolean depositpaid,
        BookingDates bookingdates,
        String additionalneeds
) {
    public record BookingDates(String checkin, String checkout) {}
}

