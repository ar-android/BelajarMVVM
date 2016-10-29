package ahmadrosid.com.mvvm.model.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by ocittwo on 10/30/16.
 *
 * @Author Ahmad Rosid
 * @Email ocittwo@gmail.com
 * @Github https://github.com/ar-android
 * @Web http://ahmadrosid.com
 */

public class ListKota {

    private String status;
    private ArrayList<DataBean> data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<DataBean> getData() {
        Collections.sort(data, new Comparator<DataBean>() {
            @Override public int compare(DataBean o1, DataBean o2) {
                return o1.getIntId() - o2.getIntId();
            }
        });
        return data;
    }

    public void setData(ArrayList<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private String id;
        private String kota;

        public int getIntId(){
            return Integer.parseInt(id);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getKota() {
            return kota;
        }

        public void setKota(String kota) {
            this.kota = kota;
        }
    }
}
