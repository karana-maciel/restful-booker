package test;

import io.restassured.response.Response;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static util.StaticValue.PATH_BOOKING;
import static util.StaticValue.createRandomID;

public class GetBookingIds extends BaseTest{

//    @Test
//    @DisplayName("Buscar reserva pelo ID - 200")
//    void GetUsersSuccess() {
//        Response responseBooking = restService.get("/booking");
//        String bookingId = responseBooking.getBody().jsonPath().getString("bookingid[2]");
//        Response response = restService.get("/booking/" + bookingId);
//        assertEquals(HttpStatus.SC_OK, response.statusCode());
//    }

    @Test
    @DisplayName("Buscar reserva pelo ID - 200")
    void getBookingIdSuccess() {
//        pegar o tamanho e escolher um número aleatório de acordo com o size da lista
//        Response responseBooking = restService.get("/booking");
//
//        List<Integer> bookingIds = responseBooking.getBody().jsonPath().getList("bookingid");
//
//         não depende do get lista, pegar o tamanho e escolher um número aleatório de acordo com o size da lista
//        String randomBookingId = createRandomID();

        Response response = restService.get(PATH_BOOKING + createRandomID());
        assertEquals(HttpStatus.SC_OK, response.statusCode());
       // assertEquals(not null); para cada campo da resposta
    }


    @Test
    @DisplayName("Buscar reserva pelo ID - 404")
    void getBookingIdFail() {
        Response response = restService.get(PATH_BOOKING + null);
        assertEquals(HttpStatus.SC_NOT_FOUND, response.statusCode());
    }
}
