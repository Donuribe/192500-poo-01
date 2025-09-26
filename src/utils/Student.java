
package utils;

public class Student {

    private String Name;
    private int Age;
    private String Id;

    public String getName(){
        return Name;
    }
    public void setName(String name ){
        this.Name=name;
    }
    public int getAge(){
        return Age;

    }
    public void setAge(int age){
        this.Age=age;

    }
    public String getId(){
        return Id;

    }
    public void setId(String id){
        this.Id=id;
    }
    public Student(){
        
    }
    public Student(String name, int age){
        this.Name=name;
        this.Age=age;
    }

    public Student(String name,String id, int age){
        this.Name=name;
        this.Id=id;
        this.Age=age;
    }
    public void Showinfo(){
        System.out.println("name"+Name);
        System.out.println("age"+Age);
        System.out.println("id"+Id);
    }

}