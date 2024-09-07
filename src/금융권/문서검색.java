package 금융권;


import java.util.Scanner;

public class 문서검색 {

    public static long countChar(String str, char ch) {
        return str.chars()
                .filter(c -> c == ch)
                .count();
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        String str3 = str1.replaceAll(str2, "*");
        System.out.println(countChar(str3, '*'));
    }
}
