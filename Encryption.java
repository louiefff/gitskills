package EncryptionAndDecryption;
import java.util.Random;
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

void judgment(String code) {//判断密码强度
char []chararray=code.toCharArray();
int number=0;
int mini=0;
int max=0;
while(true) {
if(chararray.length<8) {//密码长度小于8个字符为弱强度
System.out.println("该密码为弱密码!!");break;	
}
else {
for(int a=0;a<chararray.length;a++) {
if(chararray[a]>='0' && chararray[a]<='9') {
number++;	
}

if(chararray[a]>='a' && chararray[a]<='z') {
mini++;	
}

if(chararray[a]>='A' && chararray[a]<='Z') {
max++;	
}
}

}
if(number==chararray.length||mini==chararray.length||max==chararray.length) {//长度大于等于8个字符但只有一种字符类型为弱强度
System.out.println("该密码为弱强度密码！！");break;	
}

if(mini==0||max==0) {//长度大于等于8包含至少一个数字和一个字母为中强度
System.out.println("该密码为中强度密码！！");break;	
}

if(number!=0 && mini!=0 && max!=0) {//长度大于等于8并数字和大小写都有为高强度
System.out.println("该密码为高强度密码！！");break;	
}

}
}

void passwordgeneration(int length) {
char []codearray=new char[length];
Random random = new Random();
int number=0;
int mini=0;
int max=0;
for(int i=0;i<length;i++) {
int choice=random.nextInt(3)+1;

if(i>=length/2&&max==0) {
choice=1;	
}
if(i>=length/2&&mini==0) {
choice=2;	
}
if(i>=length/2&&number==0) {
choice=3;	
}
switch(choice) {
case 1:codearray[i]=(char)(random.nextInt(26)+'A');max++;break;
case 2:codearray[i]=(char)(random.nextInt(26)+'a');mini++;break;
case 3:codearray[i]=(char)(random.nextInt(10)+'0');number++;break;
}

}
StringBuilder codeString = new StringBuilder();
for (int i = 0; i <codearray.length; i++) {
    codeString.append(codearray[i]);
}
System.out.println("密码为"+codeString.toString());
}


}
