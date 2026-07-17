import java.util.*;
public class sumofnumbers{
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter A value:");
    int a=sc.nextInt();
    int sum=0;
    for(int i=1;i<=a;i++)
    {
        sum+=i;
    } 
    System.out.println(sum);
}
}
