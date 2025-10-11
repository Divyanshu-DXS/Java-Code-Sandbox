package com.dev.dxs.MavenProjectDemo1;

public class Game {
    private String name;
    private String productionHouse;
    private int id;
    private int rank;

    public Game(String name, String productionHouse, int id, int rank) {
        this.name = name;
        this.productionHouse = productionHouse;
        this.id = id;
        this.rank = rank;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProductionHouse(String productionHouse) {
        this.productionHouse = productionHouse;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", productionHouse='" + productionHouse + '\'' +
                ", id=" + id +
                ", rank=" + rank +
                '}';
    }

    public Game() {
    }
}
