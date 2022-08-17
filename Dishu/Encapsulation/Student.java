public class Student {

    private String name;
    private int age;
    private String address;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String toSring (){
   return("Student name is " +this.getName()+" , Age is "+this.getAge()+" and address is "+this.getAddress());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}