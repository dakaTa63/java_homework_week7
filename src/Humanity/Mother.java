package Humanity;

public class Mother extends Humanity {

    public String type;
    public String name;
    public String familyName;
    public String age;
    public String address;
    public String phone;
    public String sex;
  //  public String specialSuperPower;
    public String kidFirstName;
    public String kidFamilyName;
    public String kidAge;

    Mother(String type, String name, String familyName, String age, String sex, String address, String phone,
           String kidFirstName, String kidFamilyName, String kidAge)
    {
        this.type = type;
        this.name = name;
        this.familyName = familyName;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.sex = sex;
        //this.specialSuperPower = specialSuperPower;
        this.kidFirstName = kidFirstName;
        this.kidFamilyName = kidFamilyName;
        this.kidAge = kidAge;
    }

    public String type() {
        return type;
    }

    public String name() {
        return "\uD83D\uDC69"+name;
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
        return "Има дете ";
    }

    public String kidFirstName(){
        return "\uD83D\uDC67"+kidFirstName;
    }

    public String kidFamilyName(){
        return  kidFamilyName;
    }

    public String kidAge(){
        return kidAge;
    }
}
