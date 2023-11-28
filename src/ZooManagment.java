import java.util.Scanner;

public class ZooManagment {
    int nbC =20 ;
    String zooname ="my zoo";
    public static  void  main (String []args)
    {
        ZooManagment Z = new ZooManagment();
        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez saisir nom de zoo  :");
        String str = sc.nextLine();
        System.out.println("Vous avez saisi : " + str);
        Z.zooname=str;

        System.out.println(Z.zooname + " comporte " +Z.nbC + " cages");
    }
}
