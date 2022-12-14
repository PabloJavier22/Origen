public class Tarea5_3_1 {
  public static void main(String[] args){  int a = 1;
    int b = 2;
    int c = 3;

    //1
    a = b;
    System.out.println("a: "+a+" b: "+b+" c "+c);
    //2
    c = a;
    System.out.println("a: "+a+" b: "+b+" c "+c);
    //3
    b = (a+b+c)/2;
    System.out.println("a: "+a+" b: "+b+" c "+c);
    //4
    a = a+c*2;
    System.out.println("a: "+a+" b: "+b+" c "+c);
    //5
    c = b-a;
    System.out.println("a: "+a+" b: "+b+" c "+c);
    //6
    a = b*c;
    System.out.println("a: "+a+" b: "+b+" c "+c);
    //7
    b = a+b*c;
    System.out.println("a: "+a+" b: "+b+" c "+c);
    //8
    c = c-2;
    System.out.println("a: "+a+" b: "+b+" c "+c);
    //9
    a = b;
    System.out.println("a: "+a+" b: "+b+" c "+c);
    //10
    c = a/b;
    System.out.println("a: "+a+" b: "+b+" c "+c);
    }
}
