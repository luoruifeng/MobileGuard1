package cn.edu.gdmec.android.mobileguard1.m2theftguard.dialog.utils;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import cn.edu.gdmec.android.mobileguard1.R;

/**
 * Created by lenovo on 2017/10/15.
 */

public class LostFindActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState );
        setContentView (R.layout.activity_lost_find );
        startSetup1Activity();
    }

    private void startSetup1Activity() {
        Intent intent = new Intent ( LostFindActivity.this,Setup1Activity.class );
        startActivity ( intent );
        finish ();
    }
}
