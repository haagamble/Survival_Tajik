package com.talktajiktoday.survivaltajik;

/**
 * Created by Heather on 24/06/2017.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MeetingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        //16 phrases; 26 words as of 24/06/2017
        words.add(new Word("Hello.", "Ассалом.", "assalom."));
        words.add(new Word("Hello.", "Ассалому алайкум.", "Assalomu alaikum."));
        words.add(new Word("How are you?", "Шумо чӣ хел?", "Shumo chi khel?"));
        words.add(new Word("I'm good. Thanks.", "Ман нағз. Раҳмат.", "Man naghz. Rahmat."));
        words.add(new Word("How is your work?", "Коратон чӣ хел?", "Koraton chi khel?"));
        words.add(new Word("Fine. OK.", "Мешавад.", "Meshavad."));
        words.add(new Word("What is your name?", "Номатон чӣ?", "Nomaton chi?"));
        words.add(new Word("My name is Dilshod.", "Номи ман Дилшод.", "Nomi man Dilshod."));
        words.add(new Word("Where are you from?", "Шумо аз куҷо (ҳастед)?", "Shumo az kujo (hasted)?"));
        words.add(new Word("I'm from England.", "Ман аз Англия (ҳастам).", "Man az Angliya (hastam)."));
        words.add(new Word("How old are you?", "Шумо чанд сола (ҳастед)?", "Shumo chand sola (hasted)?"));
        words.add(new Word("I am twenty-nine.", "Ман бисту нуҳ (сола ҳастам).", "Man bistu nuh (sola hastam)."));
        words.add(new Word("Where do you work?", "Шумо дар куҷо кор мекунед?", "Shumo dar kujo kor mekuned?"));
        words.add(new Word("I work at the library.", "Ман дар китобхона кор мекунам.", "Man dar kitobkhona kor mekunam."));
        words.add(new Word("Goodbye.", "Хайр.", "Khair."));
        words.add(new Word("Until we meet again.", "То дидан.", "To didan."));


        //words.add(new Word("", ""));
        //words.add(new Word("", ""));

        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        //for copying
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));
    }
}

