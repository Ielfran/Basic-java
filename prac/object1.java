class Dog{
    int size;
    String bread;
    String name;

    void name(){
        System.out.println("Ruff! Ruff!");
    }
}
class DogTestDrive{
    public static void main(String[] args){
        //Test code here
        Dog d=new Dog();
        d.size=40;
        d.name();
    }
}

