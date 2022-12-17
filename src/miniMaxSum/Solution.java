package miniMaxSum;

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
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Long sum = 0l;
        Long min = Long.MAX_VALUE;
        Long max = Long.MIN_VALUE;
        for(int i = 0; i < arr.size(); i++){
            sum += arr.get(i);
            min = Math.min(min, arr.get(i));
            max = Math.max(max, arr.get(i));
        }
        Long minS = sum - max, maxS = sum - min;

        System.out.println(((minS<maxS)?minS:maxS)+" "+((minS>maxS)?minS:maxS));
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
