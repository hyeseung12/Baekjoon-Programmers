import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ch = sc.next().toCharArray();
		for (int i = ch.length - 1; i >= 0; i--)
			System.out.print(ch[i]);
	}
}