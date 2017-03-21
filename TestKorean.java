package testing;
import java.io.*;
import testing.Korean;

public class TestKorean {

	public static void main(String[] args) {
		
		//to make Korean, we use : koreanBuild(String, char), koreanBuild(String, String), koreanBuild(String), koreanBuild(char)
		
		//1. useage. prototype is koreanBuild(String, char) and use like below
		System.out.println("\n1. koreanBuild(String, char) test ======================================");
		String str = Korean.koreanBuild("", '\u1100');
		System.out.println("test1. ㄱ : "+str);
		str = Korean.koreanBuild(str, '\u1161');
		System.out.println("test2. 가 : "+str);
		str = Korean.koreanBuild(str, '\u11a8');
		System.out.println("test3. 각 : "+str);
		str = Korean.koreanBuild(str, '\u314e');
		System.out.println("test4. 각ㅎ : "+str);
		str = Korean.koreanBuild(str, '\u314f');
		System.out.println("test5. 각하 : "+str);
		System.out.println();
		
		//2. Input TEST
		System.out.println("\n2. Input test ========================================================");
		System.out.print("Input : "); 
		int ch = 'a';
		char cc;
		String tmp = "";
		String comp = "";
		InputStreamReader input = new InputStreamReader(System.in);
		//break if '.' input
		int i = 0;
		while(ch!='\u002e'){
			try {
				ch = input.read();
				cc = (char) ch;
				if(i<= 8 || i >= 17){
					comp = Korean.convert(cc, "COMP");
				}else{
					comp = ""+cc;
				}
				i++;
				tmp = Korean.koreanBuild(tmp, comp);
				System.out.println(comp+"("+Korean.getUnicode(comp)+") : "+tmp);
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		
		//3. Unicode Char Test. 
		//Lead, Vowel, Tail jamo is printed to Compatibility. becuase it is not printed as jamo
		System.out.println("\n3. Unicode Char Test =================================================");
		int j = 0;
		System.out.println("\nCompatibility Korean");
		for(char c = 0x3131 ; c<= 0x3163; c++){
			str = Korean.koreanBuild(c);
			System.out.println(str+"\t"+Korean.getUnicode(str) +"  ");
//			j++;
//			if(j%10==0) 
//				System.out.println();
			
		}
		j = 0;
		System.out.println("\nMultiple Korean");
		for(char c = 0xac00 ; c<= 0xacff; c++){
			str = Korean.koreanBuild(c);
			System.out.print(str+" : "+Korean.getUnicode(str) +"  ");
			j++;
			if(j%10==0) 
				System.out.println();
		}
		j = 0;
		System.out.println("\nKorean Lead Jamo");
		for(char c = 0x1100 ; c<= 0x1112; c++){
			str = Korean.koreanBuild(c);
			System.out.print(str+" : "+Korean.getUnicode(str) +"  ");
			j++;
			if(j%10==0) 
				System.out.println();
		}
		j = 0;
		System.out.println("\nKorean Tail Jamo");
		for(char c = 0x11a8 ; c<= 0x11c2; c++){
			str = Korean.koreanBuild(c);
			System.out.print(str+" : "+Korean.getUnicode(str) +"  ");
			j++;
			if(j%10==0) 
				System.out.println();
		}
		j = 0;
		System.out.println("\nKorean Vowel Jamo=========================================");
		for(char c = 0x1161 ; c<= 0x1175; c++){
			str = Korean.koreanBuild(c);
			System.out.print(str+" : "+Korean.getUnicode(str) +"  ");
			j++;
			if(j%10==0) 
				System.out.println();
		}
		


		
	}

}
