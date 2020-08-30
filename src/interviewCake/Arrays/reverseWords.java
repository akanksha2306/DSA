package interviewCake.Arrays;

public class reverseWords {

    public static String reverseCharacters(char[] message) {
        int start = 0;
        int end = message.length - 1;

        while (start < end) {
            char temp = message[start];
            message[start] = message[end];
            message[end] = temp;
            start++;
            end--;
        }


        return message.toString();
    }

    public static void reverseWords(char[] message) {


        reverseCharacters(message);

        int currentWordStartIndex = 0;
        for (int i = 0; i <= message.length; i++) {

            if (i == message.length || message[i] == ' ') {

                reverseCharacters(message);
                currentWordStartIndex = i + 1;
            }
        }
    }


    public static void main(String[] args) {

        char[] message = {'a', 'b', 'c'};
        String s = reverseCharacters(message);
        System.out.println(s);

    }
}



