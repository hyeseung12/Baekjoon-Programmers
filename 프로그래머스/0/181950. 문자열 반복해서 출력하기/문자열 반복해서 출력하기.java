import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next(), answer = "";
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) answer += str;
        System.out.println(answer);
    }
}