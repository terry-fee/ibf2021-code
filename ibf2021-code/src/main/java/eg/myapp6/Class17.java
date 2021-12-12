package eg.myapp6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Class17 
{
    public static void main(String[] args) throws FileNotFoundException{
        BufferedReader reader = new BufferedReader(new FileReader("D:\\Blah\\some.txt"));
        
        //long numOfLines = reader.lines().count();

        List<String> unique = reader.lines()
                .flatMap(line -> Stream.of(line.split("\\s+")))
                .map(String::trim)  // Same as map(s -> s.trim())
                .map(String::toLowerCase) // Same as map(s -> s.toLowerCase())
                .distinct()
                .sorted((w0, w1) -> w0.length() - w1.length())
                .collect(Collectors.toList());

        System.out.println(unique);
    }
}
