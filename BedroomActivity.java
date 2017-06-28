package com.talktajiktoday.survivaltajik;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BedroomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        //8 words as of 27/06/2017
        words.add(new Word("bed", "кат", "kat"));
        words.add(new Word("bedroom", "хобхона", "hobhona"));
        words.add(new Word("blanket", "кӯрпа", "kürpa"));
        words.add(new Word("curtain", "парда", "parda"));
        words.add(new Word("dresser", "ҷевон", "jevon"));
        words.add(new Word("mirror, glass", "оина", "oina"));
        words.add(new Word("pillow", "болиш", "bolish"));
        words.add(new Word("sheet", "ҷойпӯш", "joipüsh"));



        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        //for copying
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));
    }
}
