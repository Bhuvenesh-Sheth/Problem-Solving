public class Factorial_Of_Number {
    public long factorial(int N) {
        // Your code here
        if (N == 0)
            return 1;
        return N * factorial(N - 1);
    }
}
