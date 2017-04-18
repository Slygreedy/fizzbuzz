public class FizzBuzz {
    public static String of(int i) {
        try {
            if (i == 0) {
                return "0";
            }

            String s = "";

            if (i % 3 == 0) {
                s += "Fizz";
            }
            if (i % 5 == 0) {
                s += "Buzz";
            }

            return !s.isEmpty() ? s : String.valueOf(i);
        }
        catch (Exception ex) {
            return "cannot enter string value";
        }
    }
}
