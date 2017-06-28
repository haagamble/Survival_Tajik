package com.talktajiktoday.survivaltajik;

/**
 * Created by Heather on 24/06/2017.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ClothesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        //27 words as of 24/06/2017
        words.add(new Word("belt", "тасма", "tasma"));
        words.add(new Word("blouse", "блузка", "bluzka"));
        words.add(new Word("boots (long)", "мӯза", "müza"));
        words.add(new Word("boots (ankle)", "патинка", "patinka"));
        words.add(new Word("cap", "кепка", "kepka"));
        words.add(new Word("clothes", "либос", "libos"));
        words.add(new Word("coat", "палто", "palto"));
        words.add(new Word("dress", "курта", "kurta"));
        words.add(new Word("gloves", "дастпӯшак", "dastpüshak"));
        words.add(new Word("hat", "кулоҳ", "kuloh"));
        words.add(new Word("hat", "телпак", "telpak"));
        words.add(new Word("jacket", "куртка", "kurtka"));
        words.add(new Word("jacket (suit jacket)", "пиҷак", "pijak"));
        words.add(new Word("skirt", "пойафзол", "poiafzol"));
        words.add(new Word("socks", "пайпок, ҷуроб", "paipok, jurob"));
        words.add(new Word("robe, gown", "халат", "khalat"));
        words.add(new Word("scarf", "рӯймол", "rüimol"));
        words.add(new Word("shirt (men)", "курта", "kurta"));
        words.add(new Word("shorts", "шортик", "shortik"));
        words.add(new Word("skirt", "юбка", "юbka"));
        words.add(new Word("suit", "костюм", "kostюm"));
        words.add(new Word("sweater", "свитер", "sviter"));
        words.add(new Word("T-shirt", "футболка", "futbolka"));
        words.add(new Word("tie", "галстук", "galstuk"));
        words.add(new Word("trousers", "шим", "shim"));
        words.add(new Word("undershirt", "майка", "maika"));
        words.add(new Word("vest", "камзӯл", "kamzül"));


        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        //for copying
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));
    }
}

