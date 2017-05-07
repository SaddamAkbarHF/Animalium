package iak.saddamakbar.animalium;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FrontActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);


        Button BtnMasuk = (Button) findViewById(R.id.btnMasuk);
        BtnMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent masuk = new Intent(FrontActivity.this, MainActivity.class);
                startActivity(masuk);
            }
        });

    }
}
