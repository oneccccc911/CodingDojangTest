/*
숫자 형태의 문자열을 콤마가 포함된 금액 표기식 문자열로 바꾸어주는 프로그램을 작성하시오.

※ 단, 프로그래밍 언어에서 지원하는 금액변환 라이브러리는 사용하지 말것

예)

숫자      	금액
1000	    1,000
20000000	20,000,000
-3245.24	-3,245.24

*/

import java.util.ArrayList;
import java.util.Scanner;

public class Test7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String sParse[] = sc.nextLine().split("");

        boolean sosu = false;
        int sPoint = 0;

        for(int i = 0 ; i < sParse.length ; i++){
            if(sParse[i].equals(".")){
                sosu = true;
                sPoint = i;
            }
        }

        int komma = 0;
        ArrayList<String> list = new ArrayList<String>(sParse.length*2);

        if(sosu == true){
            //소수점이 있을 때
            for(int i = sParse.length - 1 ; i > sPoint ; i--){
                list.add(sParse[i]);
            }
            list.add(sParse[sPoint]);
            for(int i = sPoint - 1 ; i >= 0 ; i--){
                list.add(sParse[i]);
                komma++;
                if(sParse[0].equals("-")){
                    if(i > 1 && komma %3 == 0) {
                        list.add(",");
                        komma = 0;
                    }
                }
                else{
                    if(komma%3==0 && i != 0){
                        list.add(",");
                        komma = 0;
                    }
                }
            }
        }
        else{
            //소수점이 없을 때
            for(int i = sParse.length - 1 ; i >= 0 ; i--){
                list.add(sParse[i]);
                komma++;
                if(sParse[0].equals("-")){
                    if(i > 1 && komma %3 == 0) {
                        list.add(",");
                        komma = 0;
                    }
                }
                else{
                    if(komma%3==0 && i != 0){
                        list.add(",");
                        komma = 0;
                    }
                }

            }
        }

        for(int i = list.size() - 1 ; i >= 0 ; i--){
            System.out.print(list.get(i));
        }

    }
}
