package com.talktajiktoday.survivaltajik;

/**
 * Created by Heather on 24/06/2017.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        //41 words as of 24/06/2017
        words.add(new Word("zero", "сифр", "sifr"));
        words.add(new Word("one", "як", "yak"));
        words.add(new Word("two", "ду", "du"));
        words.add(new Word("three", "се", "se"));
        words.add(new Word("four", "чор", "chor"));
        words.add(new Word("five", "панҷ", "panj"));
        words.add(new Word("six", "шаш", "shash"));
        words.add(new Word("seven", "ҳафт", "haft"));
        words.add(new Word("eight", "ҳашт", "hasht"));
        words.add(new Word("nine", "нӯҳ", "nüh"));
        words.add(new Word("ten", "даҳ", "dah"));
        words.add(new Word("eleven", "ёздаҳ", "yozdah"));
        words.add(new Word("twelve", "дувоздаҳ", "duvozdah"));
        words.add(new Word("thirteen", "сенздаҳ", "senzdah"));
        words.add(new Word("fourteen", "чордаҳ", "chordah"));
        words.add(new Word("fifteen", "понздаҳ", "ponzdah"));
        words.add(new Word("sixteen", "шонздаҳ", "shonzdah"));
        words.add(new Word("seventeen", "ҳабдаҳ", "habdah"));
        words.add(new Word("eighteen", "ҳаждаҳ", "hazhdah"));
        words.add(new Word("nineteen", "нуздаҳ", "nuzdah"));
        words.add(new Word("twenty", "бист", "bist"));
        words.add(new Word("twenty-one", "бисту як", "bistu yak"));
        words.add(new Word("twenty-two", "бисту ду", "bistu du"));
        words.add(new Word("thirty", "сӣ", "si"));
        words.add(new Word("thirty-four", "сию чор", "siyu chor"));
        words.add(new Word("forty", "чил", "chil"));
        words.add(new Word("forty-seven", "чилу ҳафт", "chilu haft"));
        words.add(new Word("fifty", "панҷоҳ", "panjoh"));
        words.add(new Word("fifty-eight", "панҷоҳу ҳашт", "panjohu hasht"));
        words.add(new Word("sixty", "шаст", "shast"));
        words.add(new Word("seventy", "ҳафтод", "haftod"));
        words.add(new Word("eighty", "ҳаштод", "hashtod"));
        words.add(new Word("ninety", "навад", "navad"));
        words.add(new Word("one hundred", "сад", "sad"));
        words.add(new Word("one hundred forty", "саду чил", "sadu chil"));
        words.add(new Word("two hundred", "дусад", "dusad"));
        words.add(new Word("two hundred and five", "дусаду панҷ", "dusadu panj"));
        words.add(new Word("one thousand", "ҳазор", "hazor"));
        words.add(new Word("two thousand", "ду ҳазор", "du hazor"));
        words.add(new Word("million", "миллион", "million"));
        words.add(new Word("billion", "миллиярд", "milliard"));



        //for copying
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));

        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}