import java.math.BigInteger;

public class Faktorial {
    public static void main(String[] args) {
        int value = 4;
        BigInteger a= BigInteger.valueOf(1);
        for (int i =1;i<value+1;i++){
            BigInteger s = BigInteger.valueOf(i);
            a = a.multiply(s);
        }
               System.out.println(a);
    }
}
