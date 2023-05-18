package ejecutable;

import modelo.Fecha;

public class Test
{
    public static void main(String[] args) 
    {
        Fecha f1 = new Fecha(2, 9, 2001);
        

        Fecha f2 = new Fecha(19, 2, 2008);
        

        System.out.println("Día: "+f1.getDia());
        System.out.println("Mes: "+f1.getMes());
        System.out.println("Año: "+f1.getAnio());
        System.out.println(f1);


        System.out.println("Día: "+f2.getDia());
        System.out.println("Mes: "+f2.getMes());
        System.out.println("Año: "+f2.getAnio());
        System.out.println(f2);

        System.out.println(f1.equals(f2)? "Son iguales" : "Son diferentes" );
        
        Fecha f3 = new Fecha(23, 12, 1980);
        f3.addDias(14);
        System.out.println(f3);
    }
}