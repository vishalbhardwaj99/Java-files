import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

import javax.sound.sampled.SourceDataLine;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4, 6, 7, 8, 9, 0, 7, 6);

        // for(int i=0; i<nums.size(); i++)
        // {
        // System.out.println(nums.get(i));
        // }

        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        Stream<Integer> s3 = s2.map(n -> n * 2);
        int result = s3.reduce(0, (c, e) -> c + e);

        System.out.println(result);

        // int sum = 0;
        // for (int n : nums) {
        // if (n % 2 == 0) {
        // n = n * 2;
        // sum = sum + n;
        // }
        // }
        // System.out.println(sum);

    }
}
