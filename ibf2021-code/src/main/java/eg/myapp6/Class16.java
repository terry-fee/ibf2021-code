package eg.myapp6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Class16 
{
    public static void main(String[] args) {
        String[] words = new String[]
                {"this", "is", "a", "nice", "cat"};
        List<String> listOfWords = new ArrayList<>(Arrays.asList(words));
        List<String> evenLengthWords = new LinkedList<>();

        for (String w: listOfWords) 
            if (0 == (w.length() & 1)) 
		        evenLengthWords.add(w.toUpperCase());


        // The code below does the same thing as above
        List<String> listOfWords2 = new ArrayList<>(Arrays.asList(words));
        List<String> evenLengthWords2 = listOfWords2.stream()
		        .filter(w -> 0 == (w.length() & 1))
		        .map(String::toUpperCase)
		        .collect(Collectors.toList());

        System.out.println("Final list of words is: " + evenLengthWords);
        System.out.println("Final list of words using streams is: "
                 + evenLengthWords2);
    }    
}
