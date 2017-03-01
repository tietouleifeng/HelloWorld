package com.example.bdtest;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by WeiZ2 on 2017/2/13.
 */

public class BootCompleteReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Boot Complete", Toast.LENGTH_LONG).show();
    }
}
