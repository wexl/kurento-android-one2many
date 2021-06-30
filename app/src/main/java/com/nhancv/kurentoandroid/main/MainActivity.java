package com.nhancv.kurentoandroid.main;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.widget.EditText;

import com.hannesdorfmann.mosby.mvp.MvpActivity;
import com.nhancv.kurentoandroid.R;
//import com.nhancv.kurentoandroid.broadcaster.BroadCasterActivity;
import com.nhancv.kurentoandroid.broadcaster.BroadCasterActivity_;
import com.nhancv.kurentoandroid.one2one.One2OneActivity_;
//import com.nhancv.kurentoandroid.viewer.ViewerActivity;
import com.nhancv.kurentoandroid.viewer.ViewerActivity_;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

/**
 * Created by nhancao on 9/18/16.
 */

@EActivity(R.layout.activity_main)
public class MainActivity extends MvpActivity<MainView, MainPresenter> implements MainView {
    private static final String TAG = MainActivity.class.getName();
    private EditText roomId;
    private EditText serverIp;

    @Click(R.id.btBroadCaster)
    protected void btBroadCasterClick() {
        this.roomId = findViewById(R.id.roomid);
        this.serverIp = findViewById(R.id.serverip);

        Intent intent = new Intent(this, BroadCasterActivity_.class);
        intent.putExtra("roomId", this.roomId.getText().toString());
        intent.putExtra("serverIp", this.serverIp.getText().toString());
        startActivity(intent);
    }

    @Click(R.id.btViewer)
    protected void btViewerClick() {
        this.roomId = findViewById(R.id.roomid);
        this.serverIp = findViewById(R.id.serverip);

        Intent intent = new Intent(this, ViewerActivity_.class);
        intent.putExtra("roomId", this.roomId.getText().toString());
        intent.putExtra("serverIp", this.serverIp.getText().toString());
        startActivity(intent);
    }

    @Click(R.id.btOne2One)
    protected void btOne2OneClick() {
        this.roomId = findViewById(R.id.roomid);
        this.serverIp = findViewById(R.id.serverip);

        Intent intent = new Intent(this, One2OneActivity_.class);
        intent.putExtra("roomId", this.roomId.getText().toString());
        intent.putExtra("serverIp", this.serverIp.getText().toString());
        startActivity(intent);
    }

    @NonNull
    @Override
    public MainPresenter createPresenter() {
        return new MainPresenter(getApplication());
    }

}
