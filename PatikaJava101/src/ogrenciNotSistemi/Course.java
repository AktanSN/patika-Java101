package ogrenciNotSistemi;

public class Course {
    Teacher courseTeacher;
    
    String name;
    String code;
    String prefix;
    int note;
    int sozlu;
    
    Course(String name,String code, String prefix){
    	this.name=name;
    	this.code=code;
    	this.prefix=prefix;
    	this.note=0;
    	this.sozlu=0;
    }
    
    void addTeacher(Teacher teacher) {
    	if(this.prefix.equals(teacher.branch)) {
    		this.courseTeacher=teacher;
    		System.out.println("Ýþlem baþarýlý");
    	}else {
    		System.out.println(teacher.name + " bu dersi veremez.");
    	}
    }
    
    void printTeacher() {
    	if(this.courseTeacher != null) {
    		 System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
    	}else {
    		 System.out.println(this.name + " dersine Akademisyen atanmamýþtýr.");
    	}
    }
}