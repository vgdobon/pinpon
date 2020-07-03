import java.util.Scanner;

public class PinPon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hasta que número quieres ver pinpones");
        int valor=sc.nextInt();
        int contador=1;

        boolean ganadorPin=true;

        while(contador<=valor){
            if(contador%5==0 && contador%2!=0){
                System.out.println(contador+" PIN");
                ganadorPin=true;
            } else if(contador%10==0){
                System.out.println(contador+" PON");
                ganadorPin=false;
            } else{
                System.out.println(contador);
            }
            contador++;
        }


        if(ganadorPin){
            System.out.println("Ganador: PIN");
        }else{
            System.out.println("Ganador: PON");
        }
    }
}
