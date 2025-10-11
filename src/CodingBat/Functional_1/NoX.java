package CodingBat.Functional_1;
/*
Given a list of strings, return a list where each string has all its "x" removed.


noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
noX(["x"]) → [""]
 */

import java.util.List;
import java.util.stream.Collectors;

public class NoX {
    public List<String> noX(List<String> strings) {

        strings=strings.stream().map(n->n.replace("x","")).collect(Collectors.toList());
        return strings;
    }

}
