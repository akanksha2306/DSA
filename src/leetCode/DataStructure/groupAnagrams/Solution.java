package leetCode.DataStructure.groupAnagrams;

import java.util.*;

public class Solution {

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s: strs){

            char[] c = s.toCharArray();
            Arrays.sort(c);
            String keyStr = String.valueOf(c);
            System.out.println(keyStr);
            if(!map.containsKey(keyStr)){
                map.put(keyStr, new ArrayList<>());
            }
            map.get(keyStr).add(s);//draw the diagram and do this

        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String []str = new String[]{"eat","tea","tan","ate","nat","bat"};
        List<List<String>> ans = groupAnagrams(str);
        System.out.println(ans);

    }
}
