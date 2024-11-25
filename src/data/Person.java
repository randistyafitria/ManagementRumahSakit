package data;


public abstract class Person {
    private String name;
    private int age;
    private String gender;
    private String address;
    private String contact;
    private final String id;

    public Person(String name, int age, String gender, String address, String contact, String id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.contact = contact;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getContact() {
        return contact;
    }

    public String getId(){
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }


    public void getDetail() {
        System.out.println("ID: " + id);
        System.out.println("Nama: " + name);
        System.out.println("Umur: " + age);
        System.out.println("Jenis Kelamin: " + gender);
        System.out.println("Alamat: " + address);
        System.out.println("Nomor Kontak: " + contact);
    }
}
