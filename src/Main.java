import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Welcome to the Adventure Game \n1)Play \n2)Quit");
        int select_start=in.nextInt();
        switch (select_start){
            case 1:
                Scanner a=new Scanner(System.in);
                System.out.println("Please enter your name:");
                String player_name=a.nextLine();
                System.out.println("Welcome to the Adventure Game "+player_name);
                break;
            case 2:
                break;
        }

    }

}