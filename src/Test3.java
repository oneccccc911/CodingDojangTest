/*
1차원의 점들이 주어졌을 때, 그 중 가장 거리가 짧은 것의 쌍을 출력하는 함수를 작성하시오. (단 점들의 배열은 모두 정렬되어있다고 가정한다.)
예를들어 S={1, 3, 4, 8, 13, 17, 20} 이 주어졌다면, 결과값은 (3, 4)가 될 것이다.
*/

import java.util.Scanner;

public class Test3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String sParse[] = sc.nextLine().split(" ");
        int points[] = new int[sParse.length];
        for(int i = 0; i < sParse.length ; i++){
            points[i] = Integer.parseInt(sParse[i]);
        }
        int x = points[0]; int y = points[1];
        for(int i = 1; i< points.length - 1; i++){
            if(points[i+1] - points[i] < y - x){
                x = points[i];
                y = points[i+1];
            }
        }
        System.out.println("(" + x + ", " + y + ")");
    }
}
