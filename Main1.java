package lanqiaobei3;

/*
 * A+B/C+DEF/GHI=10
 */
public class Main1 {
	double arr[] = new double[9];
	int record = 0;

	public boolean cheak(int n, int t) {
		for (int i = 0; i <= n; i++) {
			if (arr[i] == t) {
				return false;
			}
		}
		return true;
	}


	public void dfs(int n,int t){
		arr[n]=t;
		if(n==8){
			if(arr[0]+arr[1]/arr[2]+(arr[3]*100+arr[4]*10+arr[5])/(arr[6]*100+arr[7]*10+arr[8])==10.0){
				record++;
			}
		}
		else{
			for(int i=1;i<=9;i++){
				if(cheak(n,i)){
					dfs(n+1,i);
				}
			}
		}
	}
	public static void main(String arg[]){
		Main1 q=new Main1();
		for(int i=1;i<=9;i++){
			q.dfs(0, i);
		}
		System.out.println(q.record);
		
	}
}