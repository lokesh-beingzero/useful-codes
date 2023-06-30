public static void fun(int n) {
    // Base Case
    if (n == 0) {
        System.out.print(0 + " ");
        return;
    }
    // Lines of code
    System.out.print(1 + " ");

    // recursive function call
    fun(n - 1);
    System.out.print(2 + " ");
}
