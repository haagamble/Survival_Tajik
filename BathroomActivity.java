package com.talktajiktoday.survivaltajik;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BathroomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        //13 words as of 24/06/2017
        words.add(new Word("bathroom", "ҳоҷатхона, ваннахона", "hojatkhona, vannakhona"));
        words.add(new Word("sink", "дастшӯяк", "dastshüyak"));
        words.add(new Word("bathtub", "ванна", "vanna"));
        words.add(new Word("washing machine", "мошини ҷомашӯӣ", "moshini jomashüi"));
        words.add(new Word("cold water", "оби хунук", "obi khunuk"));
        words.add(new Word("hot water", "оби гарм", "obi garm"));
        words.add(new Word("tap", "кран", "kran"));
        words.add(new Word("soap", "собун", "sobun"));
        words.add(new Word("shampoo", "шампун", "shampun"));
        words.add(new Word("towel", "сачок", "sachok"));
        words.add(new Word("toothpaste", "хамири дандон", "khamiri dandon"));
        words.add(new Word("razor", "ришгирак", "rishgirak"));
        words.add(new Word("mirror", "оина", "oina"));



        //for copying
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));



        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

    }
}


