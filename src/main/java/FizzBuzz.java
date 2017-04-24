public class FizzBuzz {

    public String playGame(int i) {


        String s = "";

        if (i == 0)

            return "0";
        

        if (i % 3 == 0)
            s += "Fizz";

        if (i % 5 == 0)
            s += "Buzz";

        return s.isEmpty() ? String.valueOf(i) : s;
    }
}
