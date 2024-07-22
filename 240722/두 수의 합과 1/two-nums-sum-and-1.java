import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;

        int Answer=0;

        for(int i=0;i<String.valueOf(sum).length();i++){
            if(String.valueOf(sum).charAt(i)=='1') Answer+=1;
        }

        System.out.println(Answer);
    }
}