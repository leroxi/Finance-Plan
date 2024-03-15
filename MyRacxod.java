import java.util.Scanner;

public class MyRacxod {
    public static void main(String[] args) {
        int myKoshelek = 15000;
        int myTink = 5000;
        Scanner rasxodNal = new Scanner(System.in);
        Scanner zarNal = new Scanner(System.in);
        Scanner zarOnl = new Scanner(System.in);
        Scanner rasxodOnl = new Scanner(System.in);
        System.out.println("Введите число вашей прибыли в наличке");
        int plusNal = zarNal.nextInt();
        System.out.println("Введите число вашей прибыли в онлайне");
        int plusOnl = zarOnl.nextInt();
        System.out.println("Введите число вашей убыли в наличке");
        int minusNal = rasxodNal.nextInt();
        System.out.println("Введите число вашей убыли в онлайне");
        int minusOnl = rasxodOnl.nextInt();
        int itogNal = myKoshelek + plusNal - minusNal;
        int itogOnl = myTink + plusOnl - minusOnl;
        int itogSum = itogNal + itogOnl;
        int potratil = minusOnl + minusNal;
        int pribavil = plusOnl + plusNal;
        if (itogNal >= 0){
            if (itogOnl >= 0){
                System.out.println("Баланс вашего кошелька: Наличные " + itogNal + "р Онлайн " + itogOnl + "р");
                System.out.println("Общий баланс вашего кошелька " + itogSum + "р");
                System.out.println("Вы потратили " + potratil + "р     " + "Вы получили " +pribavil + "р" );
            }
            else {
                System.out.println("Не корректно введены данные, попробуйте еще раз");
            }
        }
        else {
            System.out.println("Не корректно введены данные, попробуйте еще раз");
        }


    }


}



