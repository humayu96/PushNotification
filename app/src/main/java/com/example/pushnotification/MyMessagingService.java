package com.example.pushnotification;

import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;


//myapplication2

public class MyMessagingService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        showNotifcation(remoteMessage.getNotification().getTitle() , remoteMessage.getNotification().getBody());

    }

    public void showNotifcation(String title , String message){

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this,"SHEIKH NOTIFICATION")

                .setContentTitle(title).setSmallIcon(R.drawable.ic_launcher_background)
                .setAutoCancel(true).setContentText(message);

        NotificationManagerCompat managerCompat = NotificationManagerCompat.from(this);
        managerCompat.notify(999,builder.build());

    }
}
