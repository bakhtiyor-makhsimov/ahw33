package core.ahw33;

import org.testng.annotations.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class DivideTest {
	
	@Test
    public void divide_test_instanceOf() {
           assertThat(Calculator.divide(4, 2), instanceOf(Double.class));
			  }
    @Test
    public void divide_test_2_param() {
           assertThat(Calculator.divide(8, 2), equalTo(4.0));
			  }
    @Test
    public void divide_test_3_param() {
           assertThat(Calculator.divide(16, 2, 4), equalTo(2.0));
			  }
    @Test
    public void divide_test_4_param() {
           assertThat(Calculator.divide(256, 2, 2, 2), equalTo(32.0));
    }
	
}
