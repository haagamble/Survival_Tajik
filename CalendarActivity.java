package com.talktajiktoday.survivaltajik;

/**
 * Created by Heather on 24/06/2017.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CalendarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        //22 words as of 24/06/2017
        words.add(new Word("second", "сония", "soniya"));
        words.add(new Word("minute", "дақиқа", "daqiqa"));
        words.add(new Word("hour", "соат", "soat"));
        words.add(new Word("day", "рӯз", "rüz"));
        words.add(new Word("today", "имрӯз", "imrüz"));
        words.add(new Word("tomorrow", "пагоҳ, фардо", "pagoh, fardo"));
        words.add(new Word("yesterday", "дирӯз, дина", "dirüz, dina"));
        words.add(new Word("morning", "пагоҳӣ", "pagohi"));
        words.add(new Word("night", "шаб", "shab"));
        words.add(new Word("week", "ҳафта", "hafta"));
        words.add(new Word("next week", "ҳафтаи ояанда", "haftai oyaanda"));
        words.add(new Word("last week", "ҳафтаи гӯзашта", "haftai güzashta"));
        words.add(new Word("month", "моҳ", "moh"));
        words.add(new Word("year", "сол", "sol"));
        words.add(new Word("next year", "соли ояанда", "soli oyaanda"));
        words.add(new Word("last year", "порсол, соли гӯзашта", "porsol, soli güzashta"));
        words.add(new Word("season", "фасл", "fasl"));
        words.add(new Word("spring", "баҳор", "bahor"));
        words.add(new Word("summer", "тобистон", "tobiston"));
        words.add(new Word("autumn, fall", "тирамоҳ", "tiramoh"));
        words.add(new Word("winter", "зимистон", "zimiston"));
        words.add(new Word("century", "аср", "asr"));



        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        //for copying
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));
    }
}

