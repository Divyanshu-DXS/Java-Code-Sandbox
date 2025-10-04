package CodingBat.Map_1;

import java.util.Map;

/*
Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys. If both keys are present, append their 2 string values together and store the result under the key "ab".


mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
mapAB({"a": "Hi"}) → {"a": "Hi"}
mapAB({"b": "There"}) → {"b": "There"}
 */
public class mapAB {
    public Map<String, String> mapAB(Map<String, String> map) {

        if (map.get("a")!=null&&map.get("b")!=null){
            map.put("ab",(map.get("a")+map.get("b")));
        }
        return map;
    }

}
