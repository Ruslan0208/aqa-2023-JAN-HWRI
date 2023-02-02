package org.prog.homework;
import java.util.*;
import java.util.stream.Collectors;
import org.prog.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HomeworkMain {

    public static void main(String... args) {
        Airport airport= new Airport();



        Plane P0 = new Plane();
        P0.flightNumber = "DA3456";
        P0.destination = "Dnipro";


        Plane P1 = new Plane();
        P1.flightNumber = "AA1122";
        P1.destination = "Kiyv";

        Plane P2 = new Plane();
        P2.flightNumber = "AA1133";
        P2.destination = "Kiyv";

        Plane P3 = new Plane();
        P3.flightNumber = "AA1451";
        P3.destination = "Kiyv";

        Plane P4 = new Plane();
        P4.flightNumber = "AL3111";
        P4.destination = "Lviv";

        Plane P5 = new Plane();
        P5.flightNumber = "AL1189";
        P5.destination = "Lviv";

        Plane P6 = new Plane();
        P6.flightNumber = "AR8811";
        P6.destination = "Rivne";

        airport.planes.add(P0);
        airport.planes.add(P1);
        airport.planes.add(P2);
        airport.planes.add(P3);
        airport.planes.add(P4);
        airport.planes.add(P5);
        airport.planes.add(P6);

        try {
            airport.getPlaneByFlightIdAndDestination();
        }
        catch (Exception e){
            System.out.println("Пусто");
        }

        try{
            airport.planeByDestination();
        }
        catch (Exception e){
            System.out.println("Пусто");
        }

        }
    }
