package com.talktajiktoday.survivaltajik;

/**
 * Created by Heather on 24/06/2017.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        //25 words as of 24/06/2017
        words.add(new Word("mother", "модар, оча", "modar, ocha"));
        words.add(new Word("father", "падар, дада", "padar, dada"));
        words.add(new Word("daughter", "духтар", "dukhtar"));
        words.add(new Word("son", "писар", "pisar"));
        words.add(new Word("older sister", "апа", "apa"));
        words.add(new Word("younger sister", "хоҳар", "khohar"));
        words.add(new Word("older brother", "ака", "aka"));
        words.add(new Word("younger brother", "додар", "dodar"));
        words.add(new Word("wife", "зан", "zan"));
        words.add(new Word("husband", "шавҳар", "shavhar"));
        words.add(new Word("grandmother", "бибӣ", "bibi"));
        words.add(new Word("grandfather", "бобо", "bobo"));
        words.add(new Word("great grandmother", "бибикалон", "bibikalon"));
        words.add(new Word("great grandfather", "бобокалон", "bobokalon"));
        words.add(new Word("grandchild", "набера", "nabera"));
        words.add(new Word("great grandchild", "абера", "abera"));
        words.add(new Word("child", "кӯдак", "küdak"));
        words.add(new Word("children", "кӯдакон", "küdakon"));
        words.add(new Word("aunt (paternal side)", "амма", "amma"));
        words.add(new Word("aunt (maternal side)", "хола", "khola"));
        words.add(new Word("uncle (maternal side)", "тағо", "tagho"));
        words.add(new Word("uncle (paternal side)", "амак", "amak"));
        words.add(new Word("niece", "nephew, ҷиян", "nephew, jiyan"));
        words.add(new Word("daughter-in-law", "келин", "kelin"));
        words.add(new Word("son-in-law", "домод", "domod"));



        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        //for copying
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));
    }
}

