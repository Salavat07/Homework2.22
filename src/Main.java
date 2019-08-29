public class Main {


    public static void main(String[] args) {

        createObject("Mercedes").print();
        createObject("Bmw").print();
        createObject("Audi").print();
    }

    public static Printable createObject(String className) {

        Printable printable = null;

        switch (className) {
            case "Mercedes":
                printable = new Mercedes(260, 1900, "30metres");
                break;
            case "Bmw":
                printable = new Bmw(320, 3000, "Grr Grr");
                break;
            case "Audi":
                printable = new Audi(280, 2750,5.5D);
                break;
        }
        return printable;
    }
}