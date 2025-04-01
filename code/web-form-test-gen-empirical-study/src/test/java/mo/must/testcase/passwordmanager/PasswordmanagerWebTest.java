package mo.must.testcase.passwordmanager;

import mo.must.base.BaseDTO;
import mo.must.base.BaseTest;
import org.junit.Before;
import org.junit.Test;


public class PasswordmanagerWebTest extends BaseTest {

    private BaseDTO baseDTO;

    @Before
    public void init() {
        baseDTO = new BaseDTO();
        initBasicBaseDTO(baseDTO,  "password_manager_web");
    }

    @Test
    public void testStyle1ValidLogin() {
        String url = "http://127.0.0.1:8080/auth/login";
        dealTestValidStyle0(baseDTO, url);
    }


    @Test
    public void testStyle2ValidLogin() {
        String url = "http://127.0.0.1:8080/auth/login";
        dealTestValidStyle1(baseDTO, url);
    }


    @Test
    public void testStyle3ValidLogin() {
        String url = "http://127.0.0.1:8080/auth/login";
        dealTestValidStyle2(baseDTO, url);
    }


    @Test
    public void testStyle1ValidRegister() {
        String url = "http://127.0.0.1:8080/auth/registration";
        dealTestValidStyle0(baseDTO, url);
    }


    @Test
    public void testStyle2ValidRegister() {
        String url = "http://127.0.0.1:8080/auth/registration";
        dealTestValidStyle1(baseDTO, url);
    }


    @Test
    public void testStyle3ValidRegister() {
        String url = "http://127.0.0.1:8080/auth/registration";
        dealTestValidStyle2(baseDTO, url);
    }


    @Test
    public void testStyle1ValidEditPeople() {
        String cookies = "JSESSIONID=BE80AAD4CDB44845809E3AFA4D84AA69";
        String url = "http://127.0.0.1:8080/people/1";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidEditPeople() {
        String cookies = "JSESSIONID=BE80AAD4CDB44845809E3AFA4D84AA69";
        String url = "http://127.0.0.1:8080/people/1";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidEditPeople() {
        String cookies = "JSESSIONID=BE80AAD4CDB44845809E3AFA4D84AA69";
        String url = "http://127.0.0.1:8080/people/1";
        dealTestValidStyle2(baseDTO, url, cookies);
    }


    @Test
    public void testStyle1ValidNewWebInfo() {
        String cookies = "JSESSIONID=62165F76CE5EA3F6990529461D204272";
        String url = "http://127.0.0.1:8080/web-info/new";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidNewWebInfo() {
        String cookies = "JSESSIONID=62165F76CE5EA3F6990529461D204272";
        String url = "http://127.0.0.1:8080/web-info/new";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidNewWebInfo() {
        String cookies = "JSESSIONID=62165F76CE5EA3F6990529461D204272";
        String url = "http://127.0.0.1:8080/web-info/new";
        dealTestValidStyle2(baseDTO, url, cookies);
    }


    @Test
    public void testStyle1ValidEditWebInfo() {
        String cookies = "JSESSIONID=62165F76CE5EA3F6990529461D204272";
        String url = "http://127.0.0.1:8080/web-info/1";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidEditWebInfo() {
        String cookies = "JSESSIONID=62165F76CE5EA3F6990529461D204272";
        String url = "http://127.0.0.1:8080/web-info/1";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidEditWebInfo() {
        String cookies = "JSESSIONID=62165F76CE5EA3F6990529461D204272";
        String url = "http://127.0.0.1:8080/web-info/1";
        dealTestValidStyle2(baseDTO, url, cookies);
    }

}
