package com.nxt.pushnotificationusingonesignal;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.onesignal.OSNotificationOpenResult;
import com.onesignal.OneSignal;

/**
 * Created by NXT on 03/11/2016.
 */

public class ReceiverNotificationActivity extends AppCompatActivity  implements OneSignal.NotificationOpenedHandler{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_receiver_notification);
    }

    @Override
    public void notificationOpened(OSNotificationOpenResult result) {
        Log.d("mo","mo notification");
    }
}
