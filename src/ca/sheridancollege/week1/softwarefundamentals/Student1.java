/*
 * Sapna
 * Student Id:991587033
 * SYST10199-Web Programming
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 *
 * @author bhard
 */
public class Student1 {
    public static void main(String[]args){
        StudentList[]sList = new StudentList[5];
        for(int i=0;i<=sList.length-1;i++)
        {
            sList[i] = new StudentList();
            sList[i].setName("StudentList"+(i+1));
        }
        
        for(StudentList s:sList)
           System.out.println("the Student name is "+s.getName()); 
           
        }
    }

