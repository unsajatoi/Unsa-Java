//6d Write a program to depict the behavior of method overloading and overriding.
class OverLoadinOverrridingTestDog extends Dog{
    public void bark(){
        System.out.println("woof ");
    }
}
class Hound extends Dog{
    public void sniff(){
        System.out.println("sniff ");
    }
 
    public void bark(){
        System.out.println("bowl");
    }
}
 

