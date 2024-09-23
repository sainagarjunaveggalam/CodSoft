import java.util.*;
public class StudentGradeCalculator
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);//scanner class to give user input
        System.out.println("enter no of subjects");
        int nos=sc.nextInt();
        
        
        int[] marks=new int[nos];
        int total=0;
        
        for (int i=0;i<nos;i++)
        {
            System.out.println("enter marks of sub"+(i+1)+"out of 100");
            marks[i]=sc.nextInt();
            total+=marks[i];//total marks
        }
        float average =(float)total/nos;//average marks 
  
      
         System.out.println("Final result is");
         System.out.println("total marks : "+total+"/"+nos*100);
       
         System.out.println("average marks: "+average);
        
     
    
        if(average>=90){
        char grade='A';
        System.out.println("Grade ="+grade);
            
        }
     if(average<90 && average>=80){
        char grade='B';
        System.out.println("Grade="+grade);
            
        }
     if(average<80 && average>=70){
        char grade='c';
        System.out.println("Grade="+grade);
            
        }
     if(average<70 && average>=60){
        char grade='D';
        System.out.println("Grade="+grade);
            
        }
     if(average<60){
        char grade='E';
        System.out.println("Grade="+grade);
            
        }
    }
}
