public class evenorodd{
	public static void main(String args[])
	{
		int n=23;
		do{
			if(n%2==0)
			{
				System.out.println("even"+n);
			}else{
				System.out.println("Not:"+n);
			}
			n++;
		}while(n<=24);
	}
}