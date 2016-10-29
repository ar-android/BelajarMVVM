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

public class ApiInteractorMock implements ApiInteractor{
    @Override public Observable<ListKota> getListKota() {
        return Observable.just(getMockListKota());
    }

    @Override public Observable<JadwalBioskop> getJadwalBioskop(int id) {
        return Observable.just(getMockJadwalBioskop());
    }

    private JadwalBioskop getMockJadwalBioskop() {
        return new JadwalBioskop();
    }

    private ListKota getMockListKota(){
        return new ListKota();
    }
}
