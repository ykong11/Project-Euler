
public class ProjectEuler1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count,sum;
		count=1;
		sum=0;
		while (count<1000){
			if (count%3==0 | count%5==0)
				sum=sum+count;
			count=count+1;
							}
		System.out.print(sum);

	}

}
