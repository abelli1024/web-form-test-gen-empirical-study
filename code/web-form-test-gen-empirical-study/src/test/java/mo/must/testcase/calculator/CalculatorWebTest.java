package mo.must.testcase.calculator;

import mo.must.base.BaseDTO;
import mo.must.base.BaseTest;
import org.junit.Before;
import org.junit.Test;


public class CalculatorWebTest extends BaseTest {

    private BaseDTO baseDTO;

    @Before
    public void init() {
        baseDTO = new BaseDTO();
        initBasicBaseDTO(baseDTO, "calculator_web");
    }



    @Test
    public void testStyle1ValidCalculator() {
        String url = "http://127.0.0.1:8080/calculator";
        dealTestValidStyle0(baseDTO, url);
    }


    @Test
    public void testStyle2ValidCalculator() {
        String url = "http://127.0.0.1:8080/calculator";
        dealTestValidStyle1(baseDTO, url);
    }

    @Test
    public void testStyle3ValidCalculator() {
        String url = "http://127.0.0.1:8080/calculator";
        dealTestValidStyle2(baseDTO, url);
    }
}
