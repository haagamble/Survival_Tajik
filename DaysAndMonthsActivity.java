package com.talktajiktoday.survivaltajik;

/**
 * Created by Heather on 24/06/2017.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class DaysAndMonthsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        //19 words as of 24/06/2017
        words.add(new Word("Monday", "душанбе", "dushanbe"));
        words.add(new Word("Tuesday", "сешанбе", "seshanbe"));
        words.add(new Word("Wednesday", "чоршанбе", "chorshanbe"));
        words.add(new Word("Thursday", "панҷшанбе", "panjshanbe"));
        words.add(new Word("Friday", "ҷумъа", "jumъa"));
        words.add(new Word("Saturday", "шанбе", "shanbe"));
        words.add(new Word("Sunday", "якшанбе", "yakshanbe"));
        words.add(new Word("January", "январ", "yanvar"));
        words.add(new Word("February", "феврал", "fevral"));
        words.add(new Word("March", "март", "mart"));
        words.add(new Word("April", "апрел", "aprel"));
        words.add(new Word("May", "май", "mai"));
        words.add(new Word("June", "июн", "iyun"));
        words.add(new Word("July", "июл", "iyul"));
        words.add(new Word("August", "август", "avgust"));
        words.add(new Word("September", "сентябр", "sentyabr"));
        words.add(new Word("October", "октябр", "oktyabr"));
        words.add(new Word("November", "ноябр", "noyabr"));
        words.add(new Word("December", "декабр", "dekabr"));


        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        //for copying
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));
    }
}

