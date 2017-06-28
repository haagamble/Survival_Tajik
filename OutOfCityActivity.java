package com.talktajiktoday.survivaltajik;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class OutOfCityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        //18 words as of 24/06/2017

        words.add(new Word("bridge", "купрук, мост", "kupruk, most"));
        words.add(new Word("dam", "сарбанд", "sarband"));
        words.add(new Word("forest", "ҷангал", "jangal"));
        words.add(new Word("fortress", "ҳисор", "hisor"));
        words.add(new Word("hill", "теппа", "teppa"));
        words.add(new Word("lake", "кул", "kul"));
        words.add(new Word("mine", "кон", "kon"));
        words.add(new Word("mountain", "кӯҳ", "küh"));
        words.add(new Word("nature", "табиат", "tabiat"));
        words.add(new Word("region", "минтака", "mintaka"));
        words.add(new Word("river", "дарё", "daryo"));
        words.add(new Word("scenery", "манзара", "manzara"));
        words.add(new Word("spring", "чашма", "chashma"));
        words.add(new Word("stream", "ҷӯй", "jüi"));
        words.add(new Word("summer house", "дача", "dacha"));
        words.add(new Word("tree", "дарахт", "darakht"));
        words.add(new Word("village", "қишлоқ, деҳа", "qishloq, deha"));
        words.add(new Word("waterfall", "шаршара", "sharshara"));
        words.add(new Word("valley", "дара", "dara"));


        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        //for copying
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));
    }
}
