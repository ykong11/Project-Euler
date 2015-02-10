
public class ProjectEuler2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,n1,n2,sum;
		n1=1;n2=2;
		n=0;
		sum=2;
		while (n<4000000){
			n=n1+n2;
			n1=n2;
			n2=n;
			if (n%2==0) sum=sum+n;
			
		}
		System.out.print(sum);

	}

}
