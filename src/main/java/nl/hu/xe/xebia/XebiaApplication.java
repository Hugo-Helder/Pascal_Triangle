package nl.hu.xe.xebia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class XebiaApplication {

    public static void main(String[] args) {
        SpringApplication.run(XebiaApplication.class, args);
    }

    /**
     * @return
     *         nCi = n! / (i! * (n-i)!)   – ith element of nth row
     *         nCi+1 = n! / ((i+1)! * (n-(i+1))! )  – (i+1)th element of nth row
     *         Dividing  (i+1)th element by ith element will give:
     *         nCi+1 / nCi = i! * (n-i)! / (i+1)! * (n-i-1)!  – On solving this
     *         nCi+1 = nCi  * (n-i) / (i+1) –  we get (i+1)th element with the help of ith element
     */
    List<Integer> triangleRow(int row) {
        ArrayList<Integer> pascalRow = new ArrayList<>();

        if (row < 0) {
            return List.of();
        }
        int previousValue = 1;
        pascalRow.add(previousValue);

        for (int i = 1; i <= row; i++) {

            // nCr = (nCr-1 * (n - r + 1))/r
            // https://www.geeksforgeeks.org/ncr-formula/
            // only generate numbers for the row specified
            int nCr = (previousValue * (row - i + 1)) / i;
            pascalRow.add(nCr);
            previousValue = nCr;
        }
        return pascalRow;
    }

}







