package Residents.list;

import java.util.Scanner;

public class Citizen {
  private String name;
  private String city;
  private Pesel peselNumber;

  Citizen(String city,String name,Pesel number){
    this.city = city;
    this.name = name;
    this.peselNumber = number;
  }

  void getCityData(String x){
    Scanner scan = new Scanner(System.in);
    this.city = scan.next();
    scan.close();
  }

  public static void getCitizenData(){
    Scanner scan = new Scanner(System.in);
    String data = scan.nextLine();
    Scanner datascan = new Scanner(data);
    String peselToConvert = datascan.findInLine("\\d");
    long number = Long.parseLong(peselToConvert);

  }
}
