import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataCreator {

    private List allData;
    private BaseOfItems items;
    private OrnamentEntity entity;

    public DataCreator() {
        allData = new ArrayList<OrnamentEntity>();

        pullShopDb();
    }

    public void pullShopDb(){
        items = new BaseOfItems();
        for (int i = 0; i < DecorType.values().length; i++) {
            for (int ent = 0; ent < items.getItems().length; ent++) {
                entity = new OrnamentEntity(DecorType.values()[i], items.getItems()[ent]);
                allData.add(entity);
            }
        }
    }

    public void showaAllData(){
        for (Iterator<OrnamentEntity> it = allData.iterator(); it.hasNext();){
            OrnamentEntity entity = it.next();
            printItemList(entity);
        }
    }

    private void printItemList(OrnamentEntity entity){
        System.out.print("Name:> " + entity.getName());
        System.out.print("  ||_Type:> " + entity.getDecorType() );
        System.out.println();
    }
}
