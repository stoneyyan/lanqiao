package lanqiaobei;

import java.util.Scanner;

/*
 描述
输入正整数k,找到所有的正整数x≧y，使得 1/k=1/x+1/y 。
输入
输入多组数据，每组一行，每行包含一个正整数k(k<50)
输出
输出多组数据，每组数据第一行表示找到的解个数。后几行每行输出一个解
样例输入：
2
12
样例输出：
2
1/2 = 1/6 + 1/3
1/2 = 1/4 + 1/4
8
1/12 = 1/156 + 1/13
1/12 = 1/84 + 1/14
1/12 = 1/60 + 1/15
1/12 = 1/48 + 1/16
1/12 = 1/36 + 1/18
1/12 = 1/30 + 1/20
1/12 = 1/28 + 1/21
1/12 = 1/24 + 1/24
暴力破解（没有对内存进行限制）
 */
public class split {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();//输入的数据个数
		int k[]=new int[n];
		for(int i=0;i<n;i++){
			k[i]=s.nextInt();
		}
		//k=xy/x+y
		for(int i=0;i<n;i++){
		for(int x=1;x<1000;x++){
			for(int y=1;y<=x;y++){
					if(k[i]==(x*y)/(x+y)&&(x*y)%(x+y)==0){//如果没有(x*y)%(x+y)==0，则会出现类似1/2=1/7+1/4的情况
						System.out.println("1/"+k[i]+"="+"1/"+x+"+"+"1/"+y);
					}
				}
			}
		}
	}
	

}
