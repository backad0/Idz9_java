import java.util.Objects;

public class Human {
    private String surname, name, patronymic;
    private int age;
    private Gender gender;

    public Human() {
        this.surname = "";
        this.name = "";
        this.patronymic = "";
        this.age = 0;
        this.gender = Gender.MALE;
    }
    public Human(String surname, String name, String patronymic, int age, Gender gender) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.age = age;
        this.gender = gender;
    }
    public Human(Human copyFrom){
        this.surname = copyFrom.getSurname();
        this.name = copyFrom.getName();
        this.patronymic = copyFrom.getPatronymic();
        this.age = copyFrom.getAge();
        this.gender = copyFrom.getGender();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(surname, human.surname) && Objects.equals(name, human.name) && Objects.equals(patronymic, human.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name, patronymic, age);
    }
}
