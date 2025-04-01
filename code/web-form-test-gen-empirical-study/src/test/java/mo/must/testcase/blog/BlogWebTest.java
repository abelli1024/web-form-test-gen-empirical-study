package mo.must.testcase.blog;

import mo.must.base.BaseDTO;
import mo.must.base.BaseTest;
import org.junit.Before;
import org.junit.Test;


public class BlogWebTest extends BaseTest {

    private BaseDTO baseDTO;

    @Before
    public void init() {
        baseDTO = new BaseDTO();
        initBasicBaseDTO(baseDTO, "blog_web");
    }

    @Test
    public void testStyle1ValidLogin() {
        String url = "http://127.0.0.1:8080/admin/login";
        dealTestValidStyle0(baseDTO, url);
    }

    @Test
    public void testStyle2ValidLogin() {
        String url = "http://127.0.0.1:8080/admin/login";
        dealTestValidStyle1(baseDTO, url);
    }


    @Test
    public void testStyle3ValidLogin() {
        String url = "http://127.0.0.1:8080/admin/login";
        dealTestValidStyle2(baseDTO, url);
    }


    @Test
    public void testStyle1ValidProfile() {
        String cookies = "JSESSIONID=2031A7EA113F2E62035BA08149E18024";
        String url = "http://127.0.0.1:8080/admin/profile";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidProfile() {
        String cookies = "JSESSIONID=2031A7EA113F2E62035BA08149E18024";
        String url = "http://127.0.0.1:8080/admin/profile";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidProfile() {
        String cookies = "JSESSIONID=2031A7EA113F2E62035BA08149E18024";
        String url = "http://127.0.0.1:8080/admin/profile";
        dealTestValidStyle2(baseDTO, url, cookies);
    }


    @Test
    public void testStyle1ValidArticlePublish() {
        String cookies = "JSESSIONID=2031A7EA113F2E62035BA08149E18024";
        String url = "http://127.0.0.1:8080/admin/article/publish";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidArticlePublish() {
        String cookies = "JSESSIONID=2031A7EA113F2E62035BA08149E18024";
        String url = "http://127.0.0.1:8080/admin/article/publish";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidArticlePublish() {
        String cookies = "JSESSIONID=2031A7EA113F2E62035BA08149E18024";
        String url = "http://127.0.0.1:8080/admin/article/publish";
        dealTestValidStyle2(baseDTO, url, cookies);
    }


    @Test
    public void testStyle1ValidCategory() {
        String cookies = "JSESSIONID=2031A7EA113F2E62035BA08149E18024";
        String url = "http://127.0.0.1:8080/admin/category";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidCategory() {
        String cookies = "JSESSIONID=2031A7EA113F2E62035BA08149E18024";
        String url = "http://127.0.0.1:8080/admin/category";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidCategory() {
        String cookies = "JSESSIONID=2031A7EA113F2E62035BA08149E18024";
        String url = "http://127.0.0.1:8080/admin/category";
        dealTestValidStyle2(baseDTO, url, cookies);
    }


    @Test
    public void testStyle1ValidLinks() {
        String cookies = "JSESSIONID=2031A7EA113F2E62035BA08149E18024";
        String url = "http://127.0.0.1:8080/admin/links";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidLinks() {
        String cookies = "JSESSIONID=2031A7EA113F2E62035BA08149E18024";
        String url = "http://127.0.0.1:8080/admin/links";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidLinks() {
        String cookies = "JSESSIONID=2031A7EA113F2E62035BA08149E18024";
        String url = "http://127.0.0.1:8080/admin/links";
        dealTestValidStyle2(baseDTO, url, cookies);
    }


    @Test
    public void testStyle1ValidSetting() {
        String cookies = "JSESSIONID=2031A7EA113F2E62035BA08149E18024";
        String url = "http://127.0.0.1:8080/admin/setting";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidSetting() {
        String cookies = "JSESSIONID=2031A7EA113F2E62035BA08149E18024";
        String url = "http://127.0.0.1:8080/admin/setting";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidSetting() {
        String cookies = "JSESSIONID=2031A7EA113F2E62035BA08149E18024";
        String url = "http://127.0.0.1:8080/admin/setting";
        dealTestValidStyle2(baseDTO, url, cookies);
    }

    @Test
    public void testStyle1ValidEditArticle() {
        String cookies = "JSESSIONID=2031A7EA113F2E62035BA08149E18024";
        String url = "http://127.0.0.1:8080/admin/article/35";
        dealTestValidStyle0(baseDTO, url, cookies);
    }

    @Test
    public void testStyle2ValidEditArticle() {
        String cookies = "JSESSIONID=2031A7EA113F2E62035BA08149E18024";
        String url = "http://127.0.0.1:8080/admin/article/35";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidEditArticle() {
        String cookies = "JSESSIONID=2031A7EA113F2E62035BA08149E18024";
        String url = "http://127.0.0.1:8080/admin/article/35";
        dealTestValidStyle2(baseDTO, url, cookies);
    }


    @Test
    public void testStyle1ValidDetail() {
        String cookies = "JSESSIONID=2031A7EA113F2E62035BA08149E18024";
        String url = "http://127.0.0.1:8080/detail/35";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidDetail() {
        String cookies = "JSESSIONID=2031A7EA113F2E62035BA08149E18024";
        String url = "http://127.0.0.1:8080/detail/35";
        dealTestValidStyle1(baseDTO, url, cookies);
    }

    @Test
    public void testStyle3ValidDetail() {
        String cookies = "JSESSIONID=2031A7EA113F2E62035BA08149E18024";
        String url = "http://127.0.0.1:8080/detail/35";
        dealTestValidStyle2(baseDTO, url, cookies);
    }

}
