package ss5_accessmodifier_staticmethod_staticproperty.Bai_tap;

public class Student {
    private String name = "John";
    private String  class1 = "C02";

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
    }

    public static void main(String[] args) {
        Student st = new Student();
        st.setName("lindgard");
        st.setClass1("MU");
        System.out.println(st.getName());
        System.out.println(st.getClass1());
    }

}
