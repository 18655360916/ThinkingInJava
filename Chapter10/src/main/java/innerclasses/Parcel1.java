package innerclasses;

public class Parcel1 {
    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;

        Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() {
            return label;
        }
    }

    public void ship(String dest) {
        Contents contents = new Contents();
        Destination destination = new Destination(dest);
        System.out.println(destination.readLabel());
        System.out.println(destination.label);
    }

    public static void main(String[] args) {
        Parcel1 p = new Parcel1();
        p.ship("Tasmania");
    }
}

/*
Tasmania
Tasmania
 */
class ParcelOut {
    public static void main(String[] args) {
        Parcel1.Destination a = new Parcel1().new Destination("a");
        System.out.println(a.readLabel());
//        System.out.println(a.label);
    }
}
