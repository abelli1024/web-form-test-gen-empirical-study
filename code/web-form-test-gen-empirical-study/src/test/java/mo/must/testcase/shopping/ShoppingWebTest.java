package mo.must.testcase.shopping;

import mo.must.base.BaseDTO;
import mo.must.base.BaseTest;
import org.junit.Before;
import org.junit.Test;


public class ShoppingWebTest extends BaseTest {

    private BaseDTO baseDTO;

    @Before
    public void init() {
        baseDTO = new BaseDTO();
        initBasicBaseDTO(baseDTO, "shopping_web");
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
    public void testStyle1ValidAmendInfo() {
        String cookies = "JSESSIONID=9C8CA706AC8C18ACE0F7ACA511C1A6FD";
        String url = "http://127.0.0.1:8080/amend_info";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidAmendInfo() {
        String cookies = "JSESSIONID=9C8CA706AC8C18ACE0F7ACA511C1A6FD";
        String url = "http://127.0.0.1:8080/amend_info";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidAmendInfo() {
        String cookies = "JSESSIONID=9C8CA706AC8C18ACE0F7ACA511C1A6FD";
        String url = "http://127.0.0.1:8080/amend_info";
        dealTestValidStyle2(baseDTO, url, cookies);
    }


    @Test
    public void testStyle1ValidAddItem() {
        String cookies = "JSESSIONID=99F202A80F769C0F1C0140680A67E68B";
        String url = "http://127.0.0.1:8080/control";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidAddItem() {
        String cookies = "JSESSIONID=99F202A80F769C0F1C0140680A67E68B";
        String url = "http://127.0.0.1:8080/control";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidAddItem() {
        String cookies = "JSESSIONID=99F202A80F769C0F1C0140680A67E68B";
        String url = "http://127.0.0.1:8080/control";
        dealTestValidStyle2(baseDTO, url, cookies);
    }

    @Test
    public void testStyle1ValidSearchItem() {
        String cookies = "JSESSIONID=0F9A4253903E5C7D6A5B9250F1EAE4B8";
        String url = "http://127.0.0.1:8080/search";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidSearchItem() {
        String cookies = "JSESSIONID=0F9A4253903E5C7D6A5B9250F1EAE4B8";
        String url = "http://127.0.0.1:8080/search";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidSearchItem() {
        String cookies = "JSESSIONID=0F9A4253903E5C7D6A5B9250F1EAE4B8";
        String url = "http://127.0.0.1:8080/search";
        dealTestValidStyle2(baseDTO, url, cookies);
    }

}
