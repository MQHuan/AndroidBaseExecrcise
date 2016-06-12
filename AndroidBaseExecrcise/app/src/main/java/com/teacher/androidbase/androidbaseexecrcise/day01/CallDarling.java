package com.teacher.androidbase.androidbaseexecrcise.day01;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.teacher.androidbase.androidbaseexecrcise.R;
import com.teacher.androidbase.androidbaseexecrcise.ShowDemoCodeBaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2016/6/12.
 */
public class CallDarling extends ShowDemoCodeBaseActivity implements View.OnClickListener {
    @BindView(R.id.call_darling_button)
    Button mCallDarlingButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day01_call_darling);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mCallDarlingButton = (Button) findViewById(R.id.call_darling_button);
        mCallDarlingButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel://234523"));
        startActivity(intent);
    }
}
