class Pattern1
{
    public static void main(String[] args)
    {
        int i,j,n= Integer.parseInt(args[0]);
        
        for(i=0;i<=n;i++){
            for(j=0;j<=n;j++){
                if(i>=j)
                System.out.print("*");
            }
            System.out.println("");
        }
    }
} 