package mo.must.testcase.note;

import mo.must.base.BaseDTO;
import mo.must.base.BaseTest;
import org.junit.Before;
import org.junit.Test;


public class NoteWebTest extends BaseTest {

    private BaseDTO baseDTO;

    @Before
    public void init() {
        baseDTO = new BaseDTO();
        initBasicBaseDTO(baseDTO, "note_web");
    }


    @Test
    public void testStyle1ValidLogin() {
        String url = "http://127.0.0.1:8080/loginPage";
        dealTestValidStyle0(baseDTO, url);
    }


    @Test
    public void testStyle2ValidLogin() {
        String url = "http://127.0.0.1:8080/loginPage";
        dealTestValidStyle1(baseDTO, url);
    }


    @Test
    public void testStyle3ValidLogin() {
        String url = "http://127.0.0.1:8080/loginPage";
        dealTestValidStyle2(baseDTO, url);
    }


    @Test
    public void testStyle1ValidRegister() {
        String url = "http://127.0.0.1:8080/addUserPage";
        dealTestValidStyle0(baseDTO, url);
    }


    @Test
    public void testStyle2ValidRegister() {
        String url = "http://127.0.0.1:8080/addUserPage";
        dealTestValidStyle1(baseDTO, url);
    }


    @Test
    public void testStyle3ValidRegister() {
        String url = "http://127.0.0.1:8080/addUserPage";
        dealTestValidStyle2(baseDTO, url);
    }


    @Test
    public void testStyle1ValidResetPwd() {
        String url = "http://127.0.0.1:8080/resetPwdPage";
        dealTestValidStyle0(baseDTO, url);
    }


    @Test
    public void testStyle2ValidResetPwd() {
        String url = "http://127.0.0.1:8080/resetPwdPage";
        dealTestValidStyle1(baseDTO, url);
    }


    @Test
    public void testStyle3ValidResetPwd() {
        String url = "http://127.0.0.1:8080/resetPwdPage";
        dealTestValidStyle2(baseDTO, url);
    }


    @Test
    public void testStyle1ValidUpdatePwd() {
        String cookies = "JSESSIONID=EA616DD2DBF1E6C26647106EDC315288";
        String url = "http://127.0.0.1:8080/updatePwdPage";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidUpdatePwd() {
        String cookies = "JSESSIONID=EA616DD2DBF1E6C26647106EDC315288";
        String url = "http://127.0.0.1:8080/updatePwdPage";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidUpdatePwd() {
        String cookies = "JSESSIONID=EA616DD2DBF1E6C26647106EDC315288";
        String url = "http://127.0.0.1:8080/updatePwdPage";
        dealTestValidStyle2(baseDTO, url, cookies);
    }


    @Test
    public void testStyle1ValidAddEarning() {
        String cookies = "JSESSIONID=EA616DD2DBF1E6C26647106EDC315288";
        String url = "http://127.0.0.1:8080/addEarningPage";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidAddEarning() {
        String cookies = "JSESSIONID=EA616DD2DBF1E6C26647106EDC315288";
        String url = "http://127.0.0.1:8080/addEarningPage";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidAddEarning() {
        String cookies = "JSESSIONID=EA616DD2DBF1E6C26647106EDC315288";
        String url = "http://127.0.0.1:8080/addEarningPage";
        dealTestValidStyle2(baseDTO, url, cookies);
    }


    @Test
    public void testStyle1ValidAddExpense() {
        String cookies = "JSESSIONID=EA616DD2DBF1E6C26647106EDC315288";
        String url = "http://127.0.0.1:8080/addExpensePage";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidAddExpense() {
        String cookies = "JSESSIONID=EA616DD2DBF1E6C26647106EDC315288";
        String url = "http://127.0.0.1:8080/addExpensePage";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidAddExpense() {
        String cookies = "JSESSIONID=EA616DD2DBF1E6C26647106EDC315288";
        String url = "http://127.0.0.1:8080/addExpensePage";
        dealTestValidStyle2(baseDTO, url, cookies);
    }
}
