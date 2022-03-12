package ru.skypro;

public class Main {

    public static void main(String[] args) {
        //    №6
        int age = 25;
        float salary = 58_000;
        if(age >= 23 && salary >= 50_000 && salary < 80_000) {
            salary *= 3 * 1.2;
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом: " +salary+ " рублей");
        }
        else if(salary >= 80_000 && age >= 23) {
            salary *= 3 * 1.5;
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом: " +salary+ " рублей");
        }
        else if(salary < 50_000 && age >= 23){
            salary *= 3;
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом: " +salary+ " рублей");
        }


        if(age < 23 && salary >= 50_000 && salary < 80_000){
            salary *= 2 * 1.2;
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом: " +salary+ " рублей");
        }
        else if(salary >= 80_000 && age < 23) {
            salary *= 2 * 1.5;
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом: " +salary+ " рублей");
        }
        else if(salary < 50_000 && age < 23){
            salary *= 2;
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом: " +salary+ " рублей");
        }

//       №7

        int age = 25;
        double salary = 90_000;
        int wantedSum = 330_000;
        double creaditRate = 0.10;


        if (age < 23 && salary <= 80_000) {
            creaditRate += 0.01;
        }
        else if(age < 23 && salary > 80_000){
            creaditRate += 0.003;
        }
        if(age < 30 && age >= 23 && salary <= 80_000){
            creaditRate += 0.005;
        }
        else if(age < 30 && age >= 23 && salary > 80_000){
            creaditRate -= 0.002;
        }

        double sumWithPersent = wantedSum * creaditRate + wantedSum;
        sumWithPersent /= 12;

        if(sumWithPersent > 0.5 * salary){
            System.out.println("Максимальный платеж при ЗП "+salary+ " равен:"+0.5*salary+" рублей. Платеж по кредиту: "+sumWithPersent+" рублей.Отказано.");
        }
        if(sumWithPersent < 0.5 * salary){
            System.out.println("Максимальный платеж при ЗП "+salary+ " равен:"+0.5*salary+" рублей. Платеж по кредиту: "+sumWithPersent+" рублей.Одобрено.");
        }

    }
}