package com.interfaces;

interface Service {
    void method1();

    void method2();
}

interface ServiceFactory {
    Service getService();
}

class Implementation1 implements Service {
    public Implementation1() {
    }

    @Override
    public void method1() {
        System.out.println("Implementation1 method1");
    }

    @Override
    public void method2() {
        System.out.println("Implementation1 method2");
    }
}

class Implementation2 implements Service {
    public Implementation2() {

    }

    @Override
    public void method1() {
        System.out.println("Implementation2 method1");
    }

    @Override
    public void method2() {
        System.out.println("Implementation2 method2");
    }
}

class Implementation1Factory implements ServiceFactory {

    @Override
    public Service getService() {
        return new Implementation1();
    }
}

class Implementation2Factory implements ServiceFactory {

    @Override
    public Service getService() {
        return new Implementation2();
    }
}

public class Factories {
    public static void serviceConsumer(ServiceFactory fact) {
        Service service = fact.getService();
        service.method1();
        service.method2();
    }

    public static void service(Service service) {
        service.method1();
        service.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(new Implementation1Factory());
        serviceConsumer(new Implementation2Factory());

        service(new Implementation1());
        service(new Implementation2());
    }
}
/*
Implementation1 method1
Implementation1 method2
Implementation2 method1
Implementation2 method2
Implementation1 method1
Implementation1 method2
Implementation2 method1
Implementation2 method2
 */