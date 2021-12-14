package ss10_DSA.bai_tap;

public class TestMyList {
    public static void main(String[] args) {
        MyList<Integer> a = new MyList<>();
        a.add(21);
        a.add(22);
        a.add(32);
        a.add(37);
        a.add(46);

        System.out.println(a.clone());
    }
}
