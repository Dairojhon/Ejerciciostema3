public class Main {
    public static void main(String[] args) {

        var resultado= suma(25,67,35);
        System.out.println(resultado);
        coche miCoche = new coche();
        miCoche.Incpuertas();
        System.out.println(miCoche.puertas);
    }
    public static int suma(int a, int b, int c)
    {
        return a+b+c;
    }

}

class coche
{
    public int puertas= 4;

    public void Incpuertas()
    {
       this.puertas++;
    }

}