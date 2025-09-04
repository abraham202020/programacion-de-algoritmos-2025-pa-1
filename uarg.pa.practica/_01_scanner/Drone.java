public class Drone {

    //atributos

    private String modelo;
    private double NVbateria;
    private double ATvuelo;
    private double pesoMAX;
    private double cargaActual;

    //constructor

    public Drone(String modelo, double NVbateria, double ATvuelo, double pesoMAX, double cargaActual){

        this.modelo = modelo;
        this.NVbateria = NVbateria;
        this.ATvuelo = ATvuelo;
        this.pesoMAX = pesoMAX;
        this.cargaActual = cargaActual;

    }

    //metodos set y get 

        public void setModelo(String m){
            modelo = m;
        }
    
        public String getModelo(){
            return modelo;
        }

        public void setNVbateria(double b){
            NVbateria = b;
        }
    
        public double getNVbateria(){
            return NVbateria;
        }   

        public void setATvuelo(double AT){
            ATvuelo =AT;
        }
    
        public double getATvuelo(){
            return ATvuelo;
        }

        public void setPesoMAX(double p){
            pesoMAX = p;
        }
    
        public double getPesoMAX(){
            return pesoMAX;
        }

        public void setCargaActual(double a){
            cargaActual = a;
        }
    
        public double getargaActual(){
            return cargaActual;
        }    

    //metodos mas elavalorados

    public boolean puedeDespegar(){
        if (NVbateria > 20){
            
            System.out.println("El drone puede despegar.");
            return true;

        } else {

            System.out.println("bateria baja. no puede despegar");
            return false;}
        }

    public int calcularViajes(double pesoEntrega) {
        if (pesoEntrega <= 0) {
            System.out.println("Peso de entrega inválido.");
            return 0;
        }
        int viajes = (int) (pesoMAX / pesoEntrega);
        System.out.println("El drone puede hacer " + viajes + " viajes con este peso.");

    System.out.println("----------------------------");

        return viajes;
    }
    
    public void mostrarInforme() {
        System.out.println("Informe del Drone");
        System.out.println("Modelo: " + modelo);
        System.out.println("Altura de vuelo: " + ATvuelo + " m");
        System.out.println("Batería: " + NVbateria + "%");
        System.out.println("Peso máximo: " + pesoMAX + " kg");
        System.out.println("Carga actual: " + cargaActual + " kg");
        System.out.println("----------------------------");
    }
}    
