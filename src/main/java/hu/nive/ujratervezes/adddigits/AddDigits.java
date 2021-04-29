package hu.nive.ujratervezes.adddigits;

public class AddDigits {

    public int addDigits(String input) {
        int sum = 0;
        if(input == null || input.isEmpty()) {
            return -1;
        }
        else {
            for(int i = 0; i < input.length(); i++) {
                if(input.charAt(i) >= '1' && input.charAt(i) <= '9')
                sum += Integer.parseInt(String.valueOf(input.charAt(i)));
            }
        }
        return sum;
    }
}
