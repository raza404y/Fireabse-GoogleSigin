package com.example.googlesignin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity2 extends AppCompatActivity {

    FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        auth = FirebaseAuth.getInstance();

        TextView textView = findViewById(R.id.textView);
        Button logout = findViewById(R.id.button);


        logout.setOnClickListener(view -> {

            auth.signOut();
            startActivity(new Intent(getApplicationContext(),MainActivity.class));

        });

        textView.setText("Google Account name is : \n"+auth.getCurrentUser().getDisplayName());

    }
}