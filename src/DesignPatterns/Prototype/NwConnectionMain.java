package DesignPatterns.Prototype;

public class NwConnectionMain {
    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        System.out.println("Setting up network connection ... ");
        NetworkConnection connection = new NetworkConnection();
        connection.setIp("126.122.3.1");
        connection.loadVImpData();

        System.out.println(connection);

        NetworkConnection connectionClone1 = (NetworkConnection) connection.clone();
        connectionClone1.setIp("201.122.124.12");
        System.out.println("Cloned object of the initial connection object : "+connectionClone1);

        // it can be observed that ideally the operation heavy method loadVImpData() takes some time to operate on
        // however when we work on cloning the data it skips the resourced consumption and directly works on that.
        
    }
}
