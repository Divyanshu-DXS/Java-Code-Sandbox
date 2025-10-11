package CodingBat.Functional_1;

import com.sun.source.tree.UsesTree;

import java.util.List;
import java.util.stream.Collectors;

/*

Given a list of strings, return a list where each string is converted to lower case (Note: String toLowerCase() method).


lower(["Hello", "Hi"]) → ["hello", "hi"]
lower(["AAA", "BBB", "ccc"]) → ["aaa", "bbb", "ccc"]
lower(["KitteN", "ChocolaTE"]) → ["kitten", "chocolate"]
 */
public class Lower {
    public List<String> lower(List<String> strings) {

        strings= strings.stream().map(n->n.toLowerCase()).collect(Collectors.toList());
        return strings;
    }
}
