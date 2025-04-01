package mo.must.testcase.forum;

import mo.must.base.BaseDTO;
import mo.must.base.BaseTest;
import org.junit.Before;
import org.junit.Test;


public class ForumWebTest extends BaseTest {

    private BaseDTO baseDTO;

    @Before
    public void init() {
        baseDTO = new BaseDTO();
        initBasicBaseDTO(baseDTO,  "forum_web");
    }

    @Test
    public void testStyle1ValidLogin() {
        String url = "http://127.0.0.1:8080/admin";
        dealTestValidStyle0(baseDTO, url);
    }


    @Test
    public void testStyle2ValidLogin() {
        String url = "http://127.0.0.1:8080/admin";
        dealTestValidStyle1(baseDTO, url);
    }


    @Test
    public void testStyle3ValidLogin() {
        String url = "http://127.0.0.1:8080/admin";
        dealTestValidStyle2(baseDTO, url);
    }


    @Test
    public void testStyle1ValidRegister() {
        String url = "http://127.0.0.1:8080/admin/registered";
        dealTestValidStyle0(baseDTO, url);
    }


    @Test
    public void testStyle2ValidRegister() {
        String url = "http://127.0.0.1:8080/admin/registered";
        dealTestValidStyle1(baseDTO, url);
    }


    @Test
    public void testStyle3ValidRegister() {
        String url = "http://127.0.0.1:8080/admin/registered";
        dealTestValidStyle2(baseDTO, url);
    }


    @Test
    public void testStyle1ValidAddBlog() {
        String cookies = "JSESSIONID=BF9FC619E7ACB495C14C9C428C9FFAB9";
        String url = "http://127.0.0.1:8080/admin/blogs/input";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidAddBlog() {
        String cookies = "JSESSIONID=BF9FC619E7ACB495C14C9C428C9FFAB9";
        String url = "http://127.0.0.1:8080/admin/blogs/input";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidAddBlog() {
        String cookies = "JSESSIONID=BF9FC619E7ACB495C14C9C428C9FFAB9";
        String url = "http://127.0.0.1:8080/admin/blogs/input";
        dealTestValidStyle2(baseDTO, url, cookies);
    }


    @Test
    public void testStyle1ValidAddType() {
        String cookies = "JSESSIONID=BF9FC619E7ACB495C14C9C428C9FFAB9";
        String url = "http://127.0.0.1:8080/admin/types/input";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidAddType() {
        String cookies = "JSESSIONID=BF9FC619E7ACB495C14C9C428C9FFAB9";
        String url = "http://127.0.0.1:8080/admin/types/input";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidAddType() {
        String cookies = "JSESSIONID=BF9FC619E7ACB495C14C9C428C9FFAB9";
        String url = "http://127.0.0.1:8080/admin/types/input";
        dealTestValidStyle2(baseDTO, url, cookies);
    }


    @Test
    public void testStyle1ValidAddTag() {
        String cookies = "JSESSIONID=BF9FC619E7ACB495C14C9C428C9FFAB9";
        String url = "http://127.0.0.1:8080/admin/tags/input";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidAddTag() {
        String cookies = "JSESSIONID=BF9FC619E7ACB495C14C9C428C9FFAB9";
        String url = "http://127.0.0.1:8080/admin/tags/input";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidAddTag() {
        String cookies = "JSESSIONID=BF9FC619E7ACB495C14C9C428C9FFAB9";
        String url = "http://127.0.0.1:8080/admin/tags/input";
        dealTestValidStyle2(baseDTO, url, cookies);
    }


    @Test
    public void testStyle1ValidDetail() {
        String cookies = "JSESSIONID=BF9FC619E7ACB495C14C9C428C9FFAB9";
        String url = "http://127.0.0.1:8080/admin/blogs/1/input";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidDetail() {
        String cookies = "JSESSIONID=BF9FC619E7ACB495C14C9C428C9FFAB9";
        String url = "http://127.0.0.1:8080/admin/blogs/1/input";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidDetail() {
        String cookies = "JSESSIONID=BF9FC619E7ACB495C14C9C428C9FFAB9";
        String url = "http://127.0.0.1:8080/admin/blogs/1/input";
        dealTestValidStyle2(baseDTO, url, cookies);
    }


    @Test
    public void testStyle1ValidSearch() {
        String cookies = "JSESSIONID=BF9FC619E7ACB495C14C9C428C9FFAB9";
        String url = "http://127.0.0.1:8080/blog/1";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidSearch() {
        String cookies = "JSESSIONID=BF9FC619E7ACB495C14C9C428C9FFAB9";
        String url = "http://127.0.0.1:8080/blog/1";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidSearch() {
        String cookies = "JSESSIONID=BF9FC619E7ACB495C14C9C428C9FFAB9";
        String url = "http://127.0.0.1:8080/blog/1";
        dealTestValidStyle2(baseDTO, url, cookies);
    }
}
