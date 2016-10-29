package ahmadrosid.com.mvvm.adapter;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

/**
 * Created by ocittwo on 10/30/16.
 *
 * @Author Ahmad Rosid
 * @Email ocittwo@gmail.com
 * @Github https://github.com/ar-android
 * @Web http://ahmadrosid.com
 */

public class KotaViewHolder extends RecyclerView.ViewHolder {
    private ViewDataBinding viewDataBinding;

    public KotaViewHolder(ViewDataBinding viewDataBinding) {
        super(viewDataBinding.getRoot());
        this.viewDataBinding = viewDataBinding;
        viewDataBinding.executePendingBindings();
    }

    public ViewDataBinding getViewDataBinding() {
        return viewDataBinding;
    }
}
