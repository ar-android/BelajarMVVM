package ahmadrosid.com.mvvm.model.viewmodel;

import ahmadrosid.com.mvvm.api.ApiInteractor;
import ahmadrosid.com.mvvm.model.api.JadwalBioskop;
import rx.Observable;
import rx.Scheduler;

/**
 * Created by ocittwo on 10/30/16.
 *
 * @Author Ahmad Rosid
 * @Email ocittwo@gmail.com
 * @Github https://github.com/ar-android
 * @Web http://ahmadrosid.com
 */

public class JadwalViewModel {

    private ApiInteractor interactor;
    private Scheduler scheduler;

    public JadwalViewModel(ApiInteractor interactor, Scheduler scheduler) {
        this.interactor = interactor;
        this.scheduler = scheduler;
    }

    public Observable<JadwalBioskop> getJadwalBioskop(int id){
        return interactor.getJadwalBioskop(id).observeOn(scheduler);
    }
}
