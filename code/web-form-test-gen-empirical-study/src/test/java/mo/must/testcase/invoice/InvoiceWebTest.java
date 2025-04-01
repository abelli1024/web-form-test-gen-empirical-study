package mo.must.testcase.invoice;

import mo.must.base.BaseDTO;
import mo.must.base.BaseTest;
import org.junit.Before;
import org.junit.Test;


public class InvoiceWebTest extends BaseTest {

    private BaseDTO baseDTO;

    @Before
    public void init() {
        baseDTO = new BaseDTO();
        initBasicBaseDTO(baseDTO, "invoice_web");
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
    public void testStyle1ValidInvoiceForm() {
        String cookies = "JSESSIONID=DD5FC491E9233C0938F4BEA1D69ECA42";
        String url = "http://127.0.0.1:8080/invoices/form/1";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidInvoiceForm() {
        String cookies = "JSESSIONID=DD5FC491E9233C0938F4BEA1D69ECA42";
        String url = "http://127.0.0.1:8080/invoices/form/1";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidInvoiceForm() {
        String cookies = "JSESSIONID=DD5FC491E9233C0938F4BEA1D69ECA42";
        String url = "http://127.0.0.1:8080/invoices/form/1";
        dealTestValidStyle2(baseDTO, url, cookies);
    }


    @Test
    public void testStyle1ValidForm() {
        String cookies = "JSESSIONID=DD5FC491E9233C0938F4BEA1D69ECA42";
        String url = "http://127.0.0.1:8080/form";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidForm() {
        String cookies = "JSESSIONID=DD5FC491E9233C0938F4BEA1D69ECA42";
        String url = "http://127.0.0.1:8080/form";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidForm() {
        String cookies = "JSESSIONID=DD5FC491E9233C0938F4BEA1D69ECA42";
        String url = "http://127.0.0.1:8080/form";
        dealTestValidStyle2(baseDTO, url, cookies);
    }


    @Test
    public void testStyle1ValidEditForm() {
        String cookies = "JSESSIONID=DD5FC491E9233C0938F4BEA1D69ECA42";
        String url = "http://127.0.0.1:8080/form/1";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidEditForm() {
        String cookies = "JSESSIONID=DD5FC491E9233C0938F4BEA1D69ECA42";
        String url = "http://127.0.0.1:8080/form/1";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidEditForm() {
        String cookies = "JSESSIONID=DD5FC491E9233C0938F4BEA1D69ECA42";
        String url = "http://127.0.0.1:8080/form/1";
        dealTestValidStyle2(baseDTO, url, cookies);
    }
}
