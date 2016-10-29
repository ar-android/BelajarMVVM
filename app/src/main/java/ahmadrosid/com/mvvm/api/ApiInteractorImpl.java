package ahmadrosid.com.mvvm.api;

import ahmadrosid.com.mvvm.model.api.JadwalBioskop;
import ahmadrosid.com.mvvm.model.api.ListKota;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.schedulers.Schedulers;

/**
 * Created by ocittwo on 10/30/16.
 *
 * @Author Ahmad Rosid
 * @Email ocittwo@gmail.com
 * @Github https://github.com/ar-android
 * @Web http://ahmadrosid.com
 */
public class ApiInteractorImpl implements ApiInteractor {

    private ApiServices apiServices;

    public ApiInteractorImpl() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://ibacor.com")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        apiServices = retrofit.create(ApiServices.class);
    }

    @Override public Observable<ListKota> getListKota() {
        return apiServices.getListKota().subscribeOn(Schedulers.io());
    }

    @Override public Observable<JadwalBioskop> getJadwalBioskop(int id) {
        return apiServices.getjadwalBioskop(id).subscribeOn(Schedulers.io());
    }

}
