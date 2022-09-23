public class Main{
    public static void main(String[] args){

     
        Teacher a = new Teacher(); 
        Teacher constructor = new Teacher("Ara Mae Secuya" , 23, "Future English Teacher");


        
        a.setName("Ara Mae Secuya");
        a.setAge(23);
        a.setProfile("Future English Teacher");

       
        System.out.println("Name: " + a.getName() );
        System.out.println("Age: " + a.getAge() );
        System.out.println("Profile: " + a.getProfile() );

  
        System.out.println("Constructor in java with parameter");
        System.out.println("Name: " + constructor.name);
        System.out.println("Age: " + constructor.age);
        System.out.println("Profile: " + constructor.profile);
        

     
        student s = new student();
        System.out.println("Student learned ENGLISH language from: " + s.teacherName);

      
        Teacher p = new Teacher();
        p.show();
       
        Teacher p2 = new student();
        p2.show();

    }
}