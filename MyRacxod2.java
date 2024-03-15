import java.util.Scanner;
public class MyRacxod2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Podschet koshelek = new Podschet();
        koshelek.setPlusNal(koshelek.SborOne(),koshelek.SborTwo(),koshelek.SborThree(),koshelek.SborFour());
        System.out.println("Сумма полученной налички --> " + koshelek.getItogNal()+ " р ");
        System.out.println("Сумма полученного в онлайне --> " + koshelek.getItogOnl()+ " р ");
        System.out.println("Общий баланс вашего кошелька  --> " + koshelek.getItogSum()+ " р ");
        System.out.println("Ваша прибыль --> " + koshelek.getPribavil() + " р ");
        System.out.println("Всего потрачено --> " + koshelek.getPotratil()+ " р ");

    }
}
class Podschet{
    int nalikom = 5000;
    int naKarte = 15000;
    private int plusNal;
    private int plusOnl;
    private int minusNal;
    private int minusOnl;
    private int itogNal;
    private int itogOnl;
    private int itogSum;
    private int potratil;
    private int pribavil;
    Scanner scan = new Scanner(System.in);
     int SborOne(){
        System.out.println("Введите число прибыли в наличке --> ");
        int one = scan.nextInt();
         if (one < 0){
             System.out.println("Вы ввели отрицательное число прибыли в наличке, пожалуйста введите число без знака (-) ");
         }
         else {
             return one;
         }
         return one;
    }
    int SborTwo(){
        System.out.println("Введите число убыли в наличке --> ");
        int two = scan.nextInt();
        if(two < 0) {
            System.out.println("Вы ввели отрицательное число убыли в наличке, пожалуйста введите число без знака (-) ");
        }
        else {
            return two;
        }
        return two;
    }
    int SborThree(){
         System.out.println("Введите число прибыли в онлайне -->");
        int three = scan.nextInt();
        if(three < 0){
            System.out.println("Вы ввели отрицательное число прибыли в онлайне, пожалуйста введите число без знака (-) ");
        }
        else {
            return three;
        }
        return three;

    }
    int SborFour(){
        System.out.println("Введите число убыли в онлайне --> ");
        int four = scan.nextInt();
        if (four < 0){
            System.out.println("Вы ввели отрицательное число убыли в онлайне, пожалуйста введите число без знака (-) ");
        }
        else {
            return four;
        }
        return four;

    }
    public void setPlusNal(int plusNal, int minusNal, int plusOnl, int minusOnl){
            this.plusNal = plusNal;
            this.minusNal = minusNal;
            this.plusOnl = plusOnl;
            this.minusOnl = minusOnl;
    }
    int getItogNal(){
        itogNal = nalikom + plusNal - minusNal;
        return itogNal ;
    }
    int getItogOnl(){
        return itogOnl = naKarte + plusOnl - minusOnl ;
    }
    int getItogSum () {
         return itogSum = itogNal + itogOnl;
    }
    int getPotratil () {
         return potratil = minusNal + minusOnl;
    }
    int getPribavil () {
        return pribavil = plusNal + plusOnl;
    }

}




