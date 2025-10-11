package CodingBat.Functional_1;

/*
Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.


copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
copies3(["24", "a", ""]) → ["242424", "aaa", ""]
copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"]
 */

import java.util.List;
import java.util.stream.Collectors;

public class Copies3 {
    public List<String> copies3(List<String> strings) {

        strings=strings.stream().map(n->n+n+n).collect(Collectors.toList());
        return  strings;
    }


}
