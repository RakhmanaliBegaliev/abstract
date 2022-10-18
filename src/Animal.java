public abstract class Animal {
    private String name;
    private int age;
    private String gender;
    private String NickName;

    public Animal(String name, int age, String gender, String nickName) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        NickName = nickName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickName() {
        return NickName;
    }

    public void setNickName(String nickName) {
        NickName = nickName;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", NickName='" + NickName + '\'' +
                '}';
    }
}
