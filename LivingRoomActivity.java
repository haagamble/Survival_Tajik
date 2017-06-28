package com.talktajiktoday.survivaltajik;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class LivingRoomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        //12 words as of 24/06/2017
        words.add(new Word("living room, guest room", "меҳмонхона", "mehmonkhona"));
        words.add(new Word("couch, sofa", "диван", "divan"));
        words.add(new Word("arm chair", "курсӣ", "kursi"));
        words.add(new Word("table", "миз", "miz"));
        words.add(new Word("bookshelf", "китобмонак", "kitobmonak"));
        words.add(new Word("telephone", "телефон", "telefon"));
        words.add(new Word("television", "телевизор", "televizor"));
        words.add(new Word("radio", "радио", "radio"));
        words.add(new Word("sitting mat", "корпача", "korpacha"));
        words.add(new Word("tablecloth", "дастархон", "dastarkhon"));
        words.add(new Word("carpet", "гилем", "gilem"));
        words.add(new Word("window", "тиреза", "tireza"));
        words.add(new Word("curtain", "парда", "parda"));





        //for copying
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));



        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

    }
}


