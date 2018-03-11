import java.util.HashSet;
import java.util.Set;

/*
 * 【题目描述】
《奇妙的数字》小明发现了一个奇妙的数字。它的平方和立方正好把0~9的10个数字每个用且只用了一次。你能猜出这个数字是多少吗？
请填写该数字，不要填写任何多余的内容。
【题目分析】
1)利用Java 的set集合，集合中的数字不可以重复;
2)在while循环中分别算出平方与立方，并且将各个位数的数字放到set集合中，如果set集合的大小正好等于10，则结束循环。
 */
public class number {
	public static void main(String[] args) {
		int num = 0, pf = 0, lf = 0, n = 0;
		while (n != 10) {
			num++;
			Set<Integer> set = new HashSet<Integer>();// 利用set的元素不重复性
			pf = num * num;
			lf = num * num * num;
			while (pf != 0) {
				set.add(pf % 10);
				pf /= 10;
			}
			while (lf != 0) {
				set.add(lf % 10);
				lf /= 10;
			}
			n = set.size();
		}
		System.out.println(num);
	}

}
