package plusMinus;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        double posNumbers = 0;
        double negNumbers = 0;
        double zeroNums = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) negNumbers += 1;
            else if (arr.get(i) > 0) posNumbers += 1;
            else zeroNums+= 1;
        }
        double posRatio = posNumbers/arr.size();
        double negRatio = negNumbers/arr.size();
        double zeroRatio = zeroNums/arr.size();
        System.out.println(posRatio);
        System.out.println(negRatio);
        System.out.println(zeroRatio);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}