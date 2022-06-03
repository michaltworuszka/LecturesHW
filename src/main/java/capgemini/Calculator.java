package capgemini;

public class Calculator {


    public long plus(int x, int y) {
        return (long) x + y;
    }

    public int minus(int x, int y) {
        return x - y;
    }

    public long multiple (int x, int y) {
        return (long) x * y;
    }

    public double divide (int x, int y) {

        if (y == 0) {
            throw new IllegalArgumentException("divider must be different then = 0");
        }
        else
            return (double) x/y;
    }

    //TODO add multiple/divide
}
