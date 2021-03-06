package com.wangjie.rapidrouter.example.activity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.wangjie.rapidrouter.api.annotations.RRParam;
import com.wangjie.rapidrouter.api.annotations.RRUri;

/**
 * Author: wangjie Email: tiantian.china.2@gmail.com Date: 2/8/17.
 */
@RRUri(uri = "rr://rapidrouter.b", params = {
        @RRParam(name = "id", type = long.class)
})
public class BActivity extends BaseActivity {
    private static final String TAG = BActivity.class.getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setBackgroundDrawable(new ColorDrawable(0xffbbccaa));
        Intent intent = getIntent();
        Log.i(TAG, "intent: " + intent.getLongExtra("id", -1L));
    }
}
