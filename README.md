# RMI-ex
Un exemple simple d'application Java RMI illustrant la communication entre un serveur et un client.

Structure du Projet: 
RMIhello
Hello.java: L'interface distante définissant la méthode "sayHello".
Server.java: Le code du serveur qui implémente l'interface "Hello".
Client.java: Le code du client qui utilise la méthode distante "sayHello".


- Génération de couches: 
La méthode exportObject prend l'objet Server (qui implémente l'interface Hello) et crée un stub (souche) pour cet objet. Ce stub est ensuite utilisé pour la communication distante avec le client. 

- Serveur de noms:
Le serveur utilise LocateRegistry.createRegistry(1099) pour créer un registre RMI sur le port par défaut, qui est 1099. Si le port n'est pas spécifié, le registre est créé sur le port par défaut. Dans cet exemple, le registre est créé sur le port 1099.
