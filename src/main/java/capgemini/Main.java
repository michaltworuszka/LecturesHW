package capgemini;

public class Main {
    public static void main(String[] args) {

        RandomGenerator randomGenerator = new RandomGenerator();

      int number = randomGenerator.generate(10);
        System.out.println(number);

    }
}