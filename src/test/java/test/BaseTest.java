package test;

import org.junit.jupiter.api.BeforeEach;
import service.RestfulService;

public class BaseTest {
    public RestfulService restService;

    @BeforeEach
    public void setUp(){
        restService  = new RestfulService();
    }
}
