package com.example.projectnaturetrips;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activityNotification extends AppCompatActivity {

    TextView textNotification;
    String Not;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        textNotification = findViewById(R.id.textNotification);

    }


    public void viewNotification(View view) {

        Not= textNotification.getText().toString();

        /*NotificationCompat.Builder builder = new NotificationCompat.Builder(this, CHANNEL_ID);
        .setSmallIcon(R.drawable.notification_icon)
        .setContentTitle("notification")
        .setContentText(textNotification)
        .setPriority(NotificationCompat.PRIORITY_DEFAULT);

         */

    }
}