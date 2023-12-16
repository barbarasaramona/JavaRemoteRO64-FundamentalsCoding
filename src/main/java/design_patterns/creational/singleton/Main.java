package design_patterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        ServerConnection serverConnection = ServerConnection.getINSTANCE();
        System.out.println(serverConnection.addServer("http.masina.ro"));
        System.out.println(serverConnection.addServer("https.masina.ro"));
        System.out.println(serverConnection.addServer("kttp.masina.ro"));
        System.out.println(serverConnection);
        System.out.println();

        ServerConnection serverConnection2 = ServerConnection.getINSTANCE();
        System.out.println("Server on serverConnection2" + serverConnection2);
        System.out.println(serverConnection2.addServer("http.masina.ro"));
        System.out.println();

        System.out.println(serverConnection.getServersHttp());
        System.out.println();
        System.out.println(serverConnection2.getServersHttps());
    }
}
