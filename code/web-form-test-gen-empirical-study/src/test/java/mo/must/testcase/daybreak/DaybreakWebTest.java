package mo.must.testcase.daybreak;

import mo.must.base.BaseDTO;
import mo.must.base.BaseTest;
import org.junit.Before;
import org.junit.Test;


public class DaybreakWebTest extends BaseTest {

    private BaseDTO baseDTO;

    @Before
    public void init() {
        baseDTO = new BaseDTO();
        initBasicBaseDTO(baseDTO, "daybreak_web");
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
        String url = "http://127.0.0.1:8080/register.html";
        dealTestValidStyle0(baseDTO, url);
    }


    @Test
    public void testStyle2ValidRegister() {
        String url = "http://127.0.0.1:8080/register.html";
        dealTestValidStyle1(baseDTO, url);
    }


    @Test
    public void testStyle3ValidRegister() {
        String url = "http://127.0.0.1:8080/register.html";
        dealTestValidStyle2(baseDTO, url);
    }

}
