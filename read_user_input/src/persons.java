public class persons{
    private String name;
    private int age;
    public persons (String InitialName) {
        this.age= 0; this.name=InitialName;
    }
    public void printPerson(){
        System.out.printf(this.name + ", age: " + this.age);
    }
    public void becomeOlder(){
        this.age +=1;
    }

}
