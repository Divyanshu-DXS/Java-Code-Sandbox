package CodingBat.Functional_1;

/*
Given a list of integers, return a list where each integer is multiplied with itself.


square([1, 2, 3]) → [1, 4, 9]
square([6, 8, -6, -8, 1]) → [36, 64, 36, 64, 1]
square([]) → []
 */

import java.util.List;
import java.util.stream.Collectors;

public class Square {
    public List<Integer> square(List<Integer> nums) {
        nums=nums.stream().map(n->n*n).collect(Collectors.toList());
        return nums;
    }

}
