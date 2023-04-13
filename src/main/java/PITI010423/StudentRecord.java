/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PITI010423;

/**
 *
 * @author User
 */
public class StudentRecord {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average; 
    
    private static int studentCount;//class variable
    
    public StudentRecord(){
    //area inisialisasi kode;
        studentCount++;
    }
    public StudentRecord(String temp){
        this.name = temp;
        studentCount++;
    }
    public StudentRecord(String name, String address,int age,  double mGrade, double eGrade, double sGrade, double average){
        this.name = name;
        this.address = address;
        this.age = age;
        this.mathGrade = mGrade;
        this.englishGrade = eGrade;
        this.scienceGrade = sGrade;
        this.average = average;
        studentCount++;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    public double getMathGrade(){
        return mathGrade;
    }
    
    public void setMathGrade(double mathGrade){
        this.mathGrade = mathGrade;
    }
    public double getenglishGrade(){
        return englishGrade;
    }
    
    public void setenglishGrade(double englishGrade){
        this.englishGrade = englishGrade;
    }
    public double getscienceGrade(){
        return scienceGrade;
    }
    
    public void setscienceGrade(double scienceGrade){
        this.scienceGrade = scienceGrade;
    }
    public double getAverage(){
        average = (mathGrade + englishGrade + scienceGrade) /3;
        return average;
    }
    
    public void setaverage(double average){
        this.average = average;
    }
    
    public static int getStudentCount(){
        return studentCount;
    }
    
    public void print(String temp){
    System.out.println("Name:" + name);
    System.out.println("Address:" + address);
    System.out.println("Age:" + age);
    }
    
    public void print(double mathGrade, double englishGrade, double scienceGrade, double average){
    System.out.println("Math Grade:" + mathGrade);
    System.out.println("English Grade:" + englishGrade);
    System.out.println("Science Grade:" + scienceGrade);
    System.out.println("Nilai rata - rata:" + average);
    }
}
