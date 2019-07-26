package br.com.posturacerta.views;

import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

import br.com.posturacerta.R;


public class PesquisaActivity extends AppCompatActivity {
    private ImageView imageDoctor;
    private TextView textBubble;
    private TextView textWakeUpHour;
    private TextView textSleepHour;
    private Button btnWakeUp;
    private Button btnSleep;
    private Button btnComecar;
    int currentHour;
    int currentMinute;
    Calendar calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesquisa);


        initViews();
        abrirHorarioWakeUp();
        abrirHorarioSleep();
        goToPrincipal();

    }

    private void abrirHorarioWakeUp() {
        btnWakeUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(PesquisaActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {

                        calendar = Calendar.getInstance();
                        currentHour = calendar.get(Calendar.HOUR_OF_DAY);
                        currentMinute = calendar.get(Calendar.MINUTE);


                        textWakeUpHour.setText(hourOfDay + ":" + minutes);
                        String amPm;
                        if (hourOfDay >= 12) {
                            amPm = "PM";
                        } else {
                            amPm = "AM";
                        }
                        textWakeUpHour.setText(String.format("%02d:%02d", hourOfDay, minutes) + amPm);

                    }
                }, 0, 0, false);
                timePickerDialog.show();
            }
        });
    }

    private void abrirHorarioSleep() {
        btnSleep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(PesquisaActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {

                        calendar = Calendar.getInstance();
                        currentHour = calendar.get(Calendar.HOUR_OF_DAY);
                        currentMinute = calendar.get(Calendar.MINUTE);


                        textSleepHour.setText(hourOfDay + ":" + minutes);
                        String amPm;
                        if (hourOfDay >= 12) {
                            amPm = "PM";
                        } else {
                            amPm = "AM";
                        }
                        textSleepHour.setText(String.format("%02d:%02d", hourOfDay, minutes) + amPm);

                    }
                }, 0, 0, false);
                timePickerDialog.show();
            }
        });
    }

    private void goToPrincipal() {
        btnComecar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPrincipal = new Intent(PesquisaActivity.this,MainActivity.class);
                startActivity(intentPrincipal);
                finish();
            }
        });

    }

    private void initViews() {
        imageDoctor = findViewById(R.id.imageDoctorPesquisa);
        btnWakeUp = findViewById(R.id.btnWakeUpHour);
        btnSleep = findViewById(R.id.btnSleepHour);
        textWakeUpHour = findViewById(R.id.textWakeUpHour);
        textSleepHour = findViewById(R.id.textSleepHour);
        textBubble = findViewById(R.id.textBubblePesquisa);
        btnComecar = findViewById(R.id.btnComecar);

    }

}
