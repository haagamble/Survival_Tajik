package com.talktajiktoday.survivaltajik;

/**
 * Created by Heather on 24/06/2017.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BodyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        //44 words as of 24/06/2017
        words.add(new Word("back", "пушт", "pusht"));
        words.add(new Word("belly button", "ноф", "nof"));
        words.add(new Word("blood", "хун", "khun"));
        words.add(new Word("body", "бадан", "badan"));
        words.add(new Word("bone", "устухон", "ustukhon"));
        words.add(new Word("cheek", "рухсор", "rukhsor"));
        words.add(new Word("chest", "сина", "sina"));
        words.add(new Word("chin", "манаҳ", "manah"));
        words.add(new Word("ear", "гӯш", "güsh"));
        words.add(new Word("elbow", "оринҷ", "orinj"));
        words.add(new Word("eye", "чашм", "chashm"));
        words.add(new Word("eyebrow", "абрӯ, қош", "abrü, qosh"));
        words.add(new Word("eyelash", "мижа", "mizha"));
        words.add(new Word("face", "рӯӣ", "rüi"));
        words.add(new Word("finger", "ангушт", "angusht"));
        words.add(new Word("fist", "мушт", "musht"));
        words.add(new Word("foot", "пой", "poi"));
        words.add(new Word("forehead", "пешона", "peshona"));
        words.add(new Word("hair", "мӯй", "müi"));
        words.add(new Word("hand", "даст", "dast"));
        words.add(new Word("head", "сар", "sar"));
        words.add(new Word("heart", "дил", "dil"));
        words.add(new Word("heel", "пошна", "poshna"));
        words.add(new Word("jaw", "ҷоғ", "jogh"));
        words.add(new Word("kidney", "гурда", "gurda"));
        words.add(new Word("knee", "зону", "zonu"));
        words.add(new Word("leg", "по", "po"));
        words.add(new Word("lip", "лаб", "lab"));
        words.add(new Word("liver", "ҷигар", "jigar"));
        words.add(new Word("lung", "шуш", "shush"));
        words.add(new Word("mouth", "даҳон", "dahon"));
        words.add(new Word("muscle", "мушак", "mushak"));
        words.add(new Word("nail", "нохун", "nokhun"));
        words.add(new Word("neck", "гардан", "gardan"));
        words.add(new Word("nerve", "асаб", "asab"));
        words.add(new Word("nose", "бинӣ", "bini"));
        words.add(new Word("palm", "каф", "kaf"));
        words.add(new Word("shoulder", "китф", "kitf"));
        words.add(new Word("skin", "пӯст", "püst"));
        words.add(new Word("spine", "сутунмӯҳра", "sutunmühra"));
        words.add(new Word("stomach, tummy", "шикам", "shikam"));
        words.add(new Word("throat", "гулӯ", "gulü"));
        words.add(new Word("tongue", "забон", "zabon"));
        words.add(new Word("tooth", "дандон", "dandon"));



        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        //for copying
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));
    }
}

