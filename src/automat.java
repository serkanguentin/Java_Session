import java.util.Scanner;

public class automat {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int bakiye =1000;
        String islemler = "1.islem Bakiye ögrenme\n"
                + "2.islem para yatirma\n"
                + "3.islem Cekme\n"
                + "4.islem cikis icin q ya basiniz\n";
        System.out.println(islemler);
        while (true){
            System.out.println("islemi secin");
            String islem= scanner.nextLine();
            if (islem.equals("q")){
                System.out.println("programdan cikilyor");
                break;
            }
            else if (islem.equals("1")) {
                System.out.println("Bakiyeniz" + bakiye);

            }
            else if (islem.equals("2")) {
                System.out.println("cekmek istedigniztutar");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                if (bakiye-tutar<0){
                    System.out.println("yeterli bakiye yoktur.Bakiyeniz"+bakiye);
                }
                else{
                    bakiye -=tutar;
                    System.out.println("yeni bakyieniz"+ bakiye);

                }
            }
            else if (islem.equals("3")) {
                System.out.println("yatirmak istedignit tutar");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                bakiye +=tutar;
                System.out.println("yeni bakyenz"+bakiye);
            }
            else{
                System.out.println("gecersiz islem");
            }
            {

            }


        }
    }
    }

