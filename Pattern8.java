class Pattern8
{
        public static void main(String args[])
        {
                System.out.println("ABCMAY19JPM2BTM017");
                for(int i=1;i<=5;i++)
                {
                        for(int j=1;j<=5;j++)
                        {
                                System.out.print("-");
                        }
                        for(int k=1;k<=5;k++)
                        {
				if(i==1||k==1||i==5||k==5||k==3)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
                        }
                        System.out.println();
                }


        }

}