package CodingBat.Functional_1;

/*
Given a list of integers, return a list where each integer is multiplied by 2.


doubling([1, 2, 3]) → [2, 4, 6]
doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
doubling([]) → []
 */

import java.util.List;
import java.util.stream.Collectors;

public class Doubling {
    public List<Integer> doubling(List<Integer> nums) {

        nums = nums.stream().map(n -> n * 2).collect(Collectors.toList());
        return nums;
    }
}
