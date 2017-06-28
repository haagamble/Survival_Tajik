package com.talktajiktoday.survivaltajik;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class LanguageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        //15 words as of 27/06/2017
        words.add(new Word("noun", "исм", "ism"));
        words.add(new Word("verb", "фел", "fel"));
        words.add(new Word("adjective", "сифат", "sifat"));
        words.add(new Word("sentence", "ҷумла", "jumla"));
        words.add(new Word("phrase", "ибора", "ibora"));
        words.add(new Word("language", "забон", "zabon"));
        words.add(new Word("present tense", "замони ҳозира", "zamoni hozira"));
        words.add(new Word("past tense", "замони гузашта", "zamoni guzashta"));
        words.add(new Word("future tense", "замони оянда", "zamoni oyanda"));
        words.add(new Word("pencil", "қалам", "qalam"));
        words.add(new Word("pen", "ручка", "ruchka"));
        words.add(new Word("notebook", "дафтар", "daftar"));
        words.add(new Word("book", "китоб", "kitob"));
        words.add(new Word("dictionary", "луғат", "lughat"));
        words.add(new Word("teacher (male, female)", "муаллим, муаллима", "muallim, muallima"));



        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        //for copying
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));
    }
}
