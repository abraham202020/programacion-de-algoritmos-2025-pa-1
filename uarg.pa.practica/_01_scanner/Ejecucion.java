public class Ejecucion {
    
public static void main (String [] args) {
        Drone d1 = new Drone("X23", 20,30,10,45);
        Drone d2 = new Drone("Z54", 100, 79, 30, 12);


        d1.mostrarInforme();
        d1.puedeDespegar();
        d1.calcularViajes(2);

        d2.mostrarInforme();
        d2.puedeDespegar();
        d2.calcularViajes(10);
    }

}
