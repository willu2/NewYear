import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ShowMenu {

    private MenuBuillder menu = new MenuBuillder();
    private DataCreator creator = new DataCreator();

    private boolean exit = false;

    public ShowMenu() {
    }

    public void show() {
        do {
            int item = 0;

            menu.mainManu();

            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

            switch (menu.menuTotalPowerEnter()) {
                case 1:
                    creator.showaAllData();
                    break;
                case 2:
                    menu.typeEnter();
                    creator.printTypes();
                    item = menu.menuTotalPowerEnter();
                    creator.getByTypeNumber(item);
                    break;
                case 3:
                   // creator.showByInside();
                    break;
                case 6:
                   /* menu.enterPriceMenu();
                    price = menu.menuTotalPriceEnter();
                    creator.showByPrice(price);*/
                    break;
                case 7:
                    break;
                case 8:
                    exit = true;
                    break;
                default:
                    System.out.println("Try again...");
            }

        } while (!exit);
    }
}
