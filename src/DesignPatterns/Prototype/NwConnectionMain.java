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
        System.out.println("Connection Clone 1 : "+connectionClone1);
        NetworkConnection connectionClone2 = (NetworkConnection) connection.clone();
        System.out.println("Connection Clone 2 : "+connectionClone2);
        // it can be observed that ideally the operation heavy method loadVImpData() takes some time to operate on
        // however when we work on cloning the data it skips the resourced consumption and directly works on that.

        // removing an element in the List object inside the class - modifying the object inside class
        // because this is cloned - if shallow cloned, the same changes reflect on the clones as well
        // if deep cloned, the cloned object maintains its integrity and are not affected if the original object is modified.
        // to deep clone we can implement conditions inside the overridden clone() inside the cloneable set class
        connection.getDomains().remove(0);

        System.out.println(connection);
        System.out.println("Connection Clone 1 : "+connectionClone1);

        NetworkConnection connectionClone3 = (NetworkConnection) connection.clone();
        System.out.println("Connection Clone 3 : "+connectionClone3);



    }
}
