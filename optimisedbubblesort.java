import java.util.Scanner;

public class optimisedbubblesort {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int i,j,c=0,a[],n,t;
		boolean sw;
		a = new int[100];
		n=in.nextInt();
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		for(i=0;i<n-1;i++)
		{

			for(j=0;j<n-1-i;j++)
			{
				sw=false;
				if(a[j]>a[j+1])
				{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
					sw=true;
				}
				if(sw=false)
				{
					break;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}