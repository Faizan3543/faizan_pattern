public class faiz {
    
    public static void main(String []args)
    {
        int n=15;
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++) //for letter F
            {
                if (i==0||j==0||i==(n-1)/2&&j<=(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }

            System.out.print("      ");
                    for (int j=0;j<n;j++)// for letter A
                    {
                        if (i==0&&j<(n-1)&&j>0||j==0&&i>0||j==(n-1)&&i>0||i==(n-1)/2&&j<=(n-1))
                        {
                            System.out.print("*");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }System.out.print("     ");
                    for (int j=0;j<n;j++)  // for letter I
                    {
                        if (i==0||i==n-1||j==(n-1)/2)
                        {
                            System.out.print("*");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }System.out.print("     ");
                    for (int j=0;j<n;j++)  //for letter Z
                    {
                        if (i==0||i==n-1||i+j==n-1)
                        {
                            System.out.print("*");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }System.out.print("     ");
                    for (int j=0;j<n;j++)  // for letter A
                    {
                        if (i==0&&j<(n-1)&&j>0||j==0&&i>0||j==(n-1)&&i>0||i==(n-1)/2&&j<=(n-1))
                        {
                            System.out.print("*");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }System.out.print("     ");
                    for (int j=0;j<n;j++)// for letter  N
                    {
                        if (j==0||j==n-1||i==j)
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

