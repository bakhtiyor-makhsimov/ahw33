package core.ahw33;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.instanceOf;

import org.testng.annotations.Test;

public class SubtractTest {
	
	@Test
    public void subtract_test_instanceOf() {
           assertThat(Calculator.subtract(2, 2), instanceOf(Double.class));
			  }
    @Test
    public void subtract_test_2_param() {
           assertThat(Calculator.subtract(4, 2), equalTo(2.0));
			  }
    @Test
    public void subtract_test_3_param() {
           assertThat(Calculator.subtract(10, 2, 2), equalTo(6.0));
			  }
    @Test
    public void subtract_test_4_param() {
           assertThat(Calculator.subtract(14, 2, 2, 2), equalTo(8.0));
			  }
}
