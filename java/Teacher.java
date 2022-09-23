
public class Teacher implements interFace{
    String name, profile;
    int age;
    String teacherName = "Ma. Elena Fuentes"; 

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
    public String getProfile() {
        return profile;
    }

  
    public Teacher(){
        System.out.println("Hello, this is the example of Basic English  based on what I learned!");
    }

    
    public Teacher(String name, int age, String profile){
        this.name=name;
        this.age=age;
        this.profile=profile;
    }
    
    public void show(){
        System.out.println("Inside the method of the parent class");
        System.out.println("This is the English class");
    }
}