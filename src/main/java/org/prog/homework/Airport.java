package org.prog.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Airport {


    public final List<Plane> planes = new ArrayList<>();



    //if no plane found - throw exception
    public Plane getPlaneByFlightIdAndDestination() throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите номер нужного рейса");
        String a= sc.nextLine();
        System.out.println("Место назначения");
        String b= sc.nextLine();
        String getPlaneByFlightIdAndDestination = planes.stream()
                .filter(plane -> plane.destination.equals(b))
                .filter(plane -> plane.flightNumber.equals(a))
                .map(plane -> plane.flightNumber)
                .findAny().get();
        System.out.println("Рейс найден  "+getPlaneByFlightIdAndDestination+"  ");
        if (getPlaneByFlightIdAndDestination.isEmpty()){
            throw new Exception();
        }
        return null;
    }

    //if no plane found - throw exception
    public List<Plane> planeByDestination()throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Куда летим?");
        String c= sc.nextLine();
        List<String> planeByDestination = planes.stream()
                .filter(plane -> plane.destination.equals(c))
                .map(plane -> plane.flightNumber)
                .collect(Collectors.toList());
        System.out.println("Самолеты на "+ c);
        for (String i : planeByDestination) {
            System.out.println(i);
        }
        if (planeByDestination.isEmpty()){
            throw new Exception();
        }

        return null;
    }
}
