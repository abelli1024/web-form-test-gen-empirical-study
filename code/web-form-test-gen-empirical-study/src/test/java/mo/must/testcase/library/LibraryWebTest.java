package mo.must.testcase.library;

import mo.must.base.BaseDTO;
import mo.must.base.BaseTest;
import org.junit.Before;
import org.junit.Test;


public class LibraryWebTest extends BaseTest {

    private BaseDTO baseDTO;

    @Before
    public void init() {
        baseDTO = new BaseDTO();
        initBasicBaseDTO(baseDTO, "library_web");
    }

    @Test
    public void testStyle1ValidAddCategory() {
        String url = "http://127.0.0.1:8080/addCategory";
        dealTestValidStyle0(baseDTO, url);
    }


    @Test
    public void testStyle2ValidAddCategory() {
        String url = "http://127.0.0.1:8080/addCategory";
        dealTestValidStyle1(baseDTO, url);
    }


    @Test
    public void testStyle3ValidAddCategory() {
        String url = "http://127.0.0.1:8080/addCategory";
        dealTestValidStyle2(baseDTO, url);
    }


    @Test
    public void testStyle1ValidUpdateCategory() {
        String url = "http://127.0.0.1:8080/updateCategory/4";
        dealTestValidStyle0(baseDTO, url);
    }


    @Test
    public void testStyle2ValidUpdateCategory() {
        String url = "http://127.0.0.1:8080/updateCategory/4";
        dealTestValidStyle1(baseDTO, url);
    }


    @Test
    public void testStyle3ValidUpdateCategory() {
        String url = "http://127.0.0.1:8080/updateCategory/4";
        dealTestValidStyle2(baseDTO, url);
    }


    @Test
    public void testStyle1ValidAddAuthor() {
        String url = "http://127.0.0.1:8080/addAuthor";
        dealTestValidStyle0(baseDTO, url);
    }


    @Test
    public void testStyle2ValidAddAuthor() {
        String url = "http://127.0.0.1:8080/addAuthor";
        dealTestValidStyle1(baseDTO, url);
    }


    @Test
    public void testStyle3ValidAddAuthor() {
        String url = "http://127.0.0.1:8080/addAuthor";
        dealTestValidStyle2(baseDTO, url);
    }


    @Test
    public void testStyle1ValidUpdateAuthor() {
        String url = "http://127.0.0.1:8080/updateAuthor/1";
        dealTestValidStyle0(baseDTO, url);
    }


    @Test
    public void testStyle2ValidUpdateAuthor() {
        String url = "http://127.0.0.1:8080/updateAuthor/1";
        dealTestValidStyle1(baseDTO, url);
    }


    @Test
    public void testStyle3ValidUpdateAuthor() {
        String url = "http://127.0.0.1:8080/updateAuthor/1";
        dealTestValidStyle2(baseDTO, url);
    }

    @Test
    public void testStyle1ValidAddBook() {
        String url = "http://127.0.0.1:8080/add";
        dealTestValidStyle0(baseDTO, url);
    }


    @Test
    public void testStyle2ValidAddBook() {
        String url = "http://127.0.0.1:8080/add";
        dealTestValidStyle1(baseDTO, url);
    }

    @Test
    public void testStyle3ValidAddBook() {
        String url = "http://127.0.0.1:8080/add";
        dealTestValidStyle2(baseDTO, url);
    }

    @Test
    public void testStyle1ValidUpdateBook() {
        String url = "http://127.0.0.1:8080/update/1";
        dealTestValidStyle0(baseDTO, url);
    }

    @Test
    public void testStyle2ValidUpdateBook() {
        String url = "http://127.0.0.1:8080/update/1";
        dealTestValidStyle1(baseDTO, url);
    }

    @Test
    public void testStyle3ValidUpdateBook() {
        String url = "http://127.0.0.1:8080/update/1";
        dealTestValidStyle2(baseDTO, url);
    }

    @Test
    public void testStyle1ValidAddPublisher() {
        String url = "http://127.0.0.1:8080/addPublisher";
        dealTestValidStyle0(baseDTO, url);
    }


    @Test
    public void testStyle2ValidAddPublisher() {
        String url = "http://127.0.0.1:8080/addPublisher";
        dealTestValidStyle1(baseDTO, url);
    }


    @Test
    public void testStyle3ValidAddPublisher() {
        String url = "http://127.0.0.1:8080/addPublisher";
        dealTestValidStyle2(baseDTO, url);
    }

    @Test
    public void testStyle1ValidUpdatePublisher() {
        String url = "http://127.0.0.1:8080/updatePublisher/1";
        dealTestValidStyle0(baseDTO, url);
    }


    @Test
    public void testStyle2ValidUpdatePublisher() {
        String url = "http://127.0.0.1:8080/updatePublisher/1";
        dealTestValidStyle1(baseDTO, url);
    }

    @Test
    public void testStyle3ValidUpdatePublisher() {
        String url = "http://127.0.0.1:8080/updatePublisher/1";
        dealTestValidStyle2(baseDTO, url);
    }

}
