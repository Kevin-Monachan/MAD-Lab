package com.example.explicit;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
// SecondActivity is the destination of our explicit intent.
public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second); // Set the layout for this activity.
    }
}
