package cat;

public class Main {
    static void main() {
        Cat blackCat = new Cat();
        Cat orangeCat = new Cat();

        Mat purpleMat = new Mat();
        purpleMat.colour = "Purple";
        purpleMat.length = 1.0;
        purpleMat.width = 1.5;

        blackCat.sit();
        orangeCat.sit();


    }
}
