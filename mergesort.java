/*
 * 归并排序
      通过递归依次将序列二分成若干个子序列，然后依次回溯对两两子序列进行归并。
     归并过程是，将两个序列从第一位开始依次进行比较，把较小的那位放在创建好的临时序列里,
     直到其中一个序列已经全部放入临时序列中，则再将另一个序列的剩下位数全部依次放入临时序列中（剩下的位数都已经是有序的），
     最后将临时序列复制给结果序列。
 */
public class mergesort {
	int a[]={23,31,55,77,52,18,61};
	int length=a.length;
	
	void merge(int start,int mid,int end){
		int temp[]=new int[end-start+1];
		int i=start;
		int j=mid+1;
		int k=0;
		while(i<=mid&&j<=end){//将较小的放在创建好的临时数组里
			if(a[i]>=a[j]){
				temp[k++]=a[j++];
			}else{
				temp[k++]=a[i++];
			}
		}
		while(i<=mid){//将另一个序列中剩下的数全部放入临时数组中
			temp[k++]=a[i++];
		}
		while(j<=end){
			temp[k++]=a[j++];
		}
		for(int n=0;n<temp.length;n++){
			a[start+n]=temp[n];
		}
	}

		void sort(int start,int end){
			if(end<=start)
				return;
			int mid=(start+end)/2;
			sort(start,mid);
			sort(mid+1,end);
			merge(start,mid,end);
		}
		public static void main(String arg[]){
			mergesort m=new mergesort();
			m.sort(0, m.length-1);
			for(int i=0;i<m.length;i++){
				System.out.print(m.a[i]+" ");
			}
			
		}
}
