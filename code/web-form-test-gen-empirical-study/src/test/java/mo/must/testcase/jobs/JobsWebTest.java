package mo.must.testcase.jobs;

import mo.must.base.BaseDTO;
import mo.must.base.BaseTest;
import org.junit.Before;
import org.junit.Test;


public class JobsWebTest extends BaseTest {

    private BaseDTO baseDTO;

    @Before
    public void init() {
        baseDTO = new BaseDTO();
        initBasicBaseDTO(baseDTO, "jobs_web");
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
    public void testStyle1ValidAddAvailabilityForm() {
        String cookies = "JSESSIONID=3217E0A5F7F3644C1448967D045DE639";
        String url = "http://127.0.0.1:8080/add_availability_form";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidAddAvailabilityForm() {
        String cookies = "JSESSIONID=3217E0A5F7F3644C1448967D045DE639";
        String url = "http://127.0.0.1:8080/add_availability_form";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidAddAvailabilityForm() {
        String cookies = "JSESSIONID=3217E0A5F7F3644C1448967D045DE639";
        String url = "http://127.0.0.1:8080/add_availability_form";
        dealTestValidStyle2(baseDTO, url, cookies);
    }


    @Test
    public void testStyle1ValidCreateFeedbackForm() {
        String cookies = "JSESSIONID=3217E0A5F7F3644C1448967D045DE639";
        String url = "http://127.0.0.1:8080/create_feedback_form";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidCreateFeedbackForm() {
        String cookies = "JSESSIONID=3217E0A5F7F3644C1448967D045DE639";
        String url = "http://127.0.0.1:8080/create_feedback_form";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidCreateFeedbackForm() {
        String cookies = "JSESSIONID=3217E0A5F7F3644C1448967D045DE639";
        String url = "http://127.0.0.1:8080/create_feedback_form";
        dealTestValidStyle2(baseDTO, url, cookies);
    }

    @Test
    public void testStyle1ValidCreateJobApplication() {
        String cookies = "JSESSIONID=3217E0A5F7F3644C1448967D045DE639";
        String url = "http://127.0.0.1:8080/create_job_application";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidCreateJobApplication() {
        String cookies = "JSESSIONID=3217E0A5F7F3644C1448967D045DE639";
        String url = "http://127.0.0.1:8080/create_job_application";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidCreateJobApplication() {
        String cookies = "JSESSIONID=3217E0A5F7F3644C1448967D045DE639";
        String url = "http://127.0.0.1:8080/create_job_application";
        dealTestValidStyle2(baseDTO, url, cookies);
    }


    @Test
    public void testStyle1ValidCreateJobPost() {
        String cookies = "JSESSIONID=3217E0A5F7F3644C1448967D045DE639";
        String url = "http://127.0.0.1:8080/create_job_post";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidCreateJobPost() {
        String cookies = "JSESSIONID=3217E0A5F7F3644C1448967D045DE639";
        String url = "http://127.0.0.1:8080/create_job_post";
        dealTestValidStyle1(baseDTO, url, cookies);
    }

    @Test
    public void testStyle3ValidCreateJobPost() {
        String cookies = "JSESSIONID=3217E0A5F7F3644C1448967D045DE639";
        String url = "http://127.0.0.1:8080/create_job_post";
        dealTestValidStyle2(baseDTO, url, cookies);
    }
}
