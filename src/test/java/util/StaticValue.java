package util;

public class StaticValue {
    public static String BASE_URL = "https://restful-booker.herokuapp.com";
    public static String PATH_BOOKING = "/booking/";

    //pode ser usado em vários testes e não é preciso copiar o mesmo código a cada teste
    public static String createRandomID () {
        return String.valueOf((int) (Math.random() * 20 ) + 1);
    }
}
