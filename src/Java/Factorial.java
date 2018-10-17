public class Factorial {
    public int factorial(int n){
        int result = 1;
        for(i=1; i<=n; i++){
            result = result*i;
        }
        return result;
    }
}