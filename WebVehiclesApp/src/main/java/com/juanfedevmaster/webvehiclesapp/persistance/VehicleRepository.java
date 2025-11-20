/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.juanfedevmaster.webvehiclesapp.persistance;

import com.juanfedevmaster.webvehiclesapp.models.Vehicle;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jufeq
 */
public class VehicleRepository {
    public List<Vehicle> getAllVehicles(){
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Vehicle("Toyota", "Corolla", 2020, 52000));
        vehicles.add(new Vehicle("Toyota", "RAV4", 2022, 138000));
        vehicles.add(new Vehicle("Toyota", "Hilux", 2021, 160000));

        vehicles.add(new Vehicle("Mazda", "CX-30", 2023, 115000));
        vehicles.add(new Vehicle("Mazda", "3 Sedan", 2020, 78000));
        vehicles.add(new Vehicle("Mazda", "CX-5", 2022, 145000));

        vehicles.add(new Vehicle("Kia", "Sportage", 2021, 98000));
        vehicles.add(new Vehicle("Kia", "Rio", 2019, 46000));
        vehicles.add(new Vehicle("Kia", "Seltos", 2022, 105000));

        vehicles.add(new Vehicle("Chevrolet", "Onix", 2019, 45000));
        vehicles.add(new Vehicle("Chevrolet", "Tracker", 2021, 90000));
        vehicles.add(new Vehicle("Chevrolet", "Equinox", 2020, 122000));

        vehicles.add(new Vehicle("Nissan", "Versa", 2022, 60000));
        vehicles.add(new Vehicle("Nissan", "Kicks", 2021, 85000));
        vehicles.add(new Vehicle("Nissan", "Frontier", 2020, 150000));

        vehicles.add(new Vehicle("Hyundai", "Tucson", 2020, 105000));
        vehicles.add(new Vehicle("Hyundai", "Elantra", 2019, 68000));
        vehicles.add(new Vehicle("Hyundai", "Santa Fe", 2022, 160000));

        vehicles.add(new Vehicle("Ford", "Ranger", 2018, 130000));
        vehicles.add(new Vehicle("Ford", "Escape", 2021, 118000));
        vehicles.add(new Vehicle("Ford", "Fiesta", 2017, 42000));

        vehicles.add(new Vehicle("Renault", "Duster", 2021, 72000));
        vehicles.add(new Vehicle("Renault", "Koleos", 2020, 118000));
        vehicles.add(new Vehicle("Renault", "Logan", 2018, 38000));

        vehicles.add(new Vehicle("Volkswagen", "Gol", 2017, 38000));
        vehicles.add(new Vehicle("Volkswagen", "T-Cross", 2022, 108000));
        vehicles.add(new Vehicle("Volkswagen", "Virtus", 2021, 82000));

        vehicles.add(new Vehicle("BMW", "X3", 2022, 220000));
        vehicles.add(new Vehicle("BMW", "320i", 2020, 185000));
        vehicles.add(new Vehicle("BMW", "X1", 2021, 195000));
        
        return vehicles;
    }
}
