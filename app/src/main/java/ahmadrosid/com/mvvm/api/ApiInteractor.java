package ahmadrosid.com.mvvm.api;

import ahmadrosid.com.mvvm.model.api.JadwalBioskop;
import ahmadrosid.com.mvvm.model.api.ListKota;
import rx.Observable;

/**
 * Created by ocittwo on 10/30/16.
 *
 * @Author Ahmad Rosid
 * @Email ocittwo@gmail.com
 * @Github https://github.com/ar-android
 * @Web http://ahmadrosid.com
 */
public interface ApiInteractor {
    Observable<ListKota> getListKota();
    Observable<JadwalBioskop> getJadwalBioskop(int id);
}
