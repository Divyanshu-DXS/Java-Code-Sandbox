package DesignPatterns.Prototype;

public class NetworkConnection implements Cloneable {
    String ip;
    String nwConnection;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getNwConnection() {
        return nwConnection;
    }

    public void setNwConnection(String nwConnection) {
        this.nwConnection = nwConnection;
    }

    public void loadVImpData() throws InterruptedException {
        // Ideally this is that one complex part of the pragram that is time consuming and can take up some resources.
        // When cloning or prototyping we want to avoid these to be operated on again and again as it can get very time consuming.
        this.nwConnection="Very important data!";
        // to demonstrate that this data could be operation heavy and could take a lot of time to process lets add a thread sleep method here
        Thread.sleep(5000);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", nwConnection='" + nwConnection + '\'' +
                '}';
    }
}
