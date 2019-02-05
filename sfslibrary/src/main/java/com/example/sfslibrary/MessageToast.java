package com.example.sfslibrary;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import android.widget.Toast;

import com.securepreferences.SecurePreferences;

public class MessageToast  {


    private static String passwords = "password";

    public static void MessageShow(Context context, String s) {

        Toast.makeText(context, s, Toast.LENGTH_SHORT).show();
    }

    public static void addPassword(Context context, String password) {
        SharedPreferences.Editor editor = new SecurePreferences(context, passwords, "my_user_prefs.xml").edit();

        editor.putString(passwords, password);
        editor.apply();
        Log.i("waaaaaa library ", "addPassword: " +password);

    }






}
