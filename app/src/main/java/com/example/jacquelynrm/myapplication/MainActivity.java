package com.example.jacquelynrm.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * Наперстки
 * Три стакана под каждым из них прячется наперсток
 * Пользователь тыкает на стакан и под ним должен быть шарик. Угадал не угадал
 * Кружочек превращаеттся в шарик и появляется кнопка новая игра. setVisibility=INVISIBLE либо GONE
 * Крутим, видим шарики все в той же позиции и видим кнопку новая игра.
 * Если новую игру не начал, то любая смена экрана должна вращение должна оставлять шарики открытыми в том месте где он был.
 */

public class MainActivity extends Activity {
    private View thimble1;
    private View thimble2;
    private View thimble3;
    private View ball;
    private View button;

    public static final String VIEWSTATE = "statevisiblity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        thimble1 = findViewById(R.id.imageView1);
        thimble2 = findViewById(R.id.imageView2);
        thimble3 = findViewById(R.id.imageView3);
        ball = findViewById(R.id.imageViewBall);
        button = findViewById(R.id.button);
        button.setVisibility(View.INVISIBLE);
        }

    @Override
    protected void onStart() {
        super.onStart();
        thimble1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                thimble1.setVisibility(View.INVISIBLE);
                thimble2.setVisibility(View.INVISIBLE);
                thimble3.setVisibility(View.INVISIBLE);
                button.setVisibility(View.VISIBLE);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                thimble1.setVisibility(View.VISIBLE);
                thimble2.setVisibility(View.VISIBLE);
                thimble3.setVisibility(View.VISIBLE);
                button.setVisibility(View.INVISIBLE);
            }
        });
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        savedInstanceState.getInt(VIEWSTATE);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(VIEWSTATE, thimble1.getVisibility());
    }
}
