package xiangmu;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Cipher c=new Cipher();
		boolean flag=true;
		while(flag) {
			Scanner scan=new Scanner(System.in);
			System.out.println("ZCJ修改LGY的代码");
			System.out.println("--------------");
			System.out.println("欢迎使用密码管理系统");
			System.out.println("--------------");
			System.out.println("请选择操作");
			System.out.println("1.加密");
			System.out.println("2.解密");
			System.out.println("3.判断密码强度");
			System.out.println("4。密码生成");
			System.out.println("5.退出");
			int a=scan.nextInt();
			switch(a) {
            case 1:
				c.encryption();
				break;
            case 2:
          	  c.decryption();
          	  break;
            case 3:
          	  c.strengh();
          	  break;
            case 4:
          	  c.gerenate();
          	  break;
            case 5:
            	 flag=false;
           	  break;
            default:
      		  System.out.println("请重新输入！");
      		  break;
	}
	}
	}

}
