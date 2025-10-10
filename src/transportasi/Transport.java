package transportasi;

interface PassengerTransport {
    void loadPassengers();
}

abstract class Transport {
    public abstract void move();
}

class Car extends Transport implements PassengerTransport {
    @Override
    public void move() {
        System.out.println("Mobil melaju di jalan raya");
    }
    
    @Override
    public void loadPassengers() {
        System.out.println("beberapa penumpang masuk ke dalam mobil");
    }
}

class Bicycle extends Transport {
    @Override
    public void move() {
        System.out.println("Sepeda sedang dikayuh di taman");
    }
}

class Bus extends Transport implements PassengerTransport {
    @Override
    public void move() {
        System.out.println("Bus sedang bergerak di jalur bus");
    }
    
    @Override
    public void loadPassengers() {
        System.out.println("Banyak penumpang naik ke dalam bus");
    }
}

class TransportMain {
    public static void main(String[] args) {
        Transport[] transports = {
            new Car(),
            new Bicycle(),
            new Bus()
        };
        
        for (Transport transport : transports) {
            transport.move();
            
            if (transport instanceof PassengerTransport) {
                PassengerTransport passengerTransport = (PassengerTransport) transport;
                passengerTransport.loadPassengers();
            }
            
            System.out.println();
        }
    }
}
