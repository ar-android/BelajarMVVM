package ahmadrosid.com.mvvm.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ahmadrosid.com.mvvm.BR;
import ahmadrosid.com.mvvm.R;
import ahmadrosid.com.mvvm.model.api.ListKota;
import ahmadrosid.com.mvvm.model.view.ItemKota;

/**
 * Created by ocittwo on 10/30/16.
 *
 * @Author Ahmad Rosid
 * @Email ocittwo@gmail.com
 * @Github https://github.com/ar-android
 * @Web http://ahmadrosid.com
 */

public class ListKotaAdapter extends RecyclerView.Adapter<KotaViewHolder> {

    private List<ItemKota> kota;
    private OnClickImpl onClick;

    public ListKotaAdapter(List<ListKota.DataBean> data, OnClickImpl onClick) {
        this.onClick = onClick;
        kota = new ArrayList<>();
        for (ListKota.DataBean dataBean : data) {
            kota.add(new ItemKota("" + dataBean.getId() + ". " + dataBean.getKota()));
        }
    }

    @Override public KotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ViewDataBinding viewDataBinding = DataBindingUtil.inflate(layoutInflater, R.layout.item_list_kota, parent, false);
        return new KotaViewHolder(viewDataBinding);
    }

    @Override public void onBindViewHolder(KotaViewHolder holder, final int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                onClick.onCLickView(position);
            }
        });
        ViewDataBinding viewDataBinding = holder.getViewDataBinding();
        viewDataBinding.setVariable(BR.listKota, kota.get(position));
    }

    @Override public int getItemCount() {
        return (null != kota ? kota.size() : 0);
    }

    public interface OnClickImpl{
        void onCLickView(int position);
    }

}
