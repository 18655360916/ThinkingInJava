package com.reusing;

class Soap {
    private String s;

    Soap() {
        System.out.println("Soap()");
        s = "Constructed";
    }

    public String toString() {
        return s;
    }
}

public class Bath {
    private String s1 = "Happy";
    private String s2 = "Happy";
    private String s3;
    private String s4;

    private Soap castille;

    private int i;
    private float toy;

    public Bath() {
        System.out.println("Inside Bath()");
        s3 = "Joy";
        toy = 3.14f;
        castille = new Soap();
    }

    {
        i = 47;
    }

    public String toString() {
        if (s4 == null) {
            s4 = "Joy";
        }
        return
                "s1 = " + s1 + "\n" +
                        "s2 = " + s2 + "\n" +
                        "s3 = " + s3 + "\n" +
                        "s4 = " + s4 + "\n" +
                        "i = " + i + "\n" +
                        "toy = " + toy + "\n" +
                        "castille = " + castille;
    }

    public static void main(String[] args) {
        Bath bath = new Bath();
        System.out.println(bath);
    }

}
/*
Inside Bath()
Soap()
s1 = Happy
s2 = Happy
s3 = Joy
s4 = Joy
i = 47
toy = 3.14
castille = Constructed
 */