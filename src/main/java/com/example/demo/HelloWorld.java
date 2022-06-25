package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @Autowired
    private CarList listaAut;

    @RequestMapping("/hello")
    public String helloWorld(){
        return "hello world";
    }
    @RequestMapping("/ile")
    public int ileMamyAut() {
        return listaAut.iloscAut();
    }

    @RequestMapping(
            value="/dodajAuto",
            method= RequestMethod.GET
    )
    public boolean dodajAuto(@RequestParam("n") String nazwa,@RequestParam("p") int predkosc) {
        try{
            listaAut.dodawanieAut(new Car("audi", 100));
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
