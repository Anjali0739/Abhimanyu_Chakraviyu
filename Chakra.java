import java.util.*;
import java.text.DecimalFormat;
class Chakraa{
	public int[][] chakra(int q){
		int[][] a=new int[q][q];
		int b=1;
		int m=0;
		int n=q-1;
		while(n>=m){
		if(n==1){
			a[m][m]=b;
			b++;
			break;	}
		if(n==0){
			return a;
		}
		for(int i=m; i<=n; i++){
			a[m][i]=b;
			b++;
		}
		for(int i=m+1; i<=n; i++){
			a[i][n]=b;
			b++;
		}
		for(int i=n-1; i>=m; i--){
			a[n][i]=b;
			b++;
		}
		for(int i=n-1; i>m; i--){
			a[i][m]=b;
			b++;
		}
		m=m+1;
		n=n-1;
		}
		
		return a;
	}
}
 class Chakra{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("00");
		int n=scan.nextInt();
		Chakraa c=new Chakraa();
		int[][] a=c.chakra(n);
		for(int i=0; i<n;i++){
			for(int j=0; j<n; j++){
				System.out.print(df.format(a[i][j])+ "  ");
			}System.out.println();
		}
		scan.close();
		
	}}
