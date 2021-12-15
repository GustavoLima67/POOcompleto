package application;

import entitles.Student;
import entitles.NewSalas;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException{
       
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.print("Enter with quantity the student: ");
        Integer student = sc.nextInt();
        
        for(int i=1;i<=student;i++){
            System.out.println("Student #"+i+":");
            System.out.print("Enter with name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Enter with age: ");
            Integer age = sc.nextInt();
            System.out.print("Enter with your birth date: (dd/MM/yyyy) ");
            Date birthDate = sdf.parse(sc.next());
            
            System.out.println();
            
            Student sd = new Student(name, age, birthDate);
        }
        System.out.print("how many school do you want to type: ");
        Integer schoolType = sc.nextInt();
        
        if(schoolType <=1){
            
            System.out.println();
        
            System.out.println("School #1:");
            System.out.print("Enter the school name: ");
            sc.nextLine();
            String school = sc.nextLine();
            System.out.print("what is your class: ");
            String salas = sc.nextLine();
            System.out.print("What year is day: ");
            Date year = sdf.parse(sc.next()); 
            
            System.out.println();
        }else{
            
            System.out.println("School #2:");
            System.out.print("Enter the school name: ");
            sc.nextLine();
            String school = sc.nextLine();
            System.out.print("what is your class: ");
            String salas = sc.nextLine();
            
            System.out.println();
            
            System.out.println("Enter the new school equipment: ");
            System.out.print("Equipment 1: ");
            sc.nextLine();
            String newSalas = sc.nextLine();
            System.out.print("Equipment 2: ");
            newSalas = sc.nextLine();
        
            NewSalas ns = new NewSalas(newSalas,newSalas);
        }
        
    }
}
