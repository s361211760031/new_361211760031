package lab7;
//properties
//1. student name
//2. student id
//3. email
//4. tel number
//5. age
public class Student {
    private String name;
    private String id;
    private String email;
    private String tel;
    private int age;

    //const


    public Student(String name, String id, String email, String tel, int age) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.tel = tel;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getAde() {
        return age;
    }

    public void setAde(int ade) {
        this.age = ade;
    }
}

