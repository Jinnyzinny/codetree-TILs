import java.util.*;
import java.io.*;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String[] input=br.readLine().split(" ");

        int Answer=0;
        for(int i=0;i<Integer.parseInt(input[0]);i++){
            String Compare=br.readLine();
            if(input[1].equals(Compare))Answer++;
        }
        System.out.println(Answer);
    }
}