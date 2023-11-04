package EncryptionAndDecryption;
import java.util.*;
public class Main {

	public static void main(String[] args) {
    Encryption e1=new Encryption();
    boolean i=true;
    while(i) {   
    Scanner in =new Scanner(System.in);
    String code;
    System.out.println("==============================\r\n"
    		+ "欢迎使用密码管理系统\r\n"
    		+ "==============================\r\n"
    		+ "请输入选项:\n1.加密 \n2.解密 \n3.判断密码强度 \n4.密码生成 \n5.输入任意键退出");
    int choice= in.nextInt();
    switch(choice) {
    case 1:System.out.println("请输入密码:");  code=in.next();e1.encryption(code);break;
    case 2:System.out.println("请输入密码:");  code=in.next();e1.decryption(code);break;
    case 3:System.out.println("请输入密码:");  code=in.next();e1.judgment(code);break;
    case 4:System.out.println("请输入密码长度:");int len=in.nextInt();e1.passwordgeneration(len); break;
    default:
    in.close();	i=false;
    }
    }
	}

}
