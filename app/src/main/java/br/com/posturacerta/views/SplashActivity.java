package br.com.posturacerta.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

import br.com.posturacerta.R;
import br.com.posturacerta.views.MainActivity;

public class SplashActivity extends AppCompatActivity  {

    private Timer timer = new Timer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        ImageView imageSplash = findViewById(R.id.imageSplash);

        imageSplash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jump();
            }
        });

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                 jump();
                finish();
            }
        }, 3000);
    }

    private void jump() {
        timer.cancel();
        Intent intent = new Intent(this, PesquisaActivity.class);
        startActivity(intent);
        finish();
    }

}
