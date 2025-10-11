package CodingBat.Functional_1;
/*

Given a list of strings, return a list where each string has "*" added at its end.


addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
addStar(["hello", "there"]) → ["hello*", "there*"]
addStar(["*"]) → ["**"]
 */

import java.util.List;
import java.util.stream.Collectors;

public class AddStar {
    public List<String> addStar(List<String> strings) {

        strings=strings.stream().map(n->n+"*").collect(Collectors.toList());
        return strings;
    }
}
