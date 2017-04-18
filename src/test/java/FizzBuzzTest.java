import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class FizzBuzzTest {

    FizzBuzz fizzBuzz;

    @Before
    public void initialise() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void of_0_is_0() {
        assertThat(fizzBuzz.of(0), is("0"));
    }

    @Test
    public void of_1_is_1() {
        assertThat(fizzBuzz.of(1), is("1"));
    }

    @Test
    public void of_3_is_Fizz() {
        assertThat(fizzBuzz.of(3), is ("Fizz"));
    }

    @Test
    public void of_5_is_Buzz() {
        assertThat(fizzBuzz.of(5), is ("Buzz"));
    }

    @Test
    public void of_15_is_FizzBuzz() {
        assertThat(fizzBuzz.of(15), is ("FizzBuzz"));
    }

    //@Test
    //public void error() {
    //    assertThat(fizzBuzz.of(), is ("error"));
    //}
}
