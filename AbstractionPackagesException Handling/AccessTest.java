import testpackage.Foundation;

public class AccessTest {
    public static void main(String[] args) {
        Foundation f = new Foundation();

        // var1 (private) - NOT accessible here, use getter instead
        System.out.println("var1 (via getter): " + f.getVar1());

        // var2 (default) - NOT accessible outside the package
        // System.out.println(f.var2); // would cause compile error

        // var3 (protected) - NOT accessible here (different package, no inheritance)
        // System.out.println(f.var3); // would cause compile error

        // var4 (public) - accessible
        System.out.println("var4 (public): " + f.var4);
    }
}
