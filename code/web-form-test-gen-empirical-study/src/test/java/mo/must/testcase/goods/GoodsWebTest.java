package mo.must.testcase.goods;

import mo.must.base.BaseDTO;
import mo.must.base.BaseTest;
import org.junit.Before;
import org.junit.Test;


public class GoodsWebTest extends BaseTest {

    private BaseDTO baseDTO;

    @Before
    public void init() {
        baseDTO = new BaseDTO();
        initBasicBaseDTO(baseDTO, "goods_web");
    }
    @Test
    public void testStyle1ValidLogin() {
        String url = "http://127.0.0.1:8080/user/login";
        dealTestValidStyle0(baseDTO, url);
    }

    @Test
    public void testStyle2ValidLogin() {
        String url = "http://127.0.0.1:8080/user/login";
        dealTestValidStyle1(baseDTO, url);
    }


    @Test
    public void testStyle3ValidLogin() {
        String url = "http://127.0.0.1:8080/user/login";
        dealTestValidStyle2(baseDTO, url);
    }

    @Test
    public void testStyle1ValidRegister() {
        String url = "http://127.0.0.1:8080/user/register";
        dealTestValidStyle0(baseDTO, url);
    }


    @Test
    public void testStyle2ValidRegister() {
        String url = "http://127.0.0.1:8080/user/register";
        dealTestValidStyle1(baseDTO, url);
    }


    @Test
    public void testStyle3ValidRegister() {
        String url = "http://127.0.0.1:8080/user/register";
        dealTestValidStyle2(baseDTO, url);
    }


    @Test
    public void testStyle1ValidForgetPwd() {
        String url = "http://127.0.0.1:8080/user/forget";
        dealTestValidStyle0(baseDTO, url);
    }


    @Test
    public void testStyle2ValidForgetPwd() {
        String url = "http://127.0.0.1:8080/user/forget";
        dealTestValidStyle1(baseDTO, url);
    }


    @Test
    public void testStyle3ValidForgetPwd() {
        String url = "http://127.0.0.1:8080/user/forget";
        dealTestValidStyle2(baseDTO, url);
    }


    @Test
    public void testStyle1ValidUserManage() {
        String cookies="JSESSIONID=73D79B14E63556C80F93EC22EE498D97";
        String url = "http://127.0.0.1:8080/user/userManage";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidUserManage() {
        String cookies="JSESSIONID=73D79B14E63556C80F93EC22EE498D97";
        String url = "http://127.0.0.1:8080/user/userManage";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidUserManage() {
        String cookies="JSESSIONID=73D79B14E63556C80F93EC22EE498D97";
        String url = "http://127.0.0.1:8080/user/userManage";
        dealTestValidStyle2(baseDTO, url, cookies);
    }


    @Test
    public void testStyle1ValidEditDelivery() {
        String cookies="JSESSIONID=73D79B14E63556C80F93EC22EE498D97";
        String url = "http://127.0.0.1:8080/user/deliveryEdit";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidEditDelivery() {
        String cookies="JSESSIONID=73D79B14E63556C80F93EC22EE498D97";
        String url = "http://127.0.0.1:8080/user/deliveryEdit";
        dealTestValidStyle1(baseDTO, url, cookies);
    }


    @Test
    public void testStyle3ValidEditDelivery() {
        String cookies="JSESSIONID=73D79B14E63556C80F93EC22EE498D97";
        String url = "http://127.0.0.1:8080/user/deliveryEdit";
        dealTestValidStyle2(baseDTO, url, cookies);
    }


    @Test
    public void testStyle1ValidEditItemCategory() {
        String cookies="JSESSIONID=73D79B14E63556C80F93EC22EE498D97";
        String url = "http://127.0.0.1:8080/user/itemCategoryEdit";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidEditItemCategory() {
        String cookies="JSESSIONID=73D79B14E63556C80F93EC22EE498D97";
        String url = "http://127.0.0.1:8080/user/itemCategoryEdit";
        dealTestValidStyle1(baseDTO, url, cookies);
    }

    @Test
    public void testStyle3ValidEditItemCategory() {
        String cookies="JSESSIONID=73D79B14E63556C80F93EC22EE498D97";
        String url = "http://127.0.0.1:8080/user/itemCategoryEdit";
        dealTestValidStyle2(baseDTO, url, cookies);
    }


    @Test
    public void testStyle1ValidEditItem() {
        String cookies="JSESSIONID=73D79B14E63556C80F93EC22EE498D97";
        String url = "http://127.0.0.1:8080/user/itemEdit";
        dealTestValidStyle0(baseDTO, url, cookies);
    }


    @Test
    public void testStyle2ValidEditItem() {
        String cookies="JSESSIONID=73D79B14E63556C80F93EC22EE498D97";
        String url = "http://127.0.0.1:8080/user/itemEdit";
        dealTestValidStyle1(baseDTO, url, cookies);
    }

    @Test
    public void testStyle3ValidEditItem() {
        String cookies="JSESSIONID=73D79B14E63556C80F93EC22EE498D97";
        String url = "http://127.0.0.1:8080/user/itemEdit";
        dealTestValidStyle2(baseDTO, url, cookies);
    }

}
