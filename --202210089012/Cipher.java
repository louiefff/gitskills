package xiangmu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
public class Cipher {
	String plaintext;
	String ciphertext;
	
	Scanner input=new Scanner(System.in);
	
	ArrayList List1=new ArrayList();
	ArrayList List2=new ArrayList();
	ArrayList List3=new ArrayList();
	ArrayList List4=new ArrayList();
	
	Cipher(){
		plaintext="";
		ciphertext="";}
	
	public void encryption() {
		String str;
		int ascnum;
		char firstnum;
		char lastnum;
		int size;
		System.out.println("请输入要加密的字符：");
		System.out.println("--------------");
		str=input.next();
		if(str.length()>16) {
			System.out.println("密码过长");
		}
		for(int i=0;i<str.length();i++) {
			 char plainChar=str.charAt(i);
			List1.add(plainChar);
		}
		for(int i=0;i<List1.size();i++) {
			char plainChar=(char) List1.get(i);
			ascnum=(int)plainChar+i+4;
			List1.set(i,(char)ascnum);
		}
		firstnum=(char) List1.get(0);
		size=List1.size()-1;
		lastnum=(char) List1.get(size);
		List1.set(0, lastnum);
		List1.set(size, firstnum);
		Collections.reverse(List1);
		System.out.println("加密的结果是");
		System.out.println(List1);
	}
	public void decryption() {
		String str;
		int ascnum;
		char firstnum;
		char lastnum;
		int size;
		System.out.println("请输入要解密的字符：");
		str=input.next();
		if(str.length()>16) {
			System.out.println("密码过长");
		}
		for(int i=0;i<str.length();i++) {
			 char cipherChar=str.charAt(i);
			List2.add(cipherChar);
		}
		Collections.reverse(List2);
		size=List2.size()-1;
		lastnum=(char) List2.get(size);
		firstnum=(char) List2.get(0);
		List2.set(0, lastnum);
		List2.set(size, firstnum);
		for(int i=0;i<List2.size();i++) {
			char plainChar=(char) List2.get(i);
			ascnum=(int)plainChar-i-4;
			List2.set(i,(char)ascnum);
		}
		System.out.println("解密的结果是");
		System.out.println(List2);
		
	}
	public void strengh() {
		String str;
		int shuzi=0;
		int dazimu=0;
		int xiaozimu=0;
		System.out.println("请输入要判断强度的密码：");
		str=input.next();
		for(int i=0;i<str.length();i++) {
			 char cipherChar=str.charAt(i);
			List3.add(cipherChar);
		}
			for(int a=0;a<List3.size();a++) {
				int ascnum=0;
				char strenghChar=(char) List3.get(a);
				ascnum=(int) strenghChar;
				if(ascnum>=48&&ascnum<=57) {
					shuzi++;
				}
				if(ascnum>=65&&ascnum<=90) {
					dazimu++;
				}
				if(ascnum>=97&&ascnum<=122) {
					xiaozimu++;
				}
			}
			if(List3.size()>=8&&(shuzi!=0&&dazimu!=0&&xiaozimu!=0)) {
				System.out.println("强度：高");
			}
			else if(List3.size()>=8&&(shuzi!=0&&(dazimu!=0||xiaozimu!=0))) {
				System.out.println("强度：中");
			}
			else if(List3.size()>8&&(shuzi!=0&&dazimu==0&&xiaozimu==0)||(shuzi==0&&dazimu!=0||xiaozimu!=0)){
				System.out.println("强度：弱");
			}
			else if(List3.size()<8){
				System.out.println("强度：弱");
			}
	}
	public void gerenate() {
		Random ran=new Random();
		int[] ascnum= {0,0,0};
		int ascnum1=0;
		int passnum=0;
		int i=0;
		String password;
		System.out.println("请输入要生成几位密码：");
		passnum=input.nextInt();
		for(int a=0;a<passnum;a++) {
			ascnum[0]=(int)ran.nextInt(10)+48;
			ascnum[1]=(int)ran.nextInt(26)+65;
			ascnum[2]=(int)ran.nextInt(26)+97;
			i=ran.nextInt(3);
			ascnum1=ascnum[i];
			List4.add(a, (char)ascnum1);
		}
		System.out.println("密码："+List4);
	}

}
