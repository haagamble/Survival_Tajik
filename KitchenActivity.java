package com.talktajiktoday.survivaltajik;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class KitchenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        //23 words as of 24/06/2017
        words.add(new Word("bowl", "коса", "kosa"));
        words.add(new Word("cup (Tajik kind)", "пиёла", "piyola"));
        words.add(new Word("fork", "вилка", "vilka"));
        words.add(new Word("frying pan", "скаворотка", "skavorotka"));
        words.add(new Word("glass", "стакан", "stakan"));
        words.add(new Word("jar", "банка", "banka"));
        words.add(new Word("knife", "корд", "kord"));
        words.add(new Word("ladle", "кафлез", "kaflez"));
        words.add(new Word("match", "гугирд", "gugird"));
        words.add(new Word("mug", "бакал", "bakal"));
        words.add(new Word("napkin", "салфедка", "salfedka"));
        words.add(new Word("pan", "каструл", "kastrul"));
        words.add(new Word("pan (large Tajik one)", "дег", "deg"));
        words.add(new Word("plate", "табақ", "tabaq"));
        words.add(new Word("refrigerator", "яхдон", "yakhdon"));
        words.add(new Word("salt shaker", "намакдон", "namakdon"));
        words.add(new Word("spoon", "қошуқ", "qoshuq"));
        words.add(new Word("stove", "газ, духовка", "gaz, dukhovka"));
        words.add(new Word("sugar bowl", "шакардон", "shakardon"));
        words.add(new Word("teapot", "чойник", "choinik"));
        words.add(new Word("teaspoon", "қошуқча, қошуқи майда", "qoshuqcha, qoshuqi maida"));
        words.add(new Word("towel", "сачок", "sachok"));
        words.add(new Word("tray", "лаълӣ", "laъli"));



        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        //for copying
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));
    }
}

