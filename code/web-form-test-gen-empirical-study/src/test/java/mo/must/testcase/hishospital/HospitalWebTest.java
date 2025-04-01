package mo.must.testcase.hishospital;

import mo.must.base.BaseDTO;
import mo.must.base.BaseTest;
import org.junit.Before;
import org.junit.Test;


public class HospitalWebTest extends BaseTest {

    private BaseDTO baseDTO;

    @Before
    public void init() {
        baseDTO = new BaseDTO();
        initBasicBaseDTO(baseDTO, "hospital_web");
    }

    @Test
    public void testStyle1ValidLogin() {
        String url = "http://127.0.0.1:8080/login.html";
        dealTestValidStyle0(baseDTO, url);
    }

    @Test
    public void testStyle2ValidLogin() {
        String url = "http://127.0.0.1:8080/login.html";
        dealTestValidStyle1(baseDTO, url);
    }


    @Test
    public void testStyle3ValidLogin() {
        String url = "http://127.0.0.1:8080/login.html";
        dealTestValidStyle2(baseDTO, url);
    }


    @Test
    public void testStyle1ValidRegister() {
        String cookies = "JSESSIONID=A79DC3AEE1F7F0A2685A79902960A368";
        String url = "http://127.0.0.1:8080/register.html";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidRegister() {
        String cookies = "JSESSIONID=A79DC3AEE1F7F0A2685A79902960A368";
        String url = "http://127.0.0.1:8080/register.html";
        dealTestValidStyle1(baseDTO, url, cookies);
    }

    @Test
    public void testStyle3ValidRegister() {
        String cookies = "JSESSIONID=A79DC3AEE1F7F0A2685A79902960A368";
        String url = "http://127.0.0.1:8080/register.html";
        dealTestValidStyle2(baseDTO, url, cookies);
    }


    @Test
    public void testStyle1ValidEditMedicalrecord() {
        String cookies = "JSESSIONID=CB1A1EDBC162447C4102FFC15C9514DE";
        String url = "http://127.0.0.1:8080/MedicalRecord.html";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidEditMedicalrecord() {
        String cookies = "JSESSIONID=CB1A1EDBC162447C4102FFC15C9514DE";
        String url = "http://127.0.0.1:8080/MedicalRecord.html";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidEditMedicalrecord() {
        String cookies = "JSESSIONID=CB1A1EDBC162447C4102FFC15C9514DE";
        String url = "http://127.0.0.1:8080/MedicalRecord.html";
        dealTestValidStyle2(baseDTO, url, cookies);
    }

}
