//package leetCode.DataStructure;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class k {
//    public static String[] solution(String[] words, long width){
//
//    List<String> res=new ArrayList<>();
//    List<StringBuilder> line=new ArrayList<>();
//    long totLetters=0;
//        for(String word:words) {
//        long len=word.length(), size=line.size();
//        if(totLetters+size+len>width) {
//            long space = width - totLetters;
//            if(size==1) {
//                res.add(line.get(0).toString()+" ".repeat((int)space));
//            } else {
//                long spc=space/(size-1), r=space%(size-1);
//                for(int i=0;i<r;i++)
//                    line.get(i).append(" ");
//                res.add(String.join(" ".repeat(spc),line));
//            }
//            totLetters=0;
//            line.clear();
//        }
//        totLetters+=len;
//        line.add(new StringBuilder(word));
//    }
//    String last=String.join(" ",line);
//        res.add(String.format("%-"+width+"s",last));
//
//    String array[] = new String[res.size()];
//		for(int j =0;j<res.size();j++){
//        array[j] = res.get(j);
//    }
//        return array;
//}
//}
