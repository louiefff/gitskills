package EncryptionAndDecryption;
import java.util.*;
public class Main {

	public static void main(String[] args) {
    Encryption e1=new Encryption();
    boolean i=true;
    while(i) {
    System.out.println("请输入密码:");
    Scanner in =new Scanner(System.in);
    String code=in.next();
    System.out.println("请输入选项:1.加密 2.解密 3.输入任意键退出");
    int choice= in.nextInt();
    switch(choice) {
    case 1: e1.encryption(code);break;
    case 2: e1.decryption(code);break;
    default:
    in.close();	i=false;
    }
    }
	}

}
