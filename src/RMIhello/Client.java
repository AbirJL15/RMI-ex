package RMIhello;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

    private Client() {}

    public static void main(String[] args) {

        String host = (args.length < 1) ? null : args[0];
        try {
            //Récupèrer le registre RMI
            Registry registry = LocateRegistry.getRegistry(host);
            // Recherche le stub de l'objet serveur
            Hello stub = (Hello) registry.lookup("Hello");
            // Appeler la méthode distante sur le stub
            String response = stub.sayHello();
            System.out.println("response: " + response);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}