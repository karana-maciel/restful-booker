package test;

import dto.BookingDTO;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreateBooking extends BaseTest{

    @Test
    @DisplayName("Cadastro da reserva com sucesso - 200")
    void postCreateBooking() {
        BookingDTO requestBody = createBookingReq();
        Response response = restService.post(requestBody);
        assertEquals(HttpStatus.SC_OK, response.statusCode());
        // fazer mais assertivas
        // assertEquals(not null); para cada campo da resposta
    }

    //poderia colocar em uma classe de métodos = restfulservice
    public BookingDTO createBookingReq() {
        return new BookingDTO(
                //tentar criar com faker
                "Teste",
                "Silva",
                200,
                true,
                new BookingDTO.BookingDates("2018-01-01", "2019-01-01"),
                "Breakfast");
    }
}
