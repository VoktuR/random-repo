package chain_of_responsibility.users;

import java.util.Objects;

public class User {

    private long id;

    private String name;

    private int age;

    private boolean isVerified;

    public User(long id, String name, int age, boolean isVerified) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.isVerified = isVerified;
    }

    public long getId() {
        return id;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && age == user.age && isVerified == user.isVerified && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, isVerified);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isVerified=" + isVerified +
                '}';
    }

}
