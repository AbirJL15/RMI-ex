package RMIhello;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server implements Hello {

    public Server() {}

    public String sayHello() {
        return "Hello, world!";
    }

    public static void main(String args[]) {

        try {
            //Créer une instance du serveur
            Server obj = new Server();
            // Exporter l'objet serveur vers un stub
            Hello stub = (Hello) UnicastRemoteObject.exportObject(obj, 0);

            // Créer ou récupère le registre RMI sur le port par défaut
            Registry registry = LocateRegistry.createRegistry(1099);
            // Lier le stub de l'objet serveur au registre
            registry.bind("Hello", stub);

            System.err.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
