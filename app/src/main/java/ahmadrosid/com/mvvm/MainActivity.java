package ahmadrosid.com.mvvm;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import ahmadrosid.com.mvvm.databinding.ContentMainBinding;
import ahmadrosid.com.mvvm.model.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ContentMainBinding binding = DataBindingUtil.setContentView(this, R.layout.content_main);
        User user = new User("Ahmad", "Rosid");
        binding.setUser(user);
    }
}
