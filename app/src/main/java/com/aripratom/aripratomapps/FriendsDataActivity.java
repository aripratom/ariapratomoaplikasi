package com.aripratom.aripratomapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

//19 Mei 2019
public class FriendsDataActivity extends AppCompatActivity {
    public static final String EXTRA_NIM ="extra_nim";
    public static final String EXTRA_NAME ="extra_name";
    public static final String EXTRA_KELAS ="extra_kelas";
    public static final String EXTRA_TELP ="extra_telp";
    public static final String EXTRA_EMAIL ="extra_email";
    public static final String EXTRA_SOSMED ="extra_sosmed";

    TextView tvDataReceived;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends_data);

        tvDataReceived = findViewById(R.id.tv_data_received);

        String nim = getIntent().getStringExtra(EXTRA_NIM);
        String name = getIntent().getStringExtra(EXTRA_NAME);
        String kelas = getIntent().getStringExtra(EXTRA_KELAS);
        String telp = getIntent().getStringExtra(EXTRA_TELP);
        String email = getIntent().getStringExtra(EXTRA_EMAIL);
        String sosmed = getIntent().getStringExtra(EXTRA_SOSMED);

        String text = "Nim :"+ nim
                +"\nNama : "+ name
                +"\nKelas : "+ kelas
                +"\nTelepon : "+ telp
                +"\nEmail : " + email
                +"\nSosial Media : " + sosmed;
        tvDataReceived.setText(text);
    }
}
