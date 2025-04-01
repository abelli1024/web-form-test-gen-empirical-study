package mo.must.testcase.erp;

import mo.must.base.BaseDTO;
import mo.must.base.BaseTest;
import org.junit.Before;
import org.junit.Test;


public class ErpWebTest extends BaseTest {

    private BaseDTO baseDTO;

    @Before
    public void init() {
        baseDTO = new BaseDTO();
        initBasicBaseDTO(baseDTO,  "erp_web");
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
    public void testStyle1ValidTagsNew() {
        String cookies="JSESSIONID=13414CBA698F127E8416A520990A9BA2";
        String url = "http://127.0.0.1:8080/tags/new";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidTagsNew() {
        String cookies="JSESSIONID=13414CBA698F127E8416A520990A9BA2";
        String url = "http://127.0.0.1:8080/tags/new";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidTagsNew() {
        String cookies="JSESSIONID=13414CBA698F127E8416A520990A9BA2";
        String url = "http://127.0.0.1:8080/tags/new";
        dealTestValidStyle2(baseDTO, url, cookies);
    }


    @Test
    public void testStyle1ValidContractsNew() {
        String cookies="JSESSIONID=13414CBA698F127E8416A520990A9BA2";
        String url = "http://127.0.0.1:8080/contracts/new";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidContractsNew() {
        String cookies="JSESSIONID=13414CBA698F127E8416A520990A9BA2";
        String url = "http://127.0.0.1:8080/contracts/new";
        dealTestValidStyle1(baseDTO, url, cookies);
    }

    @Test
    public void testStyle3ValidContractsNew() {
        String cookies="JSESSIONID=13414CBA698F127E8416A520990A9BA2";
        String url = "http://127.0.0.1:8080/contracts/new";
        dealTestValidStyle2(baseDTO, url, cookies);
    }

    @Test
    public void testStyle1ValidCustomersNew() {
        String cookies="JSESSIONID=13414CBA698F127E8416A520990A9BA2";
        String url = "http://127.0.0.1:8080/customers/new";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidCustomersNew() {
        String cookies="JSESSIONID=13414CBA698F127E8416A520990A9BA2";
        String url = "http://127.0.0.1:8080/customers/new";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidCustomersNew() {
        String cookies="JSESSIONID=13414CBA698F127E8416A520990A9BA2";
        String url = "http://127.0.0.1:8080/customers/new";
        dealTestValidStyle2(baseDTO, url, cookies);
    }


    @Test
    public void testStyle1ValidOrdersNew() {
        String cookies="JSESSIONID=13414CBA698F127E8416A520990A9BA2";
        String url = "http://127.0.0.1:8080/orders/new";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidOrdersNew() {
        String cookies="JSESSIONID=13414CBA698F127E8416A520990A9BA2";
        String url = "http://127.0.0.1:8080/orders/new";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidOrdersNew() {
        String cookies="JSESSIONID=13414CBA698F127E8416A520990A9BA2";
        String url = "http://127.0.0.1:8080/orders/new";
        dealTestValidStyle2(baseDTO, url, cookies);
    }



    @Test
    public void testStyle1ValidServicesNew() {
        String cookies="JSESSIONID=13414CBA698F127E8416A520990A9BA2";
        String url = "http://127.0.0.1:8080/services/new";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidServicesNew() {
        String cookies="JSESSIONID=13414CBA698F127E8416A520990A9BA2";
        String url = "http://127.0.0.1:8080/services/new";
        dealTestValidStyle1(baseDTO, url, cookies);
    }

    @Test
    public void testStyle3ValidServicesNew() {
        String cookies="JSESSIONID=13414CBA698F127E8416A520990A9BA2";
        String url = "http://127.0.0.1:8080/services/new";
        dealTestValidStyle2(baseDTO, url, cookies);
    }


    @Test
    public void testStyle1ValidSuppliersNew() {
        String cookies="JSESSIONID=769BD7C23EBDE33647F950B50100A169";
        String url = "http://127.0.0.1:8080/suppliers/new";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidSuppliersNew() {
        String cookies="JSESSIONID=769BD7C23EBDE33647F950B50100A169";
        String url = "http://127.0.0.1:8080/suppliers/new";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidSuppliersNew() {
        String cookies="JSESSIONID=769BD7C23EBDE33647F950B50100A169";
        String url = "http://127.0.0.1:8080/suppliers/new";
        dealTestValidStyle2(baseDTO, url, cookies);
    }

}
