package magasins;


public class User {
    
    private String name;
    private String mail;
    private int age;
    
    
    public User(String name, String mail, int age) {
        super();
        this.name = name;
        this.mail = mail;
        this.age = age;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

   

    
    
    @Override
    public String toString() {
        return "Nom du client: " + name +
                ", mail: " + mail +
                ", age: " + age + " ans";
    }

    
    
    
    

}
