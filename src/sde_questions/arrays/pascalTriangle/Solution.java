package sde_questions.arrays.pascalTriangle;

import java.util.ArrayList;
import java.util.List;
//https://www.youtube.com/watch?v=ZFgJrfbaXT8
class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList();

        for (int i = 1; i <= numRows; i++) {

            List<Integer> row = new ArrayList();
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    row.add(1);
                } else {
                    row.add(result.get(i - 2).get(j - 1) + result.get(i - 2).get(j));
                }
            }

            result.add(row);
        }
        return result;
    }

}

