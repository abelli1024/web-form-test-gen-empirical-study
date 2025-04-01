package mo.must.testcase.flight;

import mo.must.base.BaseDTO;
import mo.must.base.BaseTest;
import org.junit.Before;
import org.junit.Test;


public class FlightWebTest extends BaseTest {

    private BaseDTO baseDTO;

    @Before
    public void init() {
        baseDTO = new BaseDTO();
        initBasicBaseDTO(baseDTO,  "flight_web");
    }

    @Test
    public void testStyle1ValidLogin() {
        String url = "http://127.0.0.1:8080/";
        dealTestValidStyle0(baseDTO, url);
    }


    @Test
    public void testStyle2ValidLogin() {
        String url = "http://127.0.0.1:8080/";
        dealTestValidStyle1(baseDTO, url);
    }


    @Test
    public void testStyle3ValidLogin() {
        String url = "http://127.0.0.1:8080/";
        dealTestValidStyle2(baseDTO, url);
    }


    @Test
    public void testStyle1ValidRegister() {
        String url = "http://127.0.0.1:8080/signup";
        dealTestValidStyle0(baseDTO, url);
    }


    @Test
    public void testStyle2ValidRegister() {
        String url = "http://127.0.0.1:8080/signup";
        dealTestValidStyle1(baseDTO, url);
    }


    @Test
    public void testStyle3ValidRegister() {
        String url = "http://127.0.0.1:8080/signup";
        dealTestValidStyle2(baseDTO, url);
    }


    @Test
    public void testStyle1ValidAddFlight() {
        String cookies="JSESSIONID=5DCDD50812345784CA41EEBD307F51DC";
        String url = "http://127.0.0.1:8080/addFlight";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidAddFlight() {
        String cookies="JSESSIONID=5DCDD50812345784CA41EEBD307F51DC";
        String url = "http://127.0.0.1:8080/addFlight";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidAddFlight() {
        String cookies="JSESSIONID=5DCDD50812345784CA41EEBD307F51DC";
        String url = "http://127.0.0.1:8080/addFlight";
        dealTestValidStyle2(baseDTO, url, cookies);
    }


    @Test
    public void testStyle1ValidUpdateFlight() {
        String cookies="JSESSIONID=5DCDD50812345784CA41EEBD307F51DC";
        String url = "http://127.0.0.1:8080/updateFlight";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidUpdateFlight() {
        String cookies="JSESSIONID=5DCDD50812345784CA41EEBD307F51DC";
        String url = "http://127.0.0.1:8080/updateFlight";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidUpdateFlight() {
        String cookies="JSESSIONID=5DCDD50812345784CA41EEBD307F51DC";
        String url = "http://127.0.0.1:8080/updateFlight";
        dealTestValidStyle2(baseDTO, url, cookies);
    }


    @Test
    public void testStyle1ValidAddRoute() {
        String cookies="JSESSIONID=5DCDD50812345784CA41EEBD307F51DC";
        String url = "http://127.0.0.1:8080/addRoute";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidAddRoute() {
        String cookies="JSESSIONID=5DCDD50812345784CA41EEBD307F51DC";
        String url = "http://127.0.0.1:8080/addRoute";
        dealTestValidStyle1(baseDTO, url, cookies);
    }

    @Test
    public void testStyle3ValidAddRoute() {
        String cookies="JSESSIONID=5DCDD50812345784CA41EEBD307F51DC";
        String url = "http://127.0.0.1:8080/addRoute";
        dealTestValidStyle2(baseDTO, url, cookies);
    }


    @Test
    public void testStyle1ValidUpdateRoute() {
        String cookies="JSESSIONID=5DCDD50812345784CA41EEBD307F51DC";
        String url = "http://127.0.0.1:8080/updateRoute";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidUpdateRoute() {
        String cookies="JSESSIONID=5DCDD50812345784CA41EEBD307F51DC";
        String url = "http://127.0.0.1:8080/updateRoute";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidUpdateRoute() {
        String cookies="JSESSIONID=5DCDD50812345784CA41EEBD307F51DC";
        String url = "http://127.0.0.1:8080/updateRoute";
        dealTestValidStyle2(baseDTO, url, cookies);
    }


    @Test
    public void testStyle1ValidAddSchedule() {
        String cookies="JSESSIONID=5DCDD50812345784CA41EEBD307F51DC";
        String url = "http://127.0.0.1:8080/addSchedule";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidAddSchedule() {
        String cookies="JSESSIONID=5DCDD50812345784CA41EEBD307F51DC";
        String url = "http://127.0.0.1:8080/addSchedule";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidAddSchedule() {
        String cookies="JSESSIONID=5DCDD50812345784CA41EEBD307F51DC";
        String url = "http://127.0.0.1:8080/addSchedule";
        dealTestValidStyle2(baseDTO, url, cookies);
    }


    @Test
    public void testStyle1ValidUpdateSchedule() {
        String cookies="JSESSIONID=5DCDD50812345784CA41EEBD307F51DC";
        String url = "http://127.0.0.1:8080/updateSchedule";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidUpdateSchedule() {
        String cookies="JSESSIONID=5DCDD50812345784CA41EEBD307F51DC";
        String url = "http://127.0.0.1:8080/updateSchedule";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidUpdateSchedule() {
        String cookies="JSESSIONID=5DCDD50812345784CA41EEBD307F51DC";
        String url = "http://127.0.0.1:8080/updateSchedule";
        dealTestValidStyle2(baseDTO, url, cookies);
    }


    @Test
    public void testStyle1ValidAddReservation() {
        String cookies="JSESSIONID=5DCDD50812345784CA41EEBD307F51DC";
        String url = "http://127.0.0.1:8080/addReservation?journeyDate=2023-12-11&bookingDate=2023-12-11&fare=10&schedule_id=1";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidAddReservation() {
        String cookies="JSESSIONID=5DCDD50812345784CA41EEBD307F51DC";
        String url = "http://127.0.0.1:8080/addReservation?journeyDate=2023-12-11&bookingDate=2023-12-11&fare=10&schedule_id=1";
        dealTestValidStyle1(baseDTO, url, cookies);
    }



    @Test
    public void testStyle3ValidAddReservation() {
        String cookies="JSESSIONID=5DCDD50812345784CA41EEBD307F51DC";
        String url = "http://127.0.0.1:8080/addReservation?journeyDate=2023-12-11&bookingDate=2023-12-11&fare=10&schedule_id=1";
        dealTestValidStyle2(baseDTO, url, cookies);
    }


    @Test
    public void testStyle1ValidPayments() {
        String cookies="JSESSIONID=5DCDD50812345784CA41EEBD307F51DC";
        String url = "http://127.0.0.1:8080/payments";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidAddPayments() {
        String cookies="JSESSIONID=5DCDD50812345784CA41EEBD307F51DC";
        String url = "http://127.0.0.1:8080/payments";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidAddPayments() {
        String cookies="JSESSIONID=5DCDD50812345784CA41EEBD307F51DC";
        String url = "http://127.0.0.1:8080/payments";
        dealTestValidStyle2(baseDTO, url, cookies);
    }

}
