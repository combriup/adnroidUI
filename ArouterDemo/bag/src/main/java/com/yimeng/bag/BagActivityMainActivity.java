package com.yimeng.bag;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

@Route(path = "/bag/bag_main_activity")
public class BagActivityMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bag_activity_main);
    }

    public void jump2(View view) {
        ARouter.getInstance().build("/app/main_activity").navigation();
    }
}
