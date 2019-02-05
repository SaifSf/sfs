package com.example.sfslibrary;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.widget.Toast;

import com.securepreferences.SecurePreferences;

public class MessageToast  {


    private static String passwords = "password";

    public static void MessageShow(Context context, String s) {

        Toast.makeText(context, s, Toast.LENGTH_SHORT).show();
    }

    public static void addPassword(Context context, String password) {
        SharedPreferences preferences = (SharedPreferences) new SecurePreferences(context, passwords, "my_user_prefs.xml").edit();
        SharedPreferences.Editor editor =preferences.edit();
        editor.putString(passwords, password);
        editor.apply();
        editor.commit();

        String my_value= preferences.getString(passwords,null);


        Log.i("waaaaaa library ", "addPassword: " +my_value);

    }






}
