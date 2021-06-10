public class Q2 {
	

		public static void main(String[] args) {
			int	A[] = {5, 7, 9, 3, 6, 2};
			int min=A[0];
		
	    for(int i=1;i<A.length;++i) {
		if(A[i]<min)
		   {
			min=A[i];
	       }
}
	     System.out.println(min);
		 int B[] = {1, 2, 6, -1, 0, 9};
		 int max=B[0];
		 for(int j=1;j<B.length;++j) 
		        {
				if(A[j]>max) 
				{
				max=A[j];
				}
}
		 System.out.println(max);
		 int product=min*max;
		 System.out.println("product:"+ product);
		 
		 
		 
		 
	}

}