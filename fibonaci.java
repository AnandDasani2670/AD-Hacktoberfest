public class fibonaci_series {
public static void main(String[] args)
{
	
	
	System.out.print("first 10 terms:  ");
	int t1=0,t2=1,sum;
	int i=0;
	for(i=0; i<=10; i++)
	{
		 System.out.print(t1 + " + ");
		sum=t1+t2;
		t1=t2;
		t2=sum;
	}
	
	
}
}
