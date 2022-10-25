public class question1 {

	public static void main(String[] args) {
	
		int n=10;
		for (int i=0; i<n; i++)
		{
			{
			for (int j=0; j<n; j++)  // I alphabet
			{
				if ( i==0 || i==n-1 || (j==(n-1)/2 ))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}	
				
			}
					System.out.print("   ");
			}
		
			for (int j=0; j<n; j++)
			{
				if (j==0 || j==n-1 || i==j)  // N alphabet
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}	
					
			}
					System.out.print("   ");
					
			for (int j=0; j<n; j++)  // E alphabet
			{
				if (j==0 || i==0 || i==(n-1)/2 || i==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}					
			}
				System.out.print("   ");
			
			for (int j=0; j<n; j++) // U alphabet
			{
				if (j==0 && i<n-1 || j==(n-1) && i<(n-1) || i==(n-1) && j!=0 && j< (n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}				
			}
					System.out.print("   ");
					
			for (int j=0; j<n; j++) // R alphabet
			{
				if (j==0 || (i==0 && (j<(n-1)-1)) || (i==(n-1)/2 && (j<(n-1)-1)) ||(j==(n-1) && i>=1 && i<(n-1)/2) || (i>(n-1)/2) && j==n-1)
			
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}				
			}
					System.out.print("   ");
					
			for (int j=0; j<n; j++) // O alphabet
			{
				if ((i==0 && j>0 && j<n-1) || (i==n-1 && j>0 && j<n-1) || j==0 && i>0 && i<n-1 || j==n-1 && i>0 && i<n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
					System.out.print("   ");
					
			for (int j=0; j<n; j++)
			{
				if (j==0 || j==n-1 || i==j)  // N alphabet
				{
					System.out.print("*");
				}
					else
				{
					System.out.print(" ");
				}	
							
				}
					System.out.print("   ");					
					System.out.println("");
		}
	}
}
		


