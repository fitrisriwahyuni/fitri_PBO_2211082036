/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PITI010423;

/**
 *
 * @author User
 */
public class StudentRecordExample {
    public static void main(String[] args){
        StudentRecord aqiil = new StudentRecord();
        StudentRecord qila = new StudentRecord();
        StudentRecord muhammad = new StudentRecord("muhammad");
        
        
        //isi data
        aqiil.setName("aqiil");
        aqiil.setAddress("Padang");
        aqiil.setAge(19);
        aqiil.setMathGrade(90);
        aqiil.setenglishGrade(90);
        aqiil.setscienceGrade(70);
        
        qila.setName("Qila");
        qila.setAddress("Lintau");
        qila.setAge(20);
        qila.setMathGrade(90);
        qila.setenglishGrade(80);
        qila.setscienceGrade(70);
        qila.setaverage(0);
        
        //menampilkan data
        System.out.println("Biodata aqiil");
        System.out.println("Nama               :" +aqiil.getName());
        System.out.println("Alamat             :" +aqiil.getAddress());
        System.out.println("Umur               :" +aqiil.getAge());
        System.out.println("Nilai rata-rata    :" +aqiil.getAverage());
        
        //memanggil method print
        System.out.println("Biodata qila");
        qila.print("");
        qila.print(qila.getMathGrade(),qila.getenglishGrade(),qila.getscienceGrade(),qila.getAverage());
        
        
        
        System.out.println("Biodata muhammad");
        muhammad.print("");
        
        
        //menampilkan jumlah siswa
        //System.out.println("Count = "+StudentRecord.getStudentCount());
        
       
    }
}
