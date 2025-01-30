package gr.aueb.cf.ch2;

import java.math.BigInteger;

public class BigIntApp {

    public static void main(String[] args) {
        BigInteger bigNum1 = new BigInteger("123456678789");
        BigInteger bigNum2 = new BigInteger("1232343412335346575686");
        BigInteger result;

        result = bigNum1.add(bigNum2);

        System.out.printf("%,d", result);
    }
}
