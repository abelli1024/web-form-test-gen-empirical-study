package mo.must.testcase.itassets;

import mo.must.base.BaseDTO;
import mo.must.base.BaseTest;
import org.junit.Before;
import org.junit.Test;


public class ItassetsWebTest extends BaseTest {

    private BaseDTO baseDTO;

    @Before
    public void init() {
        baseDTO = new BaseDTO();
        initBasicBaseDTO(baseDTO,  "it_assets_web");
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
    public void testStyle1ValidCategoryCreate() {
        String cookies = "JSESSIONID=1A1C5B3BEFF8F23A4C9E45FF3C01F131";
        String url = "http://127.0.0.1:8080/category/create";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidCategoryCreate() {
        String cookies = "JSESSIONID=1A1C5B3BEFF8F23A4C9E45FF3C01F131";
        String url = "http://127.0.0.1:8080/category/create";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidCategoryCreate() {
        String cookies = "JSESSIONID=1A1C5B3BEFF8F23A4C9E45FF3C01F131";
        String url = "http://127.0.0.1:8080/category/create";
        dealTestValidStyle2(baseDTO, url, cookies);
    }


    @Test
    public void testStyle1ValidLaptopCreate() {
        String cookies = "JSESSIONID=141D5F16F9A6ED9D6C80CD51C897A977";
        String url = "http://127.0.0.1:8080/laptop/create";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidLaptopCreate() {
        String cookies = "JSESSIONID=141D5F16F9A6ED9D6C80CD51C897A977";
        String url = "http://127.0.0.1:8080/laptop/create";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidLaptopCreate() {
        String cookies = "JSESSIONID=141D5F16F9A6ED9D6C80CD51C897A977";
        String url = "http://127.0.0.1:8080/laptop/create";
        dealTestValidStyle2(baseDTO, url, cookies);
    }


    @Test
    public void testStyle1ValidModelCreate() {
        String cookies = "JSESSIONID=1A1C5B3BEFF8F23A4C9E45FF3C01F131";
        String url = "http://127.0.0.1:8080/model/create";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidModelCreate() {
        String cookies = "JSESSIONID=1A1C5B3BEFF8F23A4C9E45FF3C01F131";
        String url = "http://127.0.0.1:8080/model/create";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidModelCreate() {
        String cookies = "JSESSIONID=1A1C5B3BEFF8F23A4C9E45FF3C01F131";
        String url = "http://127.0.0.1:8080/model/create";
        dealTestValidStyle2(baseDTO, url, cookies);
    }


    @Test
    public void testStyle1ValidSupplierCreate() {
        String cookies = "JSESSIONID=1A1C5B3BEFF8F23A4C9E45FF3C01F131";
        String url = "http://127.0.0.1:8080/supplier/create";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidSupplierCreate() {
        String cookies = "JSESSIONID=1A1C5B3BEFF8F23A4C9E45FF3C01F131";
        String url = "http://127.0.0.1:8080/supplier/create";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidSupplierCreate() {
        String cookies = "JSESSIONID=1A1C5B3BEFF8F23A4C9E45FF3C01F131";
        String url = "http://127.0.0.1:8080/supplier/create";
        dealTestValidStyle2(baseDTO, url, cookies);
    }
}
