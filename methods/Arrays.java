import java.util.Scanner;

public class Arrays {
     public static void main(String[] args){
        // int marks1=90;
        // int marks2=60;
        // int marks3=50;
        // int marks4=80;
        // int marks5=40;
        // int[] marks={90,60,50,80,40};
        // for(int i=0;i<marks.length;i++){
        //     System.out.print(marks[i]);
        //     System.out.print(" ");
        //     System.out.println();
        // }
        // int[] marks2=new int[5];// default value of int is 0
        // String[] name =new String[10];// default value of string is null

        // acceassing array elements
        //System.out.println("marks2[0] : "+marks2[0]);
        //modifying array elements
        // marks[0]=100;
        // System.out.println("marks[0] : "+marks[0]);
        //Arrays as input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size=sc.nextInt();  
        int marks[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the marks of student "+(i+1)+" : ");
            marks[i]=sc.nextInt();
        }
        System.out.println("Marks of students are : ");
        for(int i=0;i<size;i++){
            System.out.print(marks[i]+" "); 
        }

        
 
     }
    
}
 