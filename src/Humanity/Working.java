package Humanity;

public class Working extends Humanity {

    public String type;
    public String name;
    public String familyName;
    public String age;
    public String address;
    public String phone;
    public String sex;
    public String specialSuperPower;

    Working(String type, String name, String familyName, String age, String sex, String address, String phone, String specialSuperPower) {
        this.type = type;
        this.name = name;
        this.familyName = familyName;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.sex = sex;
        this.specialSuperPower = specialSuperPower;
    }

    public String type() {
        return type;
    }

    public String name() {
        return "\uD83E\uDD16"+name;
    }

    public String familyName() {
        return familyName;
    }

    public String age() {
        return age;
    }

    public String address() {
        return address;
    }

    public String phone() {
        return phone;
    }

    public String sex() {
        return sex;
    }

    public String specialSuperPower() {
        return "има заплата: "+specialSuperPower;
    }
}
