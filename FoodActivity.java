package com.talktajiktoday.survivaltajik;

/**
 * Created by Heather on 24/06/2017.
 */
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        //31 words as of 24/06/2017
        words.add(new Word("beef", "гӯшти гов", "güshti gov"));
        words.add(new Word("bread", "нон", "non"));
        words.add(new Word("buckwheat", "гречка", "grechka"));
        words.add(new Word("butter", "маска", "maska"));
        words.add(new Word("cake", "торт", "tort"));
        words.add(new Word("cheese", "панир", "panir"));
        words.add(new Word("chicken", "гӯшти мурғ", "güshti murgh"));
        words.add(new Word("chocolate", "шоколад", "shokolad"));
        words.add(new Word("coffee", "қаҳва", "qahva"));
        words.add(new Word("cream", "қаймоқ", "qaimoq"));
        words.add(new Word("egg", "тухм", "tukhm"));
        words.add(new Word("fish", "моҳӣ", "mohi"));
        words.add(new Word("flour", "орд", "ord"));
        words.add(new Word("honey", "асал", "asal"));
        words.add(new Word("ice-cream", "яхмос", "yakhmos"));
        words.add(new Word("jam", "мураббо", "murabbo"));
        words.add(new Word("meat", "гӯшт", "güsht"));
        words.add(new Word("milk", "шир", "shir"));
        words.add(new Word("mutton", "гӯшти гӯсфанд", "güshti güsfand"));
        words.add(new Word("noodles", "угро", "ugro"));
        words.add(new Word("oil", "равған", "ravghan"));
        words.add(new Word("pasta", "макарон", "makaron"));
        words.add(new Word("pepper", "мурч", "murch"));
        words.add(new Word("rice", "биринҷ", "birinj"));
        words.add(new Word("salad", "салат", "salat"));
        words.add(new Word("salt", "намак", "namak"));
        words.add(new Word("soup", "шӯрбо", "shürbo"));
        words.add(new Word("sour cream", "сметана", "smetana"));
        words.add(new Word("sugar", "шакар", "shakar"));
        words.add(new Word("tea", "чой", "choi"));
        words.add(new Word("water", "об", "ob"));


        //for copying
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));


        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

    }
}

