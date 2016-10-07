package com.mycompany.mavenproject1softwareengineeringassignment1a;

import com.mycompany.softwareengineeringassignment1.CourseProgramme;
import com.mycompany.softwareengineeringassignment1.Module;
import com.mycompany.softwareengineeringassignment1.Student;
import java.util.ArrayList;
import org.joda.time.DateTime;

public class Tester
{
    public static void main(String[] args)
    {
        int i;
        
        Student student1 = new Student("John", "21", "21/09/1995", "13539738");
        Student student2 = new Student("Mike", "20", "21/09/1996", "13548753");
        Student student3 = new Student("Joe", "19", "21/09/1997", "13518362");
        Student student4 = new Student("Frank", "21", "21/09/1955", "13559302");
        Student student5 = new Student("Pat", "22", "21/09/1994", "13556106");
        Student student6 = new Student("Ollie", "21", "02/12/1995", "13529461");
        Student student7 = new Student("Willie", "20", "06/04/1996", "13514235");
        Student student8 = new Student("Jim", "19", "21/11/1997", "13509574");
        Student student9 = new Student("Cathal", "21", "16/01/1955", "13515285");
        Student student10 = new Student("Enda", "22", "06/03/1994", "13510434");
       
        ArrayList<Student> studentList = new ArrayList<>();
        
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        studentList.add(student7);
        studentList.add(student8);
        studentList.add(student9);
        studentList.add(student10);
        
        Module softwareEngineering = new Module("Software Engineering", "CT417", studentList);
        Module english = new Module("English", "BA436", studentList);
        Module professionalSkills = new Module("Professional Skills", "CT436", studentList);
        
        ArrayList<Module> moduleList = new ArrayList<>();
        
        moduleList.add(english);
        moduleList.add(softwareEngineering);
        moduleList.add(professionalSkills);
        
        DateTime startDate = new DateTime(2016, 9, 1, 0, 0, 0);
        DateTime endDate = new DateTime(2017, 4, 30, 0, 0, 0);
        
        CourseProgramme csit = new CourseProgramme("Computer Science & IT", moduleList, startDate, endDate);
        CourseProgramme arts = new CourseProgramme("Arts", moduleList, startDate, endDate);
        
        ArrayList<CourseProgramme> courseProgrammeList = new ArrayList<>();
        courseProgrammeList.add(csit);
        courseProgrammeList.add(arts);
        
        for(Student s : studentList)
        {
            for(Module m : moduleList)
            {
                for(CourseProgramme cP : courseProgrammeList)
                {
                    System.out.println("The student " + s + " takes the modules " + m + " in the course " + cP + "."); 
                }
            }
        }
    }
}