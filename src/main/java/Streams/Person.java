package Streams;

enum Gender {MALE, FEMALE};

public class Person {

    public String name;
    public Gender gender;
    public int age;
  public Person( String name, Gender gender, int age){
      this.name=name;
      this.gender=gender;
      this.age=age;
  }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
