package mo.must.testcase.hotel;

import mo.must.base.BaseDTO;
import mo.must.base.BaseTest;
import org.junit.Before;
import org.junit.Test;


public class HotelWebTest extends BaseTest {

    private BaseDTO baseDTO;

    @Before
    public void init() {
        baseDTO = new BaseDTO();
        initBasicBaseDTO(baseDTO, "hotel_web");
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
        String url = "http://127.0.0.1:8080/registration";
        dealTestValidStyle0(baseDTO, url);
    }


    @Test
    public void testStyle2ValidRegister() {
        String url = "http://127.0.0.1:8080/registration";
        dealTestValidStyle1(baseDTO, url);
    }


    @Test
    public void testStyle3ValidRegister() {
        String url = "http://127.0.0.1:8080/registration";
        dealTestValidStyle2(baseDTO, url);
    }


    @Test
    public void testStyle1ValidAddUser() {
        String cookies="JSESSIONID=D81CE9FE5A857B3719EE2B296483FF46";
        String url = "http://127.0.0.1:8080/addUser";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidAddUser() {
        String cookies="JSESSIONID=D81CE9FE5A857B3719EE2B296483FF46";
        String url = "http://127.0.0.1:8080/addUser";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidAddUser() {
        String cookies="JSESSIONID=D81CE9FE5A857B3719EE2B296483FF46";
        String url = "http://127.0.0.1:8080/addUser";
        dealTestValidStyle2(baseDTO, url, cookies);
    }


    @Test
    public void testStyle1ValidEditUser() {
        String cookies="JSESSIONID=D81CE9FE5A857B3719EE2B296483FF46";
        String url = "http://127.0.0.1:8080/editUser.html?id=1";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidEditUser() {
        String cookies="JSESSIONID=D81CE9FE5A857B3719EE2B296483FF46";
        String url = "http://127.0.0.1:8080/editUser.html?id=1";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidEditUser() {
        String cookies="JSESSIONID=D81CE9FE5A857B3719EE2B296483FF46";
        String url = "http://127.0.0.1:8080/editUser.html?id=1";
        dealTestValidStyle2(baseDTO, url, cookies);
    }


    @Test
    public void testStyle1ValidUserList() {
        String cookies="JSESSIONID=D81CE9FE5A857B3719EE2B296483FF46";
        String url = "http://127.0.0.1:8080/userList.html";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidUserList() {
        String cookies="JSESSIONID=D81CE9FE5A857B3719EE2B296483FF46";
        String url = "http://127.0.0.1:8080/userList.html";
        dealTestValidStyle1(baseDTO, url, cookies);
    }

    @Test
    public void testStyle3ValidUserList() {
        String cookies="JSESSIONID=D81CE9FE5A857B3719EE2B296483FF46";
        String url = "http://127.0.0.1:8080/userList.html";
        dealTestValidStyle2(baseDTO, url, cookies);
    }

    @Test
    public void testStyle1ValidReservationFormUSR() {
        String cookies="JSESSIONID=D81CE9FE5A857B3719EE2B296483FF46";
        String url = "http://127.0.0.1:8080/reservationFormUSR.html";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidReservationFormUSR() {
        String cookies="JSESSIONID=D81CE9FE5A857B3719EE2B296483FF46";
        String url = "http://127.0.0.1:8080/reservationFormUSR.html";
        dealTestValidStyle1(baseDTO, url, cookies);
    }

    @Test
    public void testStyle3ValidReservationFormUSR() {
        String cookies="JSESSIONID=D81CE9FE5A857B3719EE2B296483FF46";
        String url = "http://127.0.0.1:8080/reservationFormUSR.html";
        dealTestValidStyle2(baseDTO, url, cookies);
    }

    @Test
    public void testStyle1ValidReservationFormADM() {
        String cookies="JSESSIONID=D81CE9FE5A857B3719EE2B296483FF46";
        String url = "http://127.0.0.1:8080/editReservationFormADM.html";
        dealTestValidStyle0(baseDTO, url, cookies);
    }

    @Test
    public void testStyle2ValidReservationFormADM() {
        String cookies="JSESSIONID=D81CE9FE5A857B3719EE2B296483FF46";
        String url = "http://127.0.0.1:8080/editReservationFormADM.html";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidReservationFormADM() {
        String cookies="JSESSIONID=D81CE9FE5A857B3719EE2B296483FF46";
        String url = "http://127.0.0.1:8080/editReservationFormADM.html";
        dealTestValidStyle2(baseDTO, url, cookies);
    }

    @Test
    public void testStyle1ValidReservationList() {
        String cookies="JSESSIONID=D81CE9FE5A857B3719EE2B296483FF46";
        String url = "http://127.0.0.1:8080/reservationList.html";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidReservationList() {
        String cookies="JSESSIONID=D81CE9FE5A857B3719EE2B296483FF46";
        String url = "http://127.0.0.1:8080/reservationList.html";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidReservationList() {
        String cookies="JSESSIONID=D81CE9FE5A857B3719EE2B296483FF46";
        String url = "http://127.0.0.1:8080/reservationList.html";
        dealTestValidStyle2(baseDTO, url, cookies);
    }

}
