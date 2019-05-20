package com.tf.goastlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToastUtils {

    public static void toast(Context mContext) {
        Toast.makeText(mContext, "依赖成功", Toast.LENGTH_LONG).show();
    }

}
