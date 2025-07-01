class Basic {}

class Extended extends Basic {

    public int foo;
}

public class Pair <T, U> {
    private T first;
    private U second;

    public T getFirst() {
        return first;
    }
    public U getSecond() {
        return second;
    }

    public void setFirst(T _f) {
        this.first = _f;
    }
    public void setSecond(U _s) {
        this.second = _s;
    }
    // optional constructor
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pair: ");
        sb.append(first.toString());
        sb.append(", ");
        sb.append(second.toString());

        return sb.toString();
    }

    // optional

    public Pair() {}

    public Pair (T _f, U _s)
    {
        setFirst(_f);
        setSecond(_s);
    }

    // optional main
    public static void main(String[] args) {

        Pair<String, String> p_is = new Pair<String, String>("42", "foo" );
        System.out.println(p_is.toString());

        System.out.println(p_is.getSecond());

        Pair<Integer, String> p_REAL_is = new Pair<Integer, String>(96, "bar" );
        System.out.println(p_REAL_is.toString());

        System.out.println(p_REAL_is.getSecond());


        Extended e = new Extended();
        e.foo = 96;

        Pair<Basic, Extended> p_be = new Pair<Basic, Extended> (new Basic(), e);
        System.out.println(p_be.toString());
        System.out.println(p_be.getSecond().foo);
    }
}
