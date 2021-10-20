package com.company;

import java.util.Scanner;

public class Main {
private static KitchenFactory kitchenFactory;
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("1 - Tempura\n2 - Philadelphia");
        System.out.println("Which type of sushi will you order?");
        Integer sushi=scanner.nextInt();

        choose(sushi);
        run();
    }

    static void choose(Integer sushi){
      if(sushi==1){
          kitchenFactory=new TempuraKitchenFactory();
      }
      else if(sushi==2){
          kitchenFactory=new PhiladelphiaKitchenFactory();
      }
    }
    static void run(){
        kitchenFactory.prepareSushi();
    }
}
