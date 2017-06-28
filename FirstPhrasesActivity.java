package com.talktajiktoday.survivaltajik;

/**
 * Created by Heather on 24/06/2017.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FirstPhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        //13 phrases; 18 words as of 24/06/2017
        words.add(new Word("Thank you.", "Раҳмат.", "Rahmat."));
        words.add(new Word("Thank you very much.", "Раҳмати калон.", "Rahmati kalon."));
        words.add(new Word("Excuse me.", "Мебахшед.", "Mebakhshed."));
        words.add(new Word("It's OK.", "Ҳеҷ гап не.", "Hej gap ne."));
        words.add(new Word("please", "илтимос", "Iltimos"));
        words.add(new Word("Of course.", "Албатта.", "Albatta."));
        words.add(new Word("no", "не", "ne"));
        words.add(new Word("yes", "ҳа", "ha"));
        words.add(new Word("Welcome.", "Хуш омадед.", "Khush omaded."));
        words.add(new Word("Come in.", "Дароед.", "Daroed."));
        words.add(new Word("Don't forget!", "Фаромуш накунед.", "Faromush nakuned."));
        words.add(new Word("That's enough!", "Бас!", "Bas!"));
        words.add(new Word("I agree.", "Ман розӣ.", "Man rozi."));







        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        //for copying
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));
    }
}

