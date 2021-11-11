package com.dharmik953.toasty;

import android.content.Context;
import android.widget.Toast;

public class toasty {
    public static void Short(Context context,String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public static void Long(Context context,String message){
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
