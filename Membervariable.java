 class Member {

     String name;
     int age;
     double salary;

     public void display() {

         System.out.println("Member name:" + name);
         System.out.println("Member age:" + age);
         System.out.println("Member salary:" + salary);
     }
 }
    public class Membervariable {
    public static void main(String[] args){
        Member obj=new Member();
        obj.name="vinay";
        obj.age=23;
        obj.salary=2300.45;
        obj.display();
    }
    }

