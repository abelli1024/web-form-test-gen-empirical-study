package mo.must.testcase.projectmanager;

import mo.must.base.BaseDTO;
import mo.must.base.BaseTest;
import org.junit.Before;
import org.junit.Test;


public class ProjectmanagerWebTest extends BaseTest {

    private BaseDTO baseDTO;

    @Before
    public void init() {
        baseDTO = new BaseDTO();
        initBasicBaseDTO(baseDTO,  "project_manager_web");
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
    public void testStyle1ValidNewProjects() {
        String cookies = "JSESSIONID=621B54CC8765B22778D2E3AFD591368C";
        String url = "http://127.0.0.1:8080/projects/new";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidNewProjects() {
        String cookies = "JSESSIONID=621B54CC8765B22778D2E3AFD591368C";
        String url = "http://127.0.0.1:8080/projects/new";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidNewProjects() {
        String cookies = "JSESSIONID=621B54CC8765B22778D2E3AFD591368C";
        String url = "http://127.0.0.1:8080/projects/new";
        dealTestValidStyle2(baseDTO, url, cookies);
    }


    @Test
    public void testStyle1ValidNewEmployees() {
        String cookies = "JSESSIONID=621B54CC8765B22778D2E3AFD591368C";
        String url = "http://127.0.0.1:8080/employees/new";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidNewEmployees() {
        String cookies = "JSESSIONID=621B54CC8765B22778D2E3AFD591368C";
        String url = "http://127.0.0.1:8080/employees/new";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidNewEmployees() {
        String cookies = "JSESSIONID=621B54CC8765B22778D2E3AFD591368C";
        String url = "http://127.0.0.1:8080/employees/new";
        dealTestValidStyle2(baseDTO, url, cookies);
    }
}
