// Aggregation.
class User{
    private String name;
    private int age;

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getInfo(){
        return name+ " (Age: "+ age+ ")";
    }
}
