package mo.must.testcase.course;

import mo.must.base.BaseDTO;
import mo.must.base.BaseTest;
import org.junit.Before;
import org.junit.Test;


public class CourseWebTest extends BaseTest {

    private BaseDTO baseDTO;

    @Before
    public void init() {
        baseDTO = new BaseDTO();
        initBasicBaseDTO(baseDTO, "course_web");
    }

    @Test
    public void testStyle1ValidLogin() {
        String url = "http://127.0.0.1:8080/student";
        dealTestValidStyle0(baseDTO, url);
    }


    @Test
    public void testStyle2ValidLogin() {
        String url = "http://127.0.0.1:8080/student";
        dealTestValidStyle1(baseDTO, url);
    }


    @Test
    public void testStyle3ValidLogin() {
        String url = "http://127.0.0.1:8080/student";
        dealTestValidStyle2(baseDTO, url);
    }


    @Test
    public void testStyle1ValidUpdateStudentInfo() {
        String cookies = "JSESSIONID=17846A165A11A595818930B539757305";
        String url = "http://127.0.0.1:8080/studentInfo";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidUpdateStudentInfo() {
        String cookies = "JSESSIONID=17846A165A11A595818930B539757305";
        String url = "http://127.0.0.1:8080/studentInfo";
        dealTestValidStyle1(baseDTO, url,cookies);
    }

    @Test
    public void testStyle3ValidUpdateStudentInfo() {
        String cookies = "JSESSIONID=17846A165A11A595818930B539757305";
        String url = "http://127.0.0.1:8080/studentInfo";
        dealTestValidStyle2(baseDTO, url,cookies);
    }
}
