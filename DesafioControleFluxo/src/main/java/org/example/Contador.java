package org.example;

import org.example.exceptions.ParametroInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametroInvalidosException {
        Scanner sc = new Scanner(System.in);
        int numberOne = sc.nextInt();
        int numberTwo = sc.nextInt();

        try{
            contadorParametros(numberOne, numberTwo);
        } catch (ParametroInvalidosException e) {
            System.out.println(e.getMessage());
        }

    }
    static void contadorParametros(int numberOne, int numberTwo) throws ParametroInvalidosException {

        if(numberTwo > numberOne){
            int contador = numberTwo - numberOne;
            for(int i = 1; i <= contador; i++){
                System.out.println(i);
            }
        }else{
            throw new ParametroInvalidosException("O segundo valor é menor que o primeiro");
        }
    }

}