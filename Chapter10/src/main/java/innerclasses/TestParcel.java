package innerclasses;

class Parcel4 {
    private class PConatents implements Contents {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    protected class PDestination implements Destination {
        private String label;

        private PDestination(String whereTo) {
            label = whereTo;
        }

        @Override
        public String readLabel() {
            return null;
        }
    }

    public Destination destination(String s) {
        return new PDestination(s);
    }

    public Contents contents() {
        return new PConatents();
    }
}

public class TestParcel {
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("Tasmania");
//        p.new PConatents();
//        p.new PDestination("a");
    }

}
