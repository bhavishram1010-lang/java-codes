import java.util.*;
public class Evenindex{
    public static void main(String[] args) {
    int[] numbers={13,56,576,567,76,947,466,75,53};
    System.out.println("EVEN INDEX OF AN ARRAY");
    for(int i=0;i<numbers.length;i++)
       {
         if(i%2==0) {
             System.out.println(i+" INDEX's VALUE "+numbers[i]);
           
         }
        
