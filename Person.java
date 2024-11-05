public class Person {
    private String name;
    private String position;
    private String workPlace;
    private String age;
    private String salary;

    public Person(){

    }

    public Person(String name, String position, String workPlace, String age, String salary) {
        this.name = name;
        this.position = position;
        this.workPlace = workPlace;
        this.age = age;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

}
