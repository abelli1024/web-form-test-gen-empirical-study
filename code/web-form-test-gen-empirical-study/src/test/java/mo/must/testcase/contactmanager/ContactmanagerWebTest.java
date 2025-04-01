package mo.must.testcase.contactmanager;

import mo.must.base.BaseDTO;
import mo.must.base.BaseTest;
import org.junit.Before;
import org.junit.Test;


public class ContactmanagerWebTest extends BaseTest {

    private BaseDTO baseDTO;

    @Before
    public void init() {
        baseDTO = new BaseDTO();
        initBasicBaseDTO(baseDTO,  "contact_manager_web");
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
    public void testStyle1ValidEditprofile() {
        String cookies = "JSESSIONID=BE53AEFB94947477D06071176F3F058C";
        String url = "http://127.0.0.1:8080/user/johndoe123/profile";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidEditprofile() {
        String cookies = "JSESSIONID=BE53AEFB94947477D06071176F3F058C";
        String url = "http://127.0.0.1:8080/user/johndoe123/profile";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidEditprofile() {
        String cookies = "JSESSIONID=BE53AEFB94947477D06071176F3F058C";
        String url = "http://127.0.0.1:8080/user/johndoe123/profile";
        dealTestValidStyle2(baseDTO, url, cookies);
    }


    @Test
    public void testStyle1ValidAddcontacts() {
        String cookies = "JSESSIONID=BE53AEFB94947477D06071176F3F058C";
        String url = "http://127.0.0.1:8080/user/johndoe123/addcontacts";
        dealTestValidStyle0(baseDTO, url, cookies);
    }

    @Test
    public void testStyle2ValidAddcontacts() {
        String cookies = "JSESSIONID=BE53AEFB94947477D06071176F3F058C";
        String url = "http://127.0.0.1:8080/user/johndoe123/addcontacts";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidAddcontacts() {
        String cookies = "JSESSIONID=BE53AEFB94947477D06071176F3F058C";
        String url = "http://127.0.0.1:8080/user/johndoe123/addcontacts";
        dealTestValidStyle2(baseDTO, url, cookies);
    }

}
