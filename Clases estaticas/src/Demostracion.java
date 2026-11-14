public class Demostracion {
    static int contadorGlobal = 0;

    public static void main(String[] args){
        Demostracion a = new Demostracion();
        Demostracion b = new Demostracion();
        a.contadorGlobal=50;
        System.out.println("Valor de b: "+ b.contadorGlobal);
    }
}
