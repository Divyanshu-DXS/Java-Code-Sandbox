package DesignPatterns.Prototype;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable {
    String ip;
    String nwConnection;
    List<String> domains = new ArrayList<String>();

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

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public void loadVImpData() throws InterruptedException {
        // Ideally this is that one complex part of the program that is time consuming and can take up some resources.
        // When cloning or prototyping we want to avoid these to be operated on again and again as it can get very time consuming.
        this.nwConnection="Very important data!";

        this.domains.add("www.123.com");
        this.domains.add("www.google.com");
        this.domains.add("www.abcd.com");
        this.domains.add("www.demo.com");
        // to demonstrate that this data could be operation heavy and could take a lot of time to process lets add a thread sleep method here
        Thread.sleep(5000);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // implementing deep cloning
        NetworkConnection connection = new NetworkConnection();
        connection.setIp(this.getIp());
        connection.setNwConnection(this.getNwConnection());
        for(String s : this.getDomains()){
            connection.getDomains().add(s);
        }

        return connection;
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", nwConnection='" + nwConnection + '\'' +
                ", domains=" + domains +
                '}';
    }
}
