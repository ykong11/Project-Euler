
public class ProjectEuler6 {

	/**
	 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumOfSquares, squareOfSum,count,output;
		sumOfSquares=squareOfSum=0;
		count=0;
		while (count<101){
			sumOfSquares=sumOfSquares+count*count;
			squareOfSum=squareOfSum+count;
			count=count+1;
		}
		squareOfSum=squareOfSum*squareOfSum;
		if (squareOfSum>sumOfSquares)output=squareOfSum-sumOfSquares;
		else output=sumOfSquares-squareOfSum;
		System.out.println(output);
	}

}
