/*
주어진 문자열(공백 없이 쉼표로 구분되어 있음)을 가지고 아래 문제에 대한 프로그램을 작성하세요.

이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌
1. 김씨와 이씨는 각각 몇 명 인가요?
2. "이재영"이란 이름이 몇 번 반복되나요?
3. 중복을 제거한 이름을 출력하세요.
4. 중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요.
*/

import java.util.*;

public class Test8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String sParse[] = sc.nextLine().split(",");

        int count = 0;
        for(int i = 0 ; i < sParse.length ; i++){
            String temp[] = sParse[i].split("");
            if(temp[0].equals("이")||temp[0].equals("김")) count++;
        }
        System.out.println("1. 김씨와 이씨는 각각 몇 명 인가요? " + count);

        count = 0;
        for (int i = 0 ; i < sParse.length ; i++){
            if(sParse[i].equals("이재영")) count++;
        }
        System.out.println("2. '이재영'이란 이름이 몇 번 반복 되나요? " + count);

        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0 ; i < sParse.length ; i++){
            list.add(sParse[i]);
        }

        HashSet hs = new HashSet();
        hs.addAll(list);
        list.clear();
        list.addAll(hs);

        System.out.println("3. 중복을 제거한 이름을 출력하세요. ");
        for(int i = 0 ; i < list.size() ; i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();


        // 오름차순 정렬
        Ascending ascending = new Ascending();
        Collections.sort(list, ascending);

        System.out.println("4. 중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요. ");
        for(int i = 0 ; i < list.size() ; i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

    }

    //오름차순
    static class Ascending implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }

    }
}
