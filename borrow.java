package lanqiaobei3;
import java.util.Scanner;
public class borrow {//�ݹ�˼�룬ֻ�����˻�Ь ���ſ��Խ�Ь��3 2 �������hjhjh,hhhjj,hhjjh,hjhhj,hhjhj ����
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		int n = input.nextInt();
		System.out.println(fun(m, n)); 
	}

	public static int fun(int m, int n) {
		if (m < n) {//��������˱Ƚ���˶࣬��û�����򷽷�
			return 0;
		} else if (n == 0) {//���û�н���ˣ���ֻ��һ�����򷽷������л�Ь�����źþͿ�����
			return 1;
		} else
			return fun(m - 1, n) + fun(m, n - 1);//�ݹ�f(2,2)+f(3,1)=+f(2,1)+f(2,1)+f(3,0)=f(1,1)+f(2,0)
		//                                       +f(1,1)+f(2,0)+1=2f(0,1)+2f(1,0)+1+1+1=5 
		//                                        ���ͣ��ȴӵ�һ���˿�ʼ�ţ������һ���˻�Ь����һ�ξ���f(m-1,n)
		//											�����һ���˽�Ь����һ�ξ���f(m,n-1)
	}
}