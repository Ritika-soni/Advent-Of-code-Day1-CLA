class sum
{
      public static void main(String ar[])
      {
            int i,j,k;
			int ans=0;
           for (i = 0; i < ar.length; i++) {
				for (j = i + 1; j < ar.length; j++) {
					for (k = j + 1; k < ar.length; k++) {
						int a=Integer.parseInt(ar[i]);
						int b=Integer.parseInt(ar[j]);
						int c=Integer.parseInt(ar[k]);
						if ((a+b+c) == 2020) {							
							ans = a*b*c;
							System.out.println("Correct Inputs: " +a + " + " + b + " + " + c+"ans"+ans);
							break;
						}
					}
				}
			}
			System.out.println("Answer = " + ans);
      }
}