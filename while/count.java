public class count{
	public static void main(String args[])
	{
		int count=0;
		int digit=12345;
		while(digit>0)
		{
			count++;
          digit=digit/10;
          
		}
		System.out.println("count:"+count);
	}
}