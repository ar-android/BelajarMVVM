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
public class ItemKota extends BaseObservable{
    @Bindable
    public String item;

    public ItemKota(String item) {
        setItem(item);
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
        notifyPropertyChanged(BR.kota);
    }
}
