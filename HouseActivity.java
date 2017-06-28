package com.talktajiktoday.survivaltajik;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HouseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        //32 words as of 24/06/2017
        words.add(new Word("attic", "чердак", "cherdak"));
        words.add(new Word("balcony", "балкон", "balkon"));
        words.add(new Word("bathroom", "хоҷатхона", "khojatkhona"));
        words.add(new Word("bedroom", "хобхона", "khobkhona"));
        words.add(new Word("broom", "ҷоруб", "jorüb"));
        words.add(new Word("carpet", "гилем, қолин", "gilem, qolin"));
        words.add(new Word("ceiling", "шифт", "shift"));
        words.add(new Word("curtain", "парда", "parda"));
        words.add(new Word("door", "дар", "dar"));
        words.add(new Word("entry way", "даромадгоҳ", "daromadgoh"));
        words.add(new Word("floor", "фарш", "farsh"));
        words.add(new Word("furniture", "мебел", "mebel"));
        words.add(new Word("garden", "боғ", "bogh"));
        words.add(new Word("gate", "дарвоза", "darvoza"));
        words.add(new Word("handle", "дастак", "dastak"));
        words.add(new Word("house", "хона", "khona"));
        words.add(new Word("key", "калид", "kalid"));
        words.add(new Word("kitchen", "ошхона", "oshkhona"));
        words.add(new Word("light", "чароғ", "charogh"));
        words.add(new Word("living room, guest room", "меҳмонхона", "mehmonkhona"));
        words.add(new Word("lock", "қулф", "qulf"));
        words.add(new Word("mirror, glass", "оина", "oina"));
        words.add(new Word("roof", "бом", "bom"));
        words.add(new Word("room", "хона", "khona"));
        words.add(new Word("socket, outlet", "разетка", "razetka"));
        words.add(new Word("stairs", "зинапоя", "zinapoya"));
        words.add(new Word("table", "стол, миз", "stol, miz"));
        words.add(new Word("veranda", "айвон", "aivon"));
        words.add(new Word("wall", "девор", "devor"));
        words.add(new Word("window", "тиреза", "tireza"));
        words.add(new Word("yard", "ҳавлӣ", "havli"));



        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        //for copying
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));
    }
}

