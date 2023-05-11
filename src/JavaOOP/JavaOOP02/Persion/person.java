package JavaOOP.JavaOOP02.Persion;

public class person {
    private String name;
    private int age;
    private String address;
    private String gender;
    private String phone;

    //name, age, gender, address, phone

    public person(String name, int age, String address,String gender, String phone) {
        this.name = name;
        this.age = age;
        this.address=address;
        this.gender=gender;
        this.phone=phone;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return  address;
    }
    public String getGender() {
        return  gender;
    }

    public String getPhone() {
        return  phone;
    }
}
