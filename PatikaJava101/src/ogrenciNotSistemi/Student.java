package ogrenciNotSistemi;

public class Student {
	
    Course mat;
    Course fizik;
    Course kimya;
    
    String name;
    String stuNo;
    int classes;
    double average;
    boolean isPass;
    
    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya){
    	this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.isPass = false;
    }
    
    void addBulkExamNote(int mat,int matSozlu,int fizik,int fizikSozlu,int kimya,int kimyaSozlu){
    	   if (mat >= 0 && mat <= 100 && matSozlu >= 0 && matSozlu <= 100) {
               this.mat.note = mat;
               this.mat.sozlu=matSozlu;
           }

           if (fizik >= 0 && fizik <= 100 && fizikSozlu >= 0 && fizikSozlu <= 100) {
               this.fizik.note = fizik;
               this.fizik.sozlu = fizikSozlu;
           }

           if (kimya >= 0 && kimya <= 100 && kimyaSozlu >= 0 && kimyaSozlu <= 100) {
               this.kimya.note = kimya;
               this.kimya.sozlu = kimyaSozlu;
           }
           calcAvarage();
    }
    
    void isPass() {
    	if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0 || this.mat.sozlu == 0 || this.fizik.sozlu == 0 || this.kimya.sozlu == 0) {
            System.out.println("Notlar tam olarak girilmemiþ");
        } else {
        	if(average>55) {
        		this.isPass=true;
        	}
            printNote();
            System.out.println("Ortalama : " + this.average);
            if (this.isPass) {
                System.out.println("Sýnýfý Geçti. ");
            } else {
                System.out.println("Sýnýfta Kaldý.");
            }
        }
    }
    
    void calcAvarage() {
        this.average = (((this.fizik.note + this.kimya.note + this.mat.note)*0.8)+((this.fizik.sozlu+this.kimya.sozlu+this.mat.sozlu)*0.2)) / 3;
    }
    
    void printNote(){
        System.out.println("=========================");
        System.out.println("Öðrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Matematik Sozlusu : " + this.mat.sozlu);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Fizik Sozlusu : " + this.fizik.sozlu);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Kimya Sozlusu : " + this.kimya.sozlu);
    }
}