package myjava.npp.homework.March2314;
import myjava.npp.homework.March2314.ComplexNumbers;
/**
 * Created by Zahvat on 23.03.14.
 */
public class Test {
    public static void main(String[] args)
    {
        String a;
        ComplexNumbers Complex=new ComplexNumbers(2,-4);
        ComplexNumbers Complex1=new ComplexNumbers(2,-4);
        ComplexNumbers Complex2=new ComplexNumbers(3,4);
        a=Complex.toString();    //проверка функции toString
        System.out.println("Our complex number"+a);
        boolean s=Complex.equals(Complex1); //проверка функции equals
        if(s==true)
            System.out.println("Complex=Complex1");
        else
            System.out.println("Complex=Complex1");
        s=Complex.equals(Complex2);
        if(s==true)
            System.out.println("Complex=Complex2");
        else
            System.out.println("Complex!=Complex2");
        System.out.println("Im=" + Complex.getValueOfIm());  //эта и следующие две строки - проверка методов доступа
        System.out.println("Re="+Complex.getValueOfRe());
        Complex.setValueOfImAndRe(8, 5);
        a=Complex.toString();
        System.out.println("Our complex number after the function 'setValueOfImAndRe' "+a);
        Complex.conjugate();   //проверка функции conjugate
        a=Complex.toString();
        System.out.println("Our complex number after the function 'conjugate' "+a);
        System.out.println("Module of our number= " + Complex.getModule()); //проверка функции getModule
        System.out.println("Argument of our number= "+Complex.getArg());    //проверка функции getArg
        Complex.sum(Complex1);
        System.out.println("Complex+Complex1="+Complex);//сумма, разность, умножение на действительное число
        Complex.difference(Complex1);
        System.out.println("Complex-Complex1="+Complex);
        Complex.productOnNumber(2);
        System.out.println("Complex*2="+Complex);
    }

}
