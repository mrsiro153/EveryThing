package creational.builder;

public class Person {

    private String name;
    private String age;

    private String otherName;
    private String house;

    //need a constructor influence builder class
    public Person(PersonBuilder builder){
        this.name=builder.name;
        this.age = builder.age;
        this.otherName=builder.otherName;
        this.house = builder.house;

    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getOtherName() {
        return otherName;
    }

    public String getHouse() {
        return house;
    }

    //
    public static class PersonBuilder{
        private String name;
        private String age;

        private String otherName;
        private String house;
        public PersonBuilder(String name, String age){
            this.name=name;
            this.age=age;
        }
        //


        public String getOtherName() {
            return otherName;
        }

        public PersonBuilder setOtherName(String otherName) {
            this.otherName = otherName;
            return this;
        }

        public String getHouse() {
            return house;
        }

        public PersonBuilder setHouse(String house) {
            this.house = house;
            return this;
        }
        //
        public Person build(){
            return new Person(this);
        }
    }
}
