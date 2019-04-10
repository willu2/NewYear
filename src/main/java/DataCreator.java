import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DataCreator {

    private List allData;
    private List selectData;
    private BaseOfItems items;
    private OrnamentEntity entity;
    private MenuBuillder menu;

    public DataCreator() {
        menu = new MenuBuillder();
        allData = new ArrayList<OrnamentEntity>();
        selectData = new ArrayList<OrnamentEntity>();

        pullShopDb();
    }

    public void showaAllData(){
        Collections.shuffle(allData);
        for (Iterator<OrnamentEntity> it = allData.iterator(); it.hasNext();){
            OrnamentEntity entity = it.next();
            printItemList(entity);
        }
    }

     public void showSelectData(){
         System.out.println("Your stuffs :>>");
           Collections.sort(selectData);
                for (Iterator<OrnamentEntity> it = selectData.iterator(); it.hasNext();){
                      OrnamentEntity entity = it.next();
                      printItemList(entity);
        }
     }
    public void addData(){
        boolean exit = false;
        do {
             int item = 0;
            System.out.println("Select type to add:>");
            System.out.println("8 :>  Exit");
            printTypes();
             item = menu.menuTotalPowerEnter();

             switch (item) {
                 case 8:
                     exit = true;
                     break;
                 default:
                     addSelectData(item);
                     System.out.println("Item had added ");
             }
         } while (!exit);
        }

     public void addSelectData(int i){

         DecorType item = DecorType.values()[i-1];
         Collections.shuffle(allData);
         for (Iterator<OrnamentEntity> it = allData.iterator(); it.hasNext();){
             OrnamentEntity entity = it.next();
             if(entity.getDecorType() == item){
                 selectData.add(entity);
             }
         }
        }

    private void pullShopDb(){
        items = new BaseOfItems();
        for (int i = 0; i < DecorType.values().length; i++) {
            for (int ent = 0; ent < items.getItems().length; ent++) {
                entity = new OrnamentEntity(DecorType.values()[i], items.getItems()[ent]);
                allData.add(entity);
            }
        }
    }

    public void printTypes(){
        int i = 1;
        for(DecorType item : DecorType.values()){
            System.out.println(i++ + " " + item);
        }
    }

    public void getByTypeNumber(int i){
        DecorType item = DecorType.values()[i-1];
        Collections.shuffle(allData);
        for (Iterator<OrnamentEntity> it = allData.iterator(); it.hasNext();){
            OrnamentEntity entity = it.next();
            if(entity.getDecorType() == item){
                printItemList(entity);
            }
        }
    }

    private void printItemList(OrnamentEntity entity){
        System.out.print("Name:> " + entity.getName());
        System.out.print("  ||_Type:> " + entity.getDecorType() );
        System.out.println();
    }
}
