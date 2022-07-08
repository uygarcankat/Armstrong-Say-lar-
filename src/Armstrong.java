import java.util.Scanner;



public class Armstrong {
    public static void main(String[] args) {

/* Armstrong Sayıları Bulan Program

Scanner input = new Scanner(System.in);

        int bassayi = 0;
        int bas_value;
        int result =1;
        int sum=0;

        System.out.println( "Lütfen sayı giriniz");

        int number = input.nextInt();

//basamak sayısını bulur
        int temp_number = number;
        for(int i =0; temp_number>0 ; i++) {

            temp_number /= 10;
            bassayi++;
        }


        temp_number = number;

//basamak değerlerini bulur

        while (temp_number>0) {

            bas_value = temp_number % 10;

            temp_number /= 10;



            result=1;

            for (int i =0 ; bassayi > i; i++) {

                result *= bas_value;


        }
            sum += result;



        }

            if (number==sum){

                System.out.println("Bu sayı Armstrong sayıdır");}

                else{
                System.out.println("Bu sayı Armstrong sayı değildir !");}
*/



        System.out.println("-------------------------------------------------------------------------");

// Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.


        Scanner input = new Scanner(System.in);

        int bassayi = 0;
        int bas_value;
        int sum=0;

        System.out.println( "Lütfen sayı giriniz");

        int number = input.nextInt();


        int temp_number = number;
        for(int i =0; temp_number>0 ; i++) {

            temp_number /= 10;
            bassayi++;
        }


        temp_number = number;

        while (temp_number>0) {

            bas_value = temp_number % 10;

            temp_number /= 10;

            sum += bas_value;

        }

        System.out.println(sum);




    }
}
