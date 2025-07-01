class SimplePair<T, U>
{
    public T left;
    public U right;
}

public class Main {

    public static void main(String[] args) {
        // Example usage of SimplePair
        SimplePair<String, Integer> pair = new SimplePair<>();
        pair.left = "Hello";
        pair.right = 42;
        
        System.out.println("Left: " + pair.left + ", Right: " + pair.right);
    }
}
