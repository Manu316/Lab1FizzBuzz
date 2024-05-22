interface FizzBuzz {
    void print(int from, int to);
}

class ConsoleBasedFizzBuzz implements FizzBuzz {
    @Override
    public void print(int from, int to) {
        for (int i = from; i <= to; i++) {
            System.out.println(valorFizzBuzz(i));
        }
    }

    private String valorFizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else {
            return String.valueOf(number);
        }
    }
}

class Main {
    public static void main(String[] args) {
        FizzBuzz multiplo = new ConsoleBasedFizzBuzz();
        multiplo.print(0, 100);
    }
}

