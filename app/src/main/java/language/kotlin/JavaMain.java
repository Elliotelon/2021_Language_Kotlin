package language.kotlin;

public class JavaMain {
    public int javaA1 = 100;

    public static int javaA2 = 200;

    public void javaMethod1(){
        System.out.println("javaMethod1");
    }

    public static void javaMethod2(){
        System.out.println("javaMethod2()");

    }

    public static void main(String[] args){

        CClass c1 = new CClass();

        System.out.printf("c1.a1 : %d\n", c1.getA1());
        c1.testFun1();

        System.out.printf("CClass.a2 : %d\n", CClass.Companion.getA2());
        CClass.Companion.testFun2();

        System.out.printf("CClass.a3 : %d\n", CClass.getA3());
        CClass.testFun3();


    }

}
