package mo.must.testcase.drug;

import mo.must.base.BaseDTO;
import mo.must.base.BaseTest;
import org.junit.Before;
import org.junit.Test;


public class DrugWebTest extends BaseTest {

    private BaseDTO baseDTO;

    @Before
    public void init() {
        baseDTO = new BaseDTO();
        initBasicBaseDTO(baseDTO, "drug_web");
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
    public void testStyle1ValidAdminEdit() {
        String cookies="JSESSIONID=EA616DD2DBF1E6C26647106EDC315288";
        String url = "http://127.0.0.1:8080/admin/adminEdit?id=1";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidAdminEdit() {
        String cookies="JSESSIONID=EA616DD2DBF1E6C26647106EDC315288";
        String url = "http://127.0.0.1:8080/admin/adminEdit?id=1";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidAdminEdit() {
        String cookies="JSESSIONID=EA616DD2DBF1E6C26647106EDC315288";
        String url = "http://127.0.0.1:8080/admin/adminEdit?id=1";
        dealTestValidStyle2(baseDTO, url, cookies);
    }


    @Test
    public void testStyle1ValidMedicineAdd() {
        String cookies="JSESSIONID=EA616DD2DBF1E6C26647106EDC315288";
        String url = "http://127.0.0.1:8080/detail/toAdd";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidMedicineAdd() {
        String cookies="JSESSIONID=EA616DD2DBF1E6C26647106EDC315288";
        String url = "http://127.0.0.1:8080/detail/toAdd";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidMedicineAdd() {
        String cookies="JSESSIONID=EA616DD2DBF1E6C26647106EDC315288";
        String url = "http://127.0.0.1:8080/detail/toAdd";
        dealTestValidStyle2(baseDTO, url, cookies);
    }


    @Test
    public void testStyle1ValidMedicineEdit() {
        String cookies="JSESSIONID=EA616DD2DBF1E6C26647106EDC315288";
        String url = "http://127.0.0.1:8080/detail/toEdit?id=1";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidMedicineEdit() {
        String cookies="JSESSIONID=EA616DD2DBF1E6C26647106EDC315288";
        String url = "http://127.0.0.1:8080/detail/toEdit?id=1";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidMedicineEdit() {
        String cookies="JSESSIONID=EA616DD2DBF1E6C26647106EDC315288";
        String url = "http://127.0.0.1:8080/detail/toEdit?id=1";
        dealTestValidStyle2(baseDTO, url, cookies);
    }
}
