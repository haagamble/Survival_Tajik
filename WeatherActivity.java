package com.talktajiktoday.survivaltajik;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        //22 words as of 24/06/2017

        words.add(new Word("cloud", "абр", "abr"));
        words.add(new Word("cloudy", "абрнок", "abrnok"));
        words.add(new Word("cold", "хунук", "khunuk"));
        words.add(new Word("coldness", "хункӣ", "khunki"));
        words.add(new Word("degree", "градус", "gradus"));
        words.add(new Word("earthquake", "заминҷунбӣ", "zaminjunbi"));
        words.add(new Word("flood", "обхезӣ", "obkhezi"));
        words.add(new Word("fog", "туман", "tuman"));
        words.add(new Word("hail", "жола", "zhola"));
        words.add(new Word("heat, warmth", "гармӣ", "garmi"));
        words.add(new Word("hot, warm", "гарм", "garm"));
        words.add(new Word("humid", "намнок", "namnok"));
        words.add(new Word("ice", "ях", "yakh"));
        words.add(new Word("lightning", "барқ", "barq"));
        words.add(new Word("rain", "борон", "boron"));
        words.add(new Word("snow", "барф", "barf"));
        words.add(new Word("storm", "тӯфон", "tüfon"));
        words.add(new Word("sun", "офтоб", "oftob"));
        words.add(new Word("temperature", "ҳарорат", "harorat"));
        words.add(new Word("thermometer", "ҳароратсанҷ", "haroratsanj"));
        words.add(new Word("thunder and lightning", "раъду барқ", "raъdu barq"));
        words.add(new Word("weather", "обу ҳаво", "obu havo"));
        words.add(new Word("wind", "шамол", "shamol"));
        words.add(new Word("It is hot.", "Ҳаво гарм аст.", "Havo garm ast."));
        words.add(new Word("It is cold.", "Ҳаво хунук аст.", "Havo khunuk ast."));
        words.add(new Word("It is raining", "Борон меборад.", "Boron meborad."));
        words.add(new Word("It is hailing", "Жола меборад.", "Zhola meborad."));
        words.add(new Word("It is snowing", "Барф меборад.", "Barf meborad."));




        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        //for copying
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));
    }
}
