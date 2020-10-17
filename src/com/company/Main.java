package com.company;

import com.company.CustomExceptions.*;

import java.util.Scanner;

public class Main {
    private static int money;


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean choice;
        boolean success = false;
        int iteration = 0;

        Mens [] mens = Mens.values();

        System.out.println("We have a list of candidates and we will help you find your ideal man.\nBut it's not free");
        System.out.println("How much money do you have? (enter an integer)");

        money = in.nextInt();

        System.out.println("Describe your perfect man:");
        System.out.println("He loves cats? (true/false)");
        boolean cat = in.nextBoolean();

        System.out.println("He has a car? (true/false)");
        boolean car = in.nextBoolean();

        System.out.println("He is an introvert? (true/false)");
        boolean introvert = in.nextBoolean();

        System.out.println("He is rich? (true/false)");
        boolean rich = in.nextBoolean();

        System.out.println("He make sports? (true/false)");
        boolean sport = in.nextBoolean();
        YourPerfectMan perfectMan = new YourPerfectMan(introvert,cat,rich,car,sport);

        while (true){

            try{
                System.out.println((iteration+1) + " candidate is: "+mens[iteration]);
                pickAMan(perfectMan, mens[iteration]);
                System.out.println("Congratulations \u2764 You have a perfect match");
                success = true;
                break;
            }
            catch (IndexOutOfBoundsException | OutOfMemoryError e){
                System.out.println("Sorry we haven't more candidates");
                success = true;
                break;
            }
            catch(CarException e){
                System.out.println(e.toString());
            }
            catch (CatsException e){
                System.out.println(e.toString());
            }
            catch (IntrovertException e){
                System.out.println(e.toString());
            }
            catch(SportException e){
                System.out.println(e.toString());
            }
            catch (MoneyException e){
                if (perfectMan.heIsRich){
                    System.out.println("It seems that you mercantile girl");
                    money -= 1000;
                }
                System.out.println(e.toString());
            }
            catch (PerfectPersonDoesntExistException e){
                System.out.println(e.toString());
            }

            finally {
                iteration++;
               if(!success){ System.out.println("This man doesn't match. " +
                       "Do you want to see another one? (true/false)" +
                       "\nYour current balance is: " + money );
                choice = in.nextBoolean();
                if (!choice) break;
                else try{
                    paymentToSeeOneMoreMan(iteration);
                }catch (YouHaveNoMoneyException e){
                    System.out.println(e.toString());
                    break;
                }}
            }

        }
    }

    static void paymentToSeeOneMoreMan(int iteration){
        money -= 1000 * iteration;
        if(money <= 0) throw new YouHaveNoMoneyException();
    }
    static void pickAMan(YourPerfectMan man, Mens candidate) throws CatsException, IntrovertException,
            PerfectPersonDoesntExistException, MoneyException, SportException, CarException {
        if(man.catLover && man.heIsRich && man.heHasACar && man.takeSports) throw new PerfectPersonDoesntExistException();
        if(man.heIsIntrovert ^ candidate.heIsIntrovert()) throw new IntrovertException();
        if(man.catLover ^ candidate.heIsCatLover()) throw new CatsException();
        if(man.heHasACar ^ candidate.heHasACar()) throw new CarException();
        if(man.heIsRich ^ candidate.heIsRich()) throw new MoneyException();
        if(man.takeSports ^ candidate.heMakesSports()) throw new SportException();

    }
}
