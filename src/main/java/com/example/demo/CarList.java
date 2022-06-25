package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarList {
    private List<Car> listaAut;
    public CarList(){
        this.listaAut=new ArrayList<>();
    }
    public void dodawanieAut(Car auto){
        listaAut.add(auto);
    }
    public int iloscAut(){
        return listaAut.size();
    }
}
