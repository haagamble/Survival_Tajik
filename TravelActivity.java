package com.talktajiktoday.survivaltajik;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TravelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        //22 words as of 24/06/2017
        words.add(new Word("car", "мошин", "moshin"));
        words.add(new Word("plane", "самолёт", "samolyot"));
        words.add(new Word("train", "поезд", "poezd"));
        words.add(new Word("bus", "автобус", "avtobus"));
        words.add(new Word("trolley bus", "троллейбус", "trolleibus"));
        words.add(new Word("minibus", "маршрутка", "marshrutka"));
        words.add(new Word("taxi", "таксӣ", "taksi"));
        words.add(new Word("bicycle, bike", "велосипед, велик", "velosiped, velik"));
        words.add(new Word("ship", "киштӣ", "kishti"));
        words.add(new Word("road", "роҳ", "roh"));
        words.add(new Word("railroad", "роҳи оҳан", "rohi ohan"));
        words.add(new Word("bridge", "купрук, мост", "kupruk, most"));
        words.add(new Word("airport", "фурудгоҳ, аэропорт", "furudgoh, aeroport"));
        words.add(new Word("station", "истгоҳ", "istgoh"));
        words.add(new Word("trip, journey", "сафар, саёҳат", "safar, sayohat"));
        words.add(new Word("suitcase", "чамадон", "chamadon"));
        words.add(new Word("ticket", "билет", "bilet"));
        words.add(new Word("passport", "шиноснома", "shinosnoma"));
        words.add(new Word("visa", "виза", "viza"));
        words.add(new Word("map", "харита", "kharita"));
        words.add(new Word("hotel", "меҳмонхона", "mehmonkhona"));
        words.add(new Word("Have a good trip.", "Роҳи сафед!", "Rohi safed!"));




        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        //for copying
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));
    }
}
