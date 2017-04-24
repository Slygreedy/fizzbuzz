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
    public void _0is0 () {
       assertThat(fizzBuzz.playGame(0), is ("0"));
    }

    @Test
    public void _1is1 () {
        assertThat(fizzBuzz.playGame(1), is ("1"));
    }

    @Test
    public void _3isFizz () {
        assertThat(fizzBuzz.playGame(3), is ("Fizz"));
    }

    @Test
    public void _5isBuzz () {
        assertThat(fizzBuzz.playGame(5), is ("Buzz"));
    }

    @Test
    public void _15isFizzBuzz () {
        assertThat(fizzBuzz.playGame(15), is ("FizzBuzz"));
    }
}
