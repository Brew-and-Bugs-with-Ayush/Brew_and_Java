package MathsForDSA;

public class Count_Divisors {
    public static void main(String[] args){

        int num = 84;
        System.out.println(primeFactorizationMethod(num));
    }
    public static int primeFactorizationMethod(int num){
        int ans = 1;
        int n = num;
        for(int i = 2; i*i <= n; i++) {
            int count = 0;
            while (n % i == 0) {
                n = n /i;
                count++;
            }
            ans *= (count + 1);
        }
        if(n > 1) ans *= 2;
        return ans;
    }
}
