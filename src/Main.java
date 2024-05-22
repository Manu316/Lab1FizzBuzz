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

    private String valorFizzBuzz(int numero) {
        if (numero % 15 == 0) {
            return "FizzBuzz";
        } else if (numero % 5 == 0) {
            return "Buzz";
        } else if (numero % 3 == 0) {
            return "Fizz";
        } else {
            return String.valueOf(numero);
        }
    }
}

class Main {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new ConsoleBasedFizzBuzz();
        fizzBuzz.print(0, 100);
    }
}
