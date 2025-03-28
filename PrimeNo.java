class PrimeNo
{
	public static void main(String[] args) {
        
        int no = 13;
        int i = 2;
        boolean prime = true;
        while(i < no)
        {
            if(no % i == 0)
            {
                prime = false;
                break;
            }
            i++;
        }
        if(prime)
            System.out.println( no +" is a prime no");
        else
            System.out.println(no +" is not a prime no.");
    }
}