public class Classes {
    String FirstCar = "Volvo";
    String SecondCar;
    String ThirdCar;

    public Classes() {
        ThirdCar = "ConstructorVaribale";
    }

    static void Speedometer(int speed) {

        System.out.println("Current Speed " + speed + " mph");
    }

    public static void main(String[] args) {
        Classes Owner = new Classes();
        Classes Owner2 = new Classes();
        TestClass Demonstration = new TestClass();

        Owner.SecondCar = "BMW";

        System.out.println(Owner.FirstCar);
        System.out.println(Demonstration.Sentence);
        System.out.println(Owner.SecondCar);

        Owner.Speedometer(150);
    }
}