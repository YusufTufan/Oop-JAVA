public class Dog {//class
    public String name;  //fields (fieldslar public olduğundan getter ve settera gerek yok.)
    public int age;

    public Dog(String nm, int age){//constructor
        this.name=nm;
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int yas){
        if(yas<1 || yas>15)
        {
            System.out.println("yas değeri 1 ile 15 arası olmalı");
        }else
            this.age=yas;
    }
    public void bark(){
        System.out.println("hav");
    }
    public void info(){
        System.out.println(name);
        System.out.println(age);
    }
}
