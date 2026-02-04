public class MoreOOP {
    int x;

    public MoreOOP(int x ) {
        this.x =  x;
    }

    public static void main(String[] args) {
        MoreOOP object = new MoreOOP(6);

        System.out.println("this keyword example, value of x = " + object.x);
    }
}
