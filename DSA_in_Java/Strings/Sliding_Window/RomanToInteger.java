package Strings.Sliding_Window;

public class RomanToInteger {
    static void main() {
        String s = "MCMXCIV";

        System.out.println(optimisedApproach(s));
    }
    public static int optimisedApproach(String s){
        int[] values = new int[128];
        values['I'] = 1;
        values['V'] = 5;
        values['X'] = 10;
        values['L'] = 50;
        values['C'] = 100;
        values['D'] = 500;
        values['M'] = 1000;

        int ans = 0;
        int length = s.length();

        for(int i = 0; i<length; i++){
            int currentValue = values[s.charAt(i)];

            if(i < length - 1 && currentValue < values[s.charAt(i + 1)]){
                ans -= currentValue;
            }
            else{
                ans += currentValue;
            }
        }
        return ans;
    }
}
