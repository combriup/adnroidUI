package com.yimeng.arouterdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

/**
 * @author chenliangliang6
 * @version v1.0.0 2020/5/22 10:46
 */
@Route(path = "/app/main_activity")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jump(View view) {
        Log.i("TAG123", "jump: "+"我执行了该方法");
        Fragment fragment = (Fragment) ARouter.getInstance().build("/app/test1Activity")
                .withString("name", "校长")
                .withString("ages", "18")
                .navigation();
    }
}
