package com.talktajiktoday.survivaltajik;

/**
 * Created by Heather on 24/06/2017.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColoursActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        //11 words as of 24/06/2017
        words.add(new Word("blue", "кабуд", "kabud", R.mipmap.blue));
        words.add(new Word("red", "сурх", "surkh", R.mipmap.red));
        words.add(new Word("yellow", "зард", "zard", R.mipmap.yellow));
        words.add(new Word("green", "сабз", "sabz", R.mipmap.green));
        words.add(new Word("black", "сиёҳ", "siyoh", R.mipmap.black));
        words.add(new Word("white", "сафед", "safed", R.mipmap.white_border));
        words.add(new Word("pink", "гулобӣ", "gulobi", R.mipmap.pink));
        words.add(new Word("purple", "бунафш", "bunafsh", R.mipmap.purple));
        words.add(new Word("orange", "норанҷӣ", "noranji", R.mipmap.orange));
        words.add(new Word("grey", "хокистарранг", "khokistarrang", R.mipmap.grey));
        words.add(new Word("brown", "каҳваранг", "kahvarang", R.mipmap.brown));


        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        //for copying
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));

    }
}

