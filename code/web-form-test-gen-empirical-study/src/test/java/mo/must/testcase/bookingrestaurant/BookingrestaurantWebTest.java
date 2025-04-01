package mo.must.testcase.bookingrestaurant;

import mo.must.base.BaseDTO;
import mo.must.base.BaseTest;
import org.junit.Before;
import org.junit.Test;


public class BookingrestaurantWebTest extends BaseTest {

    private BaseDTO baseDTO;

    @Before
    public void init() {
        baseDTO = new BaseDTO();
        initBasicBaseDTO(baseDTO,  "booking_restaurant_web");
    }

    @Test
    public void testStyle1ValidLogin() {
        String url = "http://127.0.0.1:8080/login";
        dealTestValidStyle0(baseDTO, url);
    }

    @Test
    public void testStyle2ValidLogin() {
        String url = "http://127.0.0.1:8080/login";
        dealTestValidStyle1(baseDTO, url);
    }

    @Test
    public void testStyle3ValidLogin() {
        String url = "http://127.0.0.1:8080/login";
        dealTestValidStyle2(baseDTO, url);
    }


    @Test
    public void testStyle1ValidRegister() {
        String url = "http://127.0.0.1:8080/register";
        dealTestValidStyle0(baseDTO, url);
    }


    @Test
    public void testStyle2ValidRegister() {
        String url = "http://127.0.0.1:8080/register";
        dealTestValidStyle1(baseDTO, url);
    }


    @Test
    public void testStyle3ValidRegister() {
        String url = "http://127.0.0.1:8080/register";
        dealTestValidStyle2(baseDTO, url);
    }


    @Test
    public void testStyle1ValidReservation() {
        String cookies = "JSESSIONID=DA6565F93A7F6F97EE31975F5EB231E4";
        String url = "http://127.0.0.1:8080/reservation";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidReservation() {
        String cookies = "JSESSIONID=DA6565F93A7F6F97EE31975F5EB231E4";
        String url = "http://127.0.0.1:8080/reservation";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidReservation() {
        String cookies = "JSESSIONID=DA6565F93A7F6F97EE31975F5EB231E4";
        String url = "http://127.0.0.1:8080/reservation";
        dealTestValidStyle2(baseDTO, url, cookies);
    }


    @Test
    public void testStyle1ValidAdminFood() {
        String cookies = "JSESSIONID=26BEF4BC3D9F19561E7CC9DEFEFB3478";
        String url = "http://127.0.0.1:8080/food";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidAdminFood() {
        String cookies = "JSESSIONID=26BEF4BC3D9F19561E7CC9DEFEFB3478";
        String url = "http://127.0.0.1:8080/food";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidAdminFood() {
        String cookies = "JSESSIONID=26BEF4BC3D9F19561E7CC9DEFEFB3478";
        String url = "http://127.0.0.1:8080/food";
        dealTestValidStyle2(baseDTO, url, cookies);
    }

}
