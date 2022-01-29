import java.util.*;  
class Armstrong 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);  
            
        System.out.println("enter the number");
        int number= sc.nextInt();  
        
        int originalNumber, remainder, result = 0;
        originalNumber = number;
        int n = originalNumber;
        int count = 0;
        
        while (n != 0)
        {
           n = n / 10;
            ++count;
        }
         while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, count);
            originalNumber /= 10;
         }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}