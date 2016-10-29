package ahmadrosid.com.mvvm.model.view;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import ahmadrosid.com.mvvm.BR;

/**
 * Created by ocittwo on 10/30/16.
 *
 * @Author Ahmad Rosid
 * @Email ocittwo@gmail.com
 * @Github https://github.com/ar-android
 * @Web http://ahmadrosid.com
 */
public class Jadwal extends BaseObservable {
    @Bindable
    public String kota;

    public Jadwal(String kota) {
        setKota(kota);
    }

    public void setKota(String kota) {
        this.kota = kota;
        notifyPropertyChanged(BR.jadwal);
    }

    public String getKota() {
        return kota;
    }
}
