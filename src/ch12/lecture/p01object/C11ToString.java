package ch12.lecture.p01object;

public class C11ToString {
    private String name;
    private String email;

    @Override
    public String toString() {
        return "C11ToString{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    private String address;
}
