import java.util.Scanner;

/*
문자열을 입력받아서, 같은 문자가 연속적으로 반복되는 경우에 그 반복 횟수를 표시하여 문자열을 압축하기.

입력 예시: aaabbcccccca

출력 예시: a3b2c6a1
*/
public class Test6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String sParse[] = sc.nextLine().split("");

        String s = sParse[0];
        int count = 0;
        for(int i = 0 ; i < sParse.length ; i++){
            if(s.equals(sParse[i])){
                count++;
            }
            else{
                System.out.print(sParse[i-1]+count);
                s=sParse[i];
                count = 1;
            }
        }
        System.out.print(sParse[sParse.length-1]+count);
    }
}
