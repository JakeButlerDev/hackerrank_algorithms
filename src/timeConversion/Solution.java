package timeConversion;

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
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        String amOrPm = s.substring(8, 10);
        String hour = s.substring(0, 2);
        int hourNum;

        if (hour.equals("12") && amOrPm.toLowerCase().charAt(0) == 'a') {
            hour = "00";
        } else if (hour.equals("12") && amOrPm.toLowerCase().charAt(0) == 'p') {
            hour = "12";
        }
        if (amOrPm.toLowerCase().charAt(0) == 'p') {
            hourNum = Integer.parseInt(hour) + 12;
            hour = Integer.toString(hourNum);
        }
        return hour + s.substring(2, s.length()-2);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
