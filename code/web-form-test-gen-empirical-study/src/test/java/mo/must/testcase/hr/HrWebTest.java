package mo.must.testcase.hr;

import mo.must.base.BaseDTO;
import mo.must.base.BaseTest;
import org.junit.Before;
import org.junit.Test;


public class HrWebTest extends BaseTest {

    private BaseDTO baseDTO;

    @Before
    public void init() {
        baseDTO = new BaseDTO();
        initBasicBaseDTO(baseDTO,  "hr_web");
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
        String url = "http://127.0.0.1:8080/user/signup";
        dealTestValidStyle0(baseDTO, url);
    }


    @Test
    public void testStyle2ValidRegister() {
        String url = "http://127.0.0.1:8080/user/signup";
        dealTestValidStyle1(baseDTO, url);
    }


    @Test
    public void testStyle3ValidRegister() {
        String url = "http://127.0.0.1:8080/user/signup";
        dealTestValidStyle2(baseDTO, url);
    }


    @Test
    public void testStyle1ValidEditUser() {
        String cookies = "JSESSIONID=E95996527E53EE92C505E4F1E6E0D1FB";
        String url = "http://127.0.0.1:8080/user/detail/user@co.jp";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidEditUser() {
        String cookies = "JSESSIONID=E95996527E53EE92C505E4F1E6E0D1FB";
        String url = "http://127.0.0.1:8080/user/detail/user@co.jp";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidEditUser() {
        String cookies = "JSESSIONID=E95996527E53EE92C505E4F1E6E0D1FB";
        String url = "http://127.0.0.1:8080/user/detail/user@co.jp";
        dealTestValidStyle2(baseDTO, url, cookies);
    }

}
