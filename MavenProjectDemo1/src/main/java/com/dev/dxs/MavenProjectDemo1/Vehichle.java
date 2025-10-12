package com.dev.dxs.MavenProjectDemo1;

public class Vehichle {

    private Car car;

    Vehichle(Car car){
        this.car= car;
    }
    public void setCar(Car car) {
        this.car = car;
    }
    public void drive(){
        car.drive();
    }
}
