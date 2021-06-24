package daily_videos.day43_polymorphism;

public class TestMethod {
    public static void main(String[] args) {
        childA cha = new childA();
        cha.m1();
        cha.m2();
        cha.m3();

        ChildB chB = new ChildB();
        chB.m1();
        chB.m2();
        chB.m4();

        Parent p1 = new childA();
        p1.m1();

        Parent p2 = new ChildB();
        p2.m1();

        MyInterface int1 = new childA();
        int1.m2();

        MyInterface int2 = new ChildB();
        int2.m2();


    }
}

class Parent{
    public void m1(){}
}

interface MyInterface{
    void m2();
}

class childA extends Parent implements MyInterface{

    @Override
    public void m2() {

    }

    public void m3(){

    }
}

class ChildB extends Parent implements MyInterface{

    @Override
    public void m2() {

    }

    public void m4() {

    }
}