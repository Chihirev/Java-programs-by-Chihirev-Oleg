package myjava.npp.homework.March2314;
import java.util.Random;
import java.lang.Math;
/**
 * Created by Zahvat on 23.03.14.
 */
public class ComplexNumbers {
    private double a, b;
   ComplexNumbers()
   {
       Random rnd=new Random();
       this.a=rnd.nextDouble();
       this.b=rnd.nextDouble();
   }
    ComplexNumbers(double a, double b)
    {
        this.a=a;
        this.b=b;
    }
    public String toString()
    {
        if(b>0)
        return(a+" + i"+b);
            return(a+" - i"+(-b));
    }
     public boolean equals(ComplexNumbers Complex)
     {
         if(this.a==Complex.a && this.b==Complex.b)
             return true;
         return false;
     }
    public double getModule()
    {
        return Math.sqrt(this.a*this.a+this.b*this.b);
    }
    public double getArg()
    {
        if(this.a>0)
            return (Math.atan(this.b/this.a));
        if(this.a<0 && this.b>0)
            return (Math.PI+Math.atan(this.b/this.a));
        return (Math.atan(this.b/this.a)-Math.PI);
    }
    public void conjugate()
    {
       this.b*=-1;
    }
    public void sum(ComplexNumbers Complex)
    {
        this.a+=Complex.a;
        this.b+=Complex.b;
    }
    public void difference(ComplexNumbers Complex)
    {
        this.a-=Complex.a;
        this.b-=Complex.b;
    }
    public void productOnNumber(double number)
    {
        this.a*=number;
        this.b*=number;
    }
    public double getValueOfIm()
    {
        return this.b;
    }
    public double getValueOfRe()
    {
        return this.a;
    }
    public void setValueOfImAndRe(double a, double b)
    {
        this.a=a;
        this.b=b;
    }
}
