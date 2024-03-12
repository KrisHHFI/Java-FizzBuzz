class FizzBuzz {
    public static void main(String[] args) {
        for (int number = 1; number <= 100; number++) {
            if ((number % 3 == 0) && (number % 5 == 0)) {// If divisible by 3 and 5, print "Fizz Buzz"
                System.out.println("Fizz Buzz");
            } else if (number % 3 == 0) {// If divisible by 3 "Fizz"
                System.out.println("Fizz");
            } else if (number % 5 == 0) {// If divisible by 5 "Buzz"
                System.out.println("Buzz");
            } else {
                System.out.println(number);
            }
        }
    }
}