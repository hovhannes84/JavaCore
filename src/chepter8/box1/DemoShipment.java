package chepter8.box1;

public class DemoShipment {
    public static void main(String[] args) {
        Shiprnent shipment1 = new Shiprnent(10,20,15,10,3.41);
        Shiprnent shipment2 = new Shiprnent(2,3,4,0.79,1.28);
        double vol;
        vol = shipment1.volurne();
        System.out.println("Oбъeм shipmentl равен " + vol);
        System.out.println("Bec shipmentl равен " + shipment1.weight);
        System.out.println("Cтoимocть доставки: $ " + shipment1.cost);
        System.out.println();
        vol = shipment2.volurne();
        System.out.println("Oбъeм shipment2 равен " + vol);
        System.out.println("Bec shipment2 равен " + shipment2.weight);
        System.out.println("Cтoимocть доставки: $ " + shipment2.cost);
        System.out.println();



    }
}
