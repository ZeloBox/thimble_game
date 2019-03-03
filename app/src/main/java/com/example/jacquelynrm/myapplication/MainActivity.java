package com.example.jacquelynrm.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 *
 * Наперстки
 * Три стакана под каждым из них прячется наперсток
 * Пользователь тыкает на стакан и под ним должен быть шарик. Угадал не угадал
 * Кружочек превращаеттся в шарик и появляется кнопка новая игра. setVisibility=INVISIBLE либо GONE
 * Крутим, видим шарики все в той же позиции и видим кнопку новая игра.
 * Если новую игру не начал, то любая смена экрана должна вращение должна оставлять шарики открытыми в том месте где он был.
 *
 */

public class MainActivity extends Activity {
private View thimble;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        thimble = findViewById(R.id.imageView1);


    }

}
