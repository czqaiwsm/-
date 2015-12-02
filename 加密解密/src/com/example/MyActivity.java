package com.example;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.example.secret.AES;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        String str = "helloworld 您好！";
        try {
            String emp = Base64.encode(str.toString().getBytes("UTF-8"));
            Log.i("dddd","------------>:" + emp);
            Log.i("dddd", "------------>:" + new String(Base64.decode(emp), "UTF-8"));
            str = Base64.encode(AES.encrypt(str.toString().getBytes("UTF-8"), AES.SECRET_KEY.getBytes("UTF-8")));
            Log.i("dddd", "------------>:" + str);
            Log.i("dddd", "------------>:" + new String(AES.decrypt(Base64.decode(str), AES.SECRET_KEY.getBytes("UTF-8")), "UTF-8"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
