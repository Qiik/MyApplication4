package net.qiik.project.myapplication4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView tvFirstName = (TextView) findViewById(R.id.textView);
        TextView tvLastName = (TextView) findViewById(R.id.textView2);
        TextView tvPhone = (TextView) findViewById(R.id.textView3);
        TextView tvAge = (TextView) findViewById(R.id.textView4);
        TextView tvSex = (TextView) findViewById(R.id.textView5);

        String firstName = "";
        String lastName = "";
        String phone = "";
        int age;
        String sex = "";

        Contact info = (Contact)getIntent().getParcelableExtra("Contact");

        firstName = info.getmFirstName;
        lastName = info.getmLastName;
        phone = info.getmPhone;
        age = info.getmAge;
        sex = info.getmSex;

        tvFirstName.setText("Имя: " + firstName);
        tvLastName.setText("Фамилия: " + lastName);
        tvPhone.setText("Номер телефона: " + phone);
        tvAge.setText("Возраст: " + age);
        tvSex.setText("Пол: " + sex);
    }
}
