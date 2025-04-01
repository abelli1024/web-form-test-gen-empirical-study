package mo.must.testcase.art;

import mo.must.base.BaseDTO;
import mo.must.base.BaseTest;
import org.junit.Before;
import org.junit.Test;



public class ArtWebTest extends BaseTest {

    private BaseDTO baseDTO;

    @Before
    public void init() {
        baseDTO = new BaseDTO();
        initBasicBaseDTO(baseDTO, "art_web");
    }

    @Test
    public void testStyle1ValidLogin() {
        String url = "http://127.0.0.1:8080/showLoginPage";
        dealTestValidStyle0(baseDTO, url);
    }


    @Test
    public void testStyle2ValidLogin() {
        String url = "http://127.0.0.1:8080/showLoginPage";
        dealTestValidStyle1(baseDTO, url);
    }

    @Test
    public void testStyle3ValidLogin() {
        String url = "http://127.0.0.1:8080/showLoginPage";
        dealTestValidStyle2(baseDTO, url);
    }


    @Test
    public void testStyle1ValidReg() {
        String url = "http://127.0.0.1:8080/showReg";
        dealTestValidStyle0(baseDTO, url);
    }


    @Test
    public void testStyle2ValidReg() {
        String url = "http://127.0.0.1:8080/showReg";
        dealTestValidStyle1(baseDTO, url);
    }


    @Test
    public void testStyle3ValidReg() {
        String url = "http://127.0.0.1:8080/showReg";
        dealTestValidStyle2(baseDTO, url);
    }


    @Test
    public void testStyle1ValidFindYourArtist() {
        String url = "http://127.0.0.1:8080/findYourArtist";
        dealTestValidStyle0(baseDTO, url);
    }


    @Test
    public void testStyle2ValidFindYourArtist() {
        String url = "http://127.0.0.1:8080/findYourArtist";
        dealTestValidStyle1(baseDTO, url);
    }


    @Test
    public void testStyle3ValidFindYourArtist() {
        String url = "http://127.0.0.1:8080/findYourArtist";
        dealTestValidStyle2(baseDTO, url);
    }

}
