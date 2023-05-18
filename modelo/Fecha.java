package modelo;

public class Fecha
{
    //-----------------
    //Atributos
    //-----------------
    private int dia;
    private int mes;
    private int anio;


    //-----------------
    //Métodos
    //-----------------

    public Fecha()
    {

    }

    //Constructor
    public Fecha(int dia, int mes, int anio)
    {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    //Constructor con parámetro String dd/mm/aa
    public Fecha(String s)
    {
        //Buscamos la primera ocurrencia de "/"
        int pos1 = s.indexOf("/");

        //Buscamos la última ocurrencia de "/"
        int pos2 = s.lastIndexOf("/");

        //Extraemos el día
        String sDia = s.substring(0, pos1);

        //Extraemos el mes
        String sMes = s.substring(pos1+1, pos2);

        //Extraemos el año
        String sAnio = s.substring(pos2+1);
        
        //Convertimos a entero
        dia = Integer.parseInt(sDia);
        mes = Integer.parseInt(sMes);
        anio = Integer.parseInt(sAnio);
    
    }

    public int getDia() {
        return dia;
    }


    public void setDia(int dia) {
        this.dia = dia;
    }


    public int getMes() {
        return mes;
    }


    public void setMes(int mes) {
        this.mes = mes;
    }


    public int getAnio() {
        return anio;
    }


    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String toString()
    {
        return "La fecha es: "+dia+"/"+mes+"/"+anio;
    }

    public boolean equals(Object o)
    {
        Fecha otra = (Fecha)o;
        return (dia==otra.dia) && (mes==otra.mes) && (anio==otra.anio);
    }

    //Método para sumar días
    private int fechaToDias()
    {
        return anio*360 + mes*30 + dia;
    }


    private void diasToFecha(int pD)
    {
        //Dividimos por 360 y obtenemos el año
        anio = (int)(pD/360);
        
        //Del residuo de la división anterior
        //obtenemos el mes y el dia
        int residuo = pD%360;
        
        mes = (int)(residuo/30);
        
        dia = residuo%30;
        
        //Ajuste por si el día quedó en cero
        if(dia==0)
        {
            dia = 30;
            mes--;
        }
        
        //Ajuste por si el mes quedó en cero
        if(mes == 0)
        {
            mes = 12;
            anio--;
        }
    }
    
    public void addDias(int pD)
    {
        //convertimos la fecha a dias y le sumamos d
        int sum = fechaToDias() + pD;
        
        //la fecha resultante (sum) separarla en dia, mes y anio
        diasToFecha(sum);
    }

}