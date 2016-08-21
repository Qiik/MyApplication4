package net.qiik.project.myapplication4;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        intent.putExtra("Contact", new Contact("Иван", "Зоркин", "+375291182249",23, "муж"));
        startActivity(intent);
    }

}
