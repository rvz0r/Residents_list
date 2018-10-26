package Residents.list;

import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("What city are you from?\n");
    String nameOfCity = scan.next();
    //close it
    System.out.print("Please, enter name, surname and PESEL:\n");
    Scanner scan1 = new Scanner(System.in);
    String name_sname_pesel = scan1.nextLine();
    String bbname_sname = name_sname_pesel;
    String bPESEL = name_sname_pesel.replaceAll("\\D+","");
    long PESEL = Long.parseLong(bPESEL);
    String bname_sname = bbname_sname.replaceAll("[0-9]+","");
    String name_sname = bname_sname.substring(0, bname_sname.length() - 1);
    System.out.print(nameOfCity + " " + name_sname + " " + PESEL);
    PESEL_validation Pval = new PESEL_validation();
    boolean PeselCorrect = Pval.validator(PESEL);
    if (PeselCorrect) {
      System.out.print("\nYour PESEL is correct");
    }
    else {
      System.out.print("\nYou're fucked, you are getting aborted... :c");
    }
    scan.close();
    scan1.close();
  }
}
