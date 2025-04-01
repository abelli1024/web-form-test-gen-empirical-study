package mo.must.testcase.voter;

import mo.must.base.BaseDTO;
import mo.must.base.BaseTest;
import org.junit.Before;
import org.junit.Test;


public class VoterWebTest extends BaseTest {

    private BaseDTO baseDTO;

    @Before
    public void init() {
        baseDTO = new BaseDTO();
        initBasicBaseDTO(baseDTO, "voter_web");
    }

    @Test
    public void testStyle1ValidPublicEn() {
        String url = "http://127.0.0.1:8080/public/en";
        dealTestValidStyle0(baseDTO, url);
    }


    @Test
    public void testStyle2ValidPublicEn() {
        String url = "http://127.0.0.1:8080/public/en";
        dealTestValidStyle1(baseDTO, url);
    }



    @Test
    public void testStyle3ValidPublicEn() {
        String url = "http://127.0.0.1:8080/public/en";
        dealTestValidStyle2(baseDTO, url);
    }


    @Test
    public void testStyle1ValidPublicCn() {
        String url = "http://127.0.0.1:8080/public/cn";
        dealTestValidStyle0(baseDTO, url);
    }


    @Test
    public void testStyle2ValidPublicCn() {
        String url = "http://127.0.0.1:8080/public/cn";
        dealTestValidStyle1(baseDTO, url);
    }

    @Test
    public void testStyle3ValidPublicCn() {
        String url = "http://127.0.0.1:8080/public/cn";
        dealTestValidStyle2(baseDTO, url);
    }


    @Test
    public void testStyle1ValidVoteEn() {
        String url = "http://127.0.0.1:8080/vote/en/1";
        dealTestValidStyle0(baseDTO, url);
    }


    @Test
    public void testStyle2ValidVoteEn() {
        String url = "http://127.0.0.1:8080/vote/en/1";
        dealTestValidStyle1(baseDTO, url);
    }


    @Test
    public void testStyle3ValidVoteEn() {
        String url = "http://127.0.0.1:8080/vote/en/1";
        dealTestValidStyle2(baseDTO, url);
    }

    @Test
    public void testStyle1ValidVoteCn() {
        String url = "http://127.0.0.1:8080/vote/cn/1";
        dealTestValidStyle0(baseDTO, url);
    }


    @Test
    public void testStyle2ValidVoteCn() {
        String url = "http://127.0.0.1:8080/vote/cn/1";
        dealTestValidStyle1(baseDTO, url);
    }


    @Test
    public void testStyle3ValidVoteCn() {
        String url = "http://127.0.0.1:8080/vote/cn/1";
        dealTestValidStyle2(baseDTO, url);
    }

}
