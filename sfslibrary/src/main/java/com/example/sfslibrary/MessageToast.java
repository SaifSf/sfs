package com.example.sfslibrary;

import android.content.Context;
import android.widget.Toast;

public class MessageToast {


    public static void MessageShow(Context context , String s) {

        Toast.makeText(context,s , Toast.LENGTH_SHORT).show();
    }
}
