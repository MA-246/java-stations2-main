import java.util.ArrayList;

public class SetItem extends Item {
    ArrayList<Item> items = new ArrayList<Item>();

    @Override
    public String getName() {

        String setName = super.getName();

        String buff = "";

        for (int i = 0; i < items.size(); i++) {
            buff += items.get(i).getName();

            if (i != items.size() - 1) {
                buff += ",";
            }
        }
        return setName + "(" + buff + ")";
    }
}
