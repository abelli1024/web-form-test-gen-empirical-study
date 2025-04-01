package mo.must.testcase.tourism;

import mo.must.base.BaseDTO;
import mo.must.base.BaseTest;
import org.junit.Before;
import org.junit.Test;


public class TourismWebTest extends BaseTest {

    private BaseDTO baseDTO;

    @Before
    public void init() {
        baseDTO = new BaseDTO();
        initBasicBaseDTO(baseDTO, "tourism_web");
    }

    @Test
    public void testStyle1ValidLogin() {
        String url = "http://127.0.0.1:8080/doLoginUI";
        dealTestValidStyle0(baseDTO, url);
    }


    @Test
    public void testStyle2ValidLogin() {
        String url = "http://127.0.0.1:8080/doLoginUI";
        dealTestValidStyle1(baseDTO, url);
    }


    @Test
    public void testStyle3ValidLogin() {
        String url = "http://127.0.0.1:8080/doLoginUI";
        dealTestValidStyle2(baseDTO, url);
    }


    @Test
    public void testStyle1ValidUserEdit() {
        String cookies = "JSESSIONID=f2cd6f6d-8494-4d7d-bf13-ab565a7acaf7";
        String url = "http://127.0.0.1:8080/user/doUserEditUI";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidUserEdit() {
        String cookies = "JSESSIONID=f2cd6f6d-8494-4d7d-bf13-ab565a7acaf7";
        String url = "http://127.0.0.1:8080/user/doUserEditUI";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidUserEdit() {
        String cookies = "JSESSIONID=f2cd6f6d-8494-4d7d-bf13-ab565a7acaf7";
        String url = "http://127.0.0.1:8080/user/doUserEditUI";
        dealTestValidStyle2(baseDTO, url, cookies);
    }



    @Test
    public void testStyle1ValidRoleEdit() {
        String cookies = "JSESSIONID=f2cd6f6d-8494-4d7d-bf13-ab565a7acaf7";
        String url = "http://127.0.0.1:8080/role/doRoleEditUI";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidRoleEdit() {
        String cookies = "JSESSIONID=f2cd6f6d-8494-4d7d-bf13-ab565a7acaf7";
        String url = "http://127.0.0.1:8080/role/doRoleEditUI";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidRoleEdit() {
        String cookies = "JSESSIONID=f2cd6f6d-8494-4d7d-bf13-ab565a7acaf7";
        String url = "http://127.0.0.1:8080/role/doRoleEditUI";
        dealTestValidStyle2(baseDTO, url, cookies);
    }


    @Test
    public void testStyle1ValidMenuEdit() {
        String cookies = "JSESSIONID=f2cd6f6d-8494-4d7d-bf13-ab565a7acaf7";
        String url = "http://127.0.0.1:8080/menu/doMenuEditUI";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidMenuEdit() {
        String cookies = "JSESSIONID=f2cd6f6d-8494-4d7d-bf13-ab565a7acaf7";
        String url = "http://127.0.0.1:8080/menu/doMenuEditUI";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidMenuEdit() {
        String cookies = "JSESSIONID=f2cd6f6d-8494-4d7d-bf13-ab565a7acaf7";
        String url = "http://127.0.0.1:8080/menu/doMenuEditUI";
        dealTestValidStyle2(baseDTO, url, cookies);
    }


    @Test
    public void testStyle1ValidDeptEdit() {
        String cookies = "JSESSIONID=f2cd6f6d-8494-4d7d-bf13-ab565a7acaf7";
        String url = "http://127.0.0.1:8080/dept/doDeptEditUI";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidDeptEdit() {
        String cookies = "JSESSIONID=f2cd6f6d-8494-4d7d-bf13-ab565a7acaf7";
        String url = "http://127.0.0.1:8080/dept/doDeptEditUI";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidDeptEdit() {
        String cookies = "JSESSIONID=f2cd6f6d-8494-4d7d-bf13-ab565a7acaf7";
        String url = "http://127.0.0.1:8080/dept/doDeptEditUI";
        dealTestValidStyle2(baseDTO, url, cookies);
    }
}
