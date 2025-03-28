class FactorialUsingRecursion{
 public static void main(String[] args) {
        
        int no = 5;
        System.out.println("Factorial of the "+no +" is : "+factorial(no));

    }

    static int factorial(int no)
    {
        if(no == 1)
            return 1;
        else
            return factorial(no - 1) * no;
    }
}