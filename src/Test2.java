/*
m = 총 게시물, n = 한 페이지에 게시되는 게시물 수
사용되는 총 페이지수를 구하라
*/

import java.util.Scanner;

public class Test2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String sParse = sc.nextLine();
        String cParse[] = sParse.split(" ");

        int m = Integer.parseInt(cParse[0]);
        int n = Integer.parseInt(cParse[1]);

        int result = 0;
        if(m == 0) result = 0;
        else if(m%n == 0) result = m/n;
        else result = m/n+1;

        System.out.println(result);
    }
}
