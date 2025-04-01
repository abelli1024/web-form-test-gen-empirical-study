package mo.must.testcase.bookinghouse;

import mo.must.base.BaseDTO;
import mo.must.base.BaseTest;
import org.junit.Before;
import org.junit.Test;


public class BookinghouseWebTest extends BaseTest {

    private BaseDTO baseDTO;

    @Before
    public void init() {
        baseDTO = new BaseDTO();
        initBasicBaseDTO(baseDTO, "booking_house_web");
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
    public void testStyle1ValidAdmin2AddCustomer() {
        String cookies = "JSESSIONID=F666025C3165EA54DA3B9D39D1E92280";
        String url = "http://127.0.0.1:8080/admin/add-customer";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidAdmin2AddCustomer() {
        String cookies = "JSESSIONID=F666025C3165EA54DA3B9D39D1E92280";
        String url = "http://127.0.0.1:8080/admin/add-customer";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidAdmin2AddCustomer() {
        String cookies = "JSESSIONID=F666025C3165EA54DA3B9D39D1E92280";
        String url = "http://127.0.0.1:8080/admin/add-customer";
        dealTestValidStyle2(baseDTO, url, cookies);
    }

}
