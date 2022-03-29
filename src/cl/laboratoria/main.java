package cl.laboratoria;
import java.util.ArrayList;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion=0;
        int menu=0;
        ArrayList<Asiento>asientoArrayList = new ArrayList<>();
        for (int i=1; i<=30; i++){
            asientoArrayList.add(new Asiento(i,5000,false));
        }

        do {
            System.out.println("bienvenido al sistema de reserva de asientos de no se que ");
            System.out.println(" presiona [1] para reservar asiento");
            System.out.println(" presiona [2] para ver asientos disponibles");
            System.out.println(" presiona [3] para ver total recaudado");
             menu=scan.nextInt();
            switch (menu){
                case OPCION_MENU_RESERVAR:
                    reservar(asientoArrayList,opcion);
                    break;
                case OPCION_MENU_DISPONIBLES:
                    disponibles(asientoArrayList);
                    break;
                case OPCION_MENU_VER_RECAUDACIONES:
                    recaudar(asientoArrayList);
                    break;
            }

        }while (menu != OPCION_MENU_SALIR);
    }

    //declaracion del menú
    public static final int OPCION_MENU_RESERVAR =1;
    public static final int OPCION_MENU_DISPONIBLES =2;
    public static final int OPCION_MENU_VER_RECAUDACIONES =3;
    public static final int OPCION_MENU_SALIR = 0;

    //metodos externos
    public static void recaudar(ArrayList<Asiento> asientoArrayList){
        int reserv=0;
        int cantidad=0;
        for(int i= 0 ; i<asientoArrayList.size(); i++){
            if (asientoArrayList.get(i).isReservado()){
                reserv+=asientoArrayList.get(i).getValorAsiento();
                cantidad += 1;
            }
        }
        System.out.println("Se han vendido "+cantidad+" asientos y se a recaudado $"+reserv);
    }
    public static void disponibles(ArrayList<Asiento> asientoArrayList){
        System.out.println("Estos son los asientos disponibles ");
        for(int i= 0 ; i<asientoArrayList.size(); i++){
            if (!asientoArrayList.get(i).isReservado()){
                System.out.println("Asiento numero ["+asientoArrayList.get(i).getNumAsiento()+"]");
            }
        }
    }
    public static void reservar(ArrayList<Asiento> asientoArrayList, int opcion){
        Scanner scan = new Scanner(System.in);
        boolean bandera = true;
        System.out.println("escriba el numero del asiento que desea");
        opcion=scan.nextInt();
        for (int i=0; i<asientoArrayList.size(); i++){
            if (asientoArrayList.get(i).getNumAsiento()==opcion){
                bandera=false;
                if (!asientoArrayList.get(i).isReservado()){
                    asientoArrayList.get(i).setReservado(true);
                    System.out.println("asiento reservado");
                }else {
                    System.out.println("No puede reservar el asiento ya que se encuentra reservado con antelacion");
                }
            }
        }
        if (bandera){
            System.out.println("el numero ingresado mayor a 30");
        }
    }
    public static void noNum(){

    }

}
