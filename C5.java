import java.util.Scanner;

public class C5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		int n=str.length();
		int vowel=0, consonant=0,svowel=0, sconsonant=0;

		for(int i=0; i<n; i++) {
			char ch = str.charAt(i);
			if(ch>=65 && ch<=90) {
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
					vowel++;
				}
				else if(ch!=' '){
					consonant++;
				}
			}
			else if(ch>=97&&ch<=122) {
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					svowel++;
				}
				else if(ch!=' '){
					sconsonant++;
				}
			}
		}
		System.out.println();
		System.out.println("Vowel = "+vowel);
		System.out.println("Consonant = "+consonant);
		System.out.println("Small Vowel = "+svowel);
		System.out.println("Small Consonant = "+sconsonant);
	}
}