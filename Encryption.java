package EncryptionAndDecryption;
public class Encryption {

void encryption(String code){//加密方法
char []chararray=code.toCharArray();

for(int n=0;n<chararray.length;n++) {//字符偏移
chararray[n]=(char) (chararray[n]+n+4);	
}

char temp=chararray[0];//首尾交换
chararray[0]=chararray[chararray.length-1];
chararray[chararray.length-1]=temp;

int start = 0;//字符串反转
int end = chararray.length - 1;
while (start < end) {
    char Temp = chararray[start];
    chararray[start] = chararray[end];
    chararray[end] = Temp;
    start++;
    end--;
}
String Code=String.copyValueOf(chararray);
System.out.println("加密后:"+Code);
}

void decryption(String code) {//解密方法
char []chararray=code.toCharArray();

int start = 0;//字符串反转
int end = chararray.length - 1;
while (start < end) {
    char Temp = chararray[start];
    chararray[start] = chararray[end];
    chararray[end] = Temp;
    start++;
    end--;
}

char temp=chararray[0];//首尾交换
chararray[0]=chararray[chararray.length-1];
chararray[chararray.length-1]=temp;

for(int n=0;n<chararray.length;n++) {//字符偏移
chararray[n]=(char) (chararray[n]-(n+4));	
}
String Code=String.copyValueOf(chararray);
System.out.println("解密后:"+Code);
}

}
