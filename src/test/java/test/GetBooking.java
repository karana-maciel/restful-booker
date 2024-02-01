package test;

import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static util.StaticValue.PATH_BOOKING;

public class GetBooking extends BaseTest{

    @Test
    @DisplayName("Buscar reservas - 200")
    void getBookingSuccess() {
        Response response = restService.get(PATH_BOOKING);
        assertEquals(HttpStatus.SC_OK, response.statusCode());
    }

    @Test
    @DisplayName("Buscar reservas - 404")
    void getBookingFail() {
        Response response = restService.get("/bookingg");
        assertEquals(HttpStatus.SC_NOT_FOUND, response.statusCode());
    }
}

