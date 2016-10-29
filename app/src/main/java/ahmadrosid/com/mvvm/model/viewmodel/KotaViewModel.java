package ahmadrosid.com.mvvm.model.viewmodel;

import ahmadrosid.com.mvvm.api.ApiInteractor;
import ahmadrosid.com.mvvm.model.api.ListKota;
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
public class KotaViewModel {

    private ApiInteractor interactor;
    private Scheduler scheduler;

    public KotaViewModel(ApiInteractor interactor, Scheduler scheduler) {
        this.interactor = interactor;
        this.scheduler = scheduler;
    }

    public Observable<ListKota> getListKota(){
        return interactor.getListKota().observeOn(scheduler);
    }
}
