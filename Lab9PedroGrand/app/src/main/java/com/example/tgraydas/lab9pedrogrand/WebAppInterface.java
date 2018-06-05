package com.example.tgraydas.lab9pedrogrand;

import android.content.Context;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class WebAppInterface {
    Context context;

    WebAppInterface(Context c){
        context = c;
    }

    @JavascriptInterface
    public void showToast(String toast){
        Toast.makeText(context, toast, Toast.LENGTH_SHORT).show();
    }

    public void onConsoleMessage(String log){
        Log.d("Lab8PedroGrand", log);
    }

    public void finishActivity(){
        ((MainActivity) context).finish();
    }
}
