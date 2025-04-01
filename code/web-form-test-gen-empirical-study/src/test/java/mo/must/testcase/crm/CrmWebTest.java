package mo.must.testcase.crm;

import mo.must.base.BaseDTO;
import mo.must.base.BaseTest;
import org.junit.Before;
import org.junit.Test;


public class CrmWebTest extends BaseTest {

    private BaseDTO baseDTO;

    @Before
    public void init() {
        baseDTO = new BaseDTO();
        initBasicBaseDTO(baseDTO,  "crm_web");
    }

    @Test
    public void testStyle1ValidAddCustomer() {
        String url = "http://127.0.0.1:8080/customer/showForm";
        dealTestValidStyle0(baseDTO, url);
    }


    @Test
    public void testStyle2ValidAddCustomer() {
        String url = "http://127.0.0.1:8080/customer/showForm";
        dealTestValidStyle1(baseDTO, url);
    }

    @Test
    public void testStyle3ValidAddCustomer() {
        String url = "http://127.0.0.1:8080/customer/showForm";
        dealTestValidStyle2(baseDTO, url);
    }

}
