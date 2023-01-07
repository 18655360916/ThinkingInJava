package com.interfaces;

interface A {
    void a();
}

interface B {
    int a();
}

interface C {
    double a();
}

// 'com.interfaces.C' 中的 'a()' 与 'com.interfaces.B' 中的 'a()' 冲突; 方法有不相关的返回值类型
//interface D extends B, C {
//
//}


// 'com.interfaces.E' 中的 'a()' 与 'com.interfaces.B' 中的 'a()' 冲突; 尝试使用不兼容的返回值类型
//class E implements C {
//    public int a() {
//        return 1;
//    }
//}

interface I1 {
    void f();
}

interface I2 {
    int f(int i);
}

interface I3 {
    int f();
}

class C1 {
    public int f() {
        return 1;
    }
}

class C2 implements I1, I2 {
    public void f() {

    }

    public int f(int i) {
        return 1;
    }
}

class C3 extends C1 implements I2 {
    public int f(int i) {
        return 1;
    }
}

class C4 extends C1 implements I3 {
    public int f() {
        return 2;
    }
}
// com.interfaces.C1' 中的 'f()' 与 'com.interfaces.I1' 中的 'f()' 冲突; 尝试使用不兼容的返回值类型
//class C5 extends C1 implements I1 {
//
//}

//'com.interfaces.I3' 中的 'f()' 与 'com.interfaces.I1' 中的 'f()' 冲突; 方法有不相关的返回值类型
//interface I4 extends I1, I3 {
//}
public class InterfaceCollision {
    public static void main(String[] args) {
        I3 x = new C4();
        System.out.println(x.f()); // 2
    }
}
