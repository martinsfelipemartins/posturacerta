package br.com.posturacerta.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import br.com.posturacerta.R;

public class WelcomeActivity extends AppCompatActivity {
    private ImageView imageDoctor;
    private TextView textBubble;
    private TextView textWelcome;
    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        initViews();
        goToPesquisa();
    }


    private void goToPesquisa() {
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPesquisa = new Intent(WelcomeActivity.this, PesquisaActivity.class);
                startActivity(intentPesquisa);

            }
        });
    }

    private void initViews() {
        imageDoctor = findViewById(R.id.imageDoctorWelcome);

        textWelcome = findViewById(R.id.textWelcome);
        btnNext = findViewById(R.id.btnNext);

    }
}
