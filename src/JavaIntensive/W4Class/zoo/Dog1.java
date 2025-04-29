package JavaIntensive.W4Class.zoo;

public class Dog1 {

    static {
        count = 100;
    }

public String name;
public static int count;
public Dog1(String name){
    this.name = name;
}
public void bark(){
    System.out.println(this.name + " barked");
count ++;
}
public static int getCount(){
    return count;
}
}
