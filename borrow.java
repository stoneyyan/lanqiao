package lanqiaobei3;
import java.util.Scanner;
public class borrow {//递归思想，只有有人还鞋 ，才可以借鞋，3 2 的情况，hjhjh,hhhjj,hhjjh,hjhhj,hhjhj 五种
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		int n = input.nextInt();
		System.out.println(fun(m, n)); 
	}

	public static int fun(int m, int n) {
		if (m < n) {//如果还的人比借的人多，则没有排序方法
			return 0;
		} else if (n == 0) {//如果没有借的人，则只有一种排序方法，所有还鞋的人排好就可以了
			return 1;
		} else
			return fun(m - 1, n) + fun(m, n - 1);//递归f(2,2)+f(3,1)=+f(2,1)+f(2,1)+f(3,0)=f(1,1)+f(2,0)
		//                                       +f(1,1)+f(2,0)+1=2f(0,1)+2f(1,0)+1+1+1=5 
		//                                        解释：先从第一个人开始排，如果第一个人还鞋，下一次就是f(m-1,n)
		//											如果第一个人借鞋，下一次就是f(m,n-1)
	}
}