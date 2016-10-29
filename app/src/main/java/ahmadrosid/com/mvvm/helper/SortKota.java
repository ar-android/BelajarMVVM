package ahmadrosid.com.mvvm.helper;

import java.util.ArrayList;

import ahmadrosid.com.mvvm.model.api.ListKota;

/**
 * Created by ocittwo on 10/30/16.
 *
 * @Author Ahmad Rosid
 * @Email ocittwo@gmail.com
 * @Github https://github.com/ar-android
 * @Web http://ahmadrosid.com
 */

public class SortKota {

    private ArrayList<ListKota.DataBean> arrayList;
    private Integer count, count2;

    public SortKota(ArrayList<ListKota.DataBean> affs) {
        count = new Integer(1);
        count2 = new Integer(0);
        arrayList = arrangeNumbers(affs);
    }

    public ArrayList<ListKota.DataBean> arrangeNumbers(ArrayList<ListKota.DataBean> list) {
        while (list.size() > 1 && count != list.size() - 1) {
            if (list.get(count2).getIntId() > list.get(count).getIntId()) {
                list.add(count, list.get(count2));
                list.remove(count2 + 1);
            }
            if (count2 == list.size() - 1) {
                count++;
                count2 = count + 1;
            } else {
                count2++;
            }
        }
        return list;
    }

    public ArrayList<ListKota.DataBean> getArrayList() {
        return arrayList;
    }
}
