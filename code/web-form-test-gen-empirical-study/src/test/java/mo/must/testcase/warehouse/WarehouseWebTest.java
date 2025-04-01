package mo.must.testcase.warehouse;

import mo.must.base.BaseDTO;
import mo.must.base.BaseTest;
import org.junit.Before;
import org.junit.Test;


public class WarehouseWebTest extends BaseTest {

    private BaseDTO baseDTO;

    @Before
    public void init() {
        baseDTO = new BaseDTO();
        initBasicBaseDTO(baseDTO, "warehouse_web");
    }

    @Test
    public void testStyle1ValidUomRegister() {
        String url = "http://127.0.0.1:8080/create";
        dealTestValidStyle0(baseDTO, url);
    }


    @Test
    public void testStyle2ValidUomRegister() {
        String url = "http://127.0.0.1:8080/create";
        dealTestValidStyle1(baseDTO, url);
    }


    @Test
    public void testStyle3ValidUomRegister() {
        String url = "http://127.0.0.1:8080/create";
        dealTestValidStyle2(baseDTO, url);
    }


    @Test
    public void testStyle1ValidEditUomRegister() {
        String url = "http://127.0.0.1:8080/edit/6";
        dealTestValidStyle0(baseDTO, url);
    }


    @Test
    public void testStyle2ValidEditUomRegister() {
        String url = "http://127.0.0.1:8080/edit/6";
        dealTestValidStyle1(baseDTO, url);
    }


    @Test
    public void testStyle3ValidEditUomRegister() {
        String url = "http://127.0.0.1:8080/edit/6";
        dealTestValidStyle2(baseDTO, url);
    }


    @Test
    public void testStyle1ValidPartRegister() {
        String url = "http://127.0.0.1:8080/part/register";
        dealTestValidStyle0(baseDTO, url);
    }


    @Test
    public void testStyle2ValidPartRegister() {
        String url = "http://127.0.0.1:8080/part/register";
        dealTestValidStyle1(baseDTO, url);
    }


    @Test
    public void testStyle3ValidPartRegister() {
        String url = "http://127.0.0.1:8080/part/register";
        dealTestValidStyle2(baseDTO, url);
    }


    @Test
    public void testStyle1ValidEditPartRegister() {
        String url = "http://127.0.0.1:8080/part/edit/9";
        dealTestValidStyle0(baseDTO, url);
    }


    @Test
    public void testStyle2ValidEditPartRegister() {
        String url = "http://127.0.0.1:8080/part/edit/9";
        dealTestValidStyle1(baseDTO, url);
    }


    @Test
    public void testStyle3ValidEditPartRegister() {
        String url = "http://127.0.0.1:8080/part/edit/9";
        dealTestValidStyle2(baseDTO, url);
    }


    @Test
    public void testStyle1ValidShipmentRegister() {
        String url = "http://127.0.0.1:8080/shipment/register";
        dealTestValidStyle0(baseDTO, url);
    }


    @Test
    public void testStyle2ValidShipmentRegister() {
        String url = "http://127.0.0.1:8080/shipment/register";
        dealTestValidStyle1(baseDTO, url);
    }


    @Test
    public void testStyle3ValidShipmentRegister() {
        String url = "http://127.0.0.1:8080/shipment/register";
        dealTestValidStyle2(baseDTO, url);
    }


    @Test
    public void testStyle1ValidEditShipmentRegister() {
        String url = "http://127.0.0.1:8080/shipment/edit/4";
        dealTestValidStyle0(baseDTO, url);
    }


    @Test
    public void testStyle2ValidEditShipmentRegister() {
        String url = "http://127.0.0.1:8080/shipment/edit/4";
        dealTestValidStyle1(baseDTO, url);
    }


    @Test
    public void testStyle3ValidEditShipmentRegister() {
        String url = "http://127.0.0.1:8080/shipment/edit/4";
        dealTestValidStyle2(baseDTO, url);
    }


    @Test
    public void testStyle1ValidWhuserRegister() {
        String url = "http://127.0.0.1:8080/whuser/register";
        dealTestValidStyle0(baseDTO, url);
    }


    @Test
    public void testStyle2ValidWhuserRegister() {
        String url = "http://127.0.0.1:8080/whuser/register";
        dealTestValidStyle1(baseDTO, url);
    }


    @Test
    public void testStyle3ValidWhuserRegister() {
        String url = "http://127.0.0.1:8080/whuser/register";
        dealTestValidStyle2(baseDTO, url);
    }


    @Test
    public void testStyle1ValidEditWhuserRegister() {
        String url = "http://127.0.0.1:8080/whuser/edit/12";
        dealTestValidStyle0(baseDTO, url);
    }


    @Test
    public void testStyle2ValidEditWhuserRegister() {
        String url = "http://127.0.0.1:8080/whuser/edit/12";
        dealTestValidStyle1(baseDTO, url);
    }


    @Test
    public void testStyle3ValidEditWhuserRegister() {
        String url = "http://127.0.0.1:8080/whuser/edit/12";
        dealTestValidStyle2(baseDTO, url);
    }


    @Test
    public void testStyle1ValidOrdermethodRegister() {
        String url = "http://127.0.0.1:8080/ordermethod/register";
        dealTestValidStyle0(baseDTO, url);
    }


    @Test
    public void testStyle2ValidOrdermethodRegister() {
        String url = "http://127.0.0.1:8080/ordermethod/register";
        dealTestValidStyle1(baseDTO, url);
    }

    @Test
    public void testStyle3ValidOrdermethodRegister() {
        String url = "http://127.0.0.1:8080/ordermethod/register";
        dealTestValidStyle2(baseDTO, url);
    }


    @Test
    public void testStyle1ValidEditOrdermethodRegister() {
        String url = "http://127.0.0.1:8080/ordermethod/edit/15";
        dealTestValidStyle0(baseDTO, url);
    }


    @Test
    public void testStyle2ValidEditOrdermethodRegister() {
        String url = "http://127.0.0.1:8080/ordermethod/edit/15";
        dealTestValidStyle1(baseDTO, url);
    }

    @Test
    public void testStyle3ValidEditOrdermethodRegister() {
        String url = "http://127.0.0.1:8080/ordermethod/edit/15";
        dealTestValidStyle2(baseDTO, url);
    }
}
