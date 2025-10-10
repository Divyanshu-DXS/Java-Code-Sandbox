package com.dev.dxs.MavenProjectDemo1;

public class CompanyData {
    private String name;
    private int id;

    public CompanyData() {
    }

    public CompanyData(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CompanyData{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
