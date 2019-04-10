import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenuBuillder {

    public void mainManu(){
        System.out.println("Menu :> ");
        System.out.println(" 1 :> Show all house stufs ");
        System.out.println(" 2 :> Find by type >>> ");
        System.out.println(" 2 :> Find by many types >>> ");
        System.out.println(" 4 :> Find stuff by power >>> ");
        System.out.println(" 5 :> Show stuffs by type >>> ");
        System.out.println(" 8 :> Exit ");

        System.out.println("Enter position :> ");
    }

    public void typeShow(){
        System.out.println("Enter value: ");
        System.out.println(" 1 :> ROOM |*|");
        System.out.println(" 2 :> KIDSROOM |*|");
        System.out.println(" 3 :> KITCHEN |*|");
        System.out.println(" 4 :> SERVICE |*|");
    }

    public void typeEnter(){
        System.out.println("Enter your type number:");
    }

    public void typeManyEnter(){
        System.out.println("Press 8 to end:");
    }

    public int menuTotalPowerEnter(){
        int visitorPrice = 0;

        try {
            while (visitorPrice <= 0 ){
                //System.out.println(message"Enter your power count: (int number) ? : ");
                try {
                    BufferedReader inPrice = new BufferedReader(new InputStreamReader(System.in));
                    visitorPrice = Integer.parseInt(inPrice.readLine());
                }catch (NumberFormatException c){}
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return visitorPrice;
    }
}
