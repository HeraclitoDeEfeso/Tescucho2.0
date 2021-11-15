package appinventor.ai_andres_piegari.TeEscuchoDCH6j;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTheme(R.style.TemaInicio);
        setContentView(R.layout.inicio);

        Timer timer = new Timer();
        timer.schedule(new TimerTask(){
            @Override
            public void run(){
                finish();
                Intent intent =  new Intent(Inicio.this, KaldiActivity.class);
                startActivity(intent);


            }

        },5000);

        // Agregar contador de inicios https://stackoverflow.com/a/25032996
        SharedPreferences prefs = getSharedPreferences("GLOBAL_PREFERENCES", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        int init_counter = prefs.getInt("init_counter", 0);
        init_counter++;
        editor.putInt("init_counter", init_counter);
        editor.putBoolean("tooltip_shown_sequence_mode", false);
        editor.putBoolean("tooltip_shown_continuous_mode", false);
        editor.apply();
    }

}