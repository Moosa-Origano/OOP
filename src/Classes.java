public class Classes {
    String FirstCar = "Volvo";
    String SecondCar;
    String ThirdCar;
    int Random;

    public Classes(int r) {
        ThirdCar = "ConstructorVaribale";
        Random = r;


    }

    static void Speedometer(int speed) {

        System.out.println("Current Speed " + speed + " mph");
    }

    public static void main(String[] args) {
        Classes Owner = new Classes(5);
        Classes Owner2 = new Classes(6);
        TestClass Demonstration = new TestClass();

        Owner.SecondCar = "BMW";

        System.out.println(Owner.FirstCar);
        System.out.println(Demonstration.Sentence);
        System.out.println(Owner.SecondCar);

        Owner.Speedometer(150);
    }
}