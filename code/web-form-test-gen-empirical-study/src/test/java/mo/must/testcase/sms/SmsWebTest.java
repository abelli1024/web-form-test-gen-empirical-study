package mo.must.testcase.sms;

import mo.must.base.BaseDTO;
import mo.must.base.BaseTest;
import org.junit.Before;
import org.junit.Test;


public class SmsWebTest extends BaseTest {

    private BaseDTO baseDTO;

    @Before
    public void init() {
        baseDTO = new BaseDTO();
        initBasicBaseDTO(baseDTO, "sms_web");
    }

    @Test
    public void testStyle1ValidLogin() {
        String url = "http://127.0.0.1:8080/login/";
        dealTestValidStyle0(baseDTO, url);
    }


    @Test
    public void testStyle2ValidLogin() {
        String url = "http://127.0.0.1:8080/login/";
        dealTestValidStyle1(baseDTO, url);
    }


    @Test
    public void testStyle3ValidLogin() {
        String url = "http://127.0.0.1:8080/login/";
        dealTestValidStyle2(baseDTO, url);
    }


    @Test
    public void testStyle1ValidRegister() {
        String url = "http://127.0.0.1:8080/register/";
        dealTestValidStyle0(baseDTO, url);
    }


    @Test
    public void testStyle2ValidRegister() {
        String url = "http://127.0.0.1:8080/register/";
        dealTestValidStyle1(baseDTO, url);
    }


    @Test
    public void testStyle3ValidRegister() {
        String url = "http://127.0.0.1:8080/register/";
        dealTestValidStyle2(baseDTO, url);
    }


    @Test
    public void testStyle1ValidStudentRegister() {
        String cookies = "JSESSIONID=BDB7D10DEC40CAA3E7EB0FA787D512CA";
        String url = "http://127.0.0.1:8080/home/students-register/";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidStudentRegister() {
        String cookies = "JSESSIONID=BDB7D10DEC40CAA3E7EB0FA787D512CA";
        String url = "http://127.0.0.1:8080/home/students-register/";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidStudentRegister() {
        String cookies = "JSESSIONID=BDB7D10DEC40CAA3E7EB0FA787D512CA";
        String url = "http://127.0.0.1:8080/home/students-register/";
        dealTestValidStyle2(baseDTO, url, cookies);
    }


    @Test
    public void testStyle1ValidEditStudentRegister() {
        String cookies = "JSESSIONID=BDB7D10DEC40CAA3E7EB0FA787D512CA";
        String url = "http://127.0.0.1:8080/home/consult-students/edit-register-students/1";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidEditStudentRegister() {
        String cookies = "JSESSIONID=BDB7D10DEC40CAA3E7EB0FA787D512CA";
        String url = "http://127.0.0.1:8080/home/consult-students/edit-register-students/1";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidEditStudentRegister() {
        String cookies = "JSESSIONID=BDB7D10DEC40CAA3E7EB0FA787D512CA";
        String url = "http://127.0.0.1:8080/home/consult-students/edit-register-students/1";
        dealTestValidStyle2(baseDTO, url, cookies);
    }

}
