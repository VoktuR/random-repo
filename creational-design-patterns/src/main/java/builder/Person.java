package builder;

public class Person {

    private long id;

    private String name;

    private String sex;

    private int age;

    private String role;

    public static class Builder {

        private Person person;

        public Builder() {
            person = new Person();
        }

        public Builder withId(long id) {
            person.setId(id);
            return this;
        }

        public Builder withName(String name) {
            person.setName(name);
            return this;
        }

        public Builder withSex(String sex) {
            person.setSex(sex);
            return this;
        }

        public Builder withAge(int age) {
            person.setAge(age);
            return this;
        }

        public Builder withRole(String role) {
            person.setRole(role);
            return this;
        }

        public Person build() {
            return person;
        }

    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", role='" + role + '\'' +
                '}';
    }
}
