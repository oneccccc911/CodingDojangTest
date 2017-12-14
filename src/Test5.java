/*
6 6

  0   1   2   3   4   5
 19  20  21  22  23   6
 18  31  32  33  24   7
 17  30  35  34  25   8
 16  29  28  27  26   9
 15  14  13  12  11  10

위처럼 6 6이라는 입력을 주면 6 X 6 매트릭스에 나선형 회전을 한 값을 출력해야 한다.
*/

import java.util.Scanner;

public class Test5 {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        String sParse[] = sc.nextLine().split(" ");
        int m = Integer.parseInt(sParse[0]);
        int n = Integer.parseInt(sParse[1]);

        int mattrix[][] = new int[m][n];

        int flag = 0;
        //0 => 오른쪽, 1 => 아래, 2 => 왼, 3 => 위

        int startM = 0, startN = 0;
        int x=0, y=0;
        int a = m, b = n;

        for(int i = 0 ; i < a*b ; i++){
            mattrix[y][x] = i;

            if(flag == 0){
                x++;
                if(x==n-1){
                    n--;
                    flag++;
                }
            }
            else if(flag == 1){
                y++;
                if(y==m-1) {
                    m--;
                    flag++;
                }
            }
            else if(flag == 2){
                x--;
                if(x==startM) {
                    flag++;
                    startM++;
                }
            }
            else {
                y--;
                if (y == startN) {
                    flag = 0;
                    startN++;
                    x++;
                    y++;
                    //한 바퀴 돌면 좌표 재정비
                }
            }
        }

        for (int i  = 0 ; i < a ; i++){
            for(int j = 0 ; j < b ; j++){
                System.out.print(mattrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
