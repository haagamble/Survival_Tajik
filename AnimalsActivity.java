package com.talktajiktoday.survivaltajik;

/**
 * Created by Heather on 24/06/2017.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AnimalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        //50 words as of 24/06/2017
        words.add(new Word("animal", "ҳайвон", "haivon"));
        words.add(new Word("ant", "мӯрча", "mürcha"));
        words.add(new Word("bat", "куршапарак", "kurshaparak"));
        words.add(new Word("bear", "хирс", "khirs"));
        words.add(new Word("bee", "замбӯри асал", "zambüri asal"));
        words.add(new Word("bird", "паранда", "paranda"));
        words.add(new Word("camel", "шутур", "shutur"));
        words.add(new Word("cat", "пишак, гурба", "pishak, gurba"));
        words.add(new Word("chicken, hen", "мурғ", "murgh"));
        words.add(new Word("cow", "гов", "gov"));
        words.add(new Word("deer", "гавазн, оҳу", "gavazn, ohu"));
        words.add(new Word("duck", "мурғобӣ", "murghobi"));
        words.add(new Word("dog", "саг", "sag"));
        words.add(new Word("dolphin", "делфин", "delfin"));
        words.add(new Word("donkey", "хар", "khar"));
        words.add(new Word("eagle", "уқоб", "uqob"));
        words.add(new Word("elephant", "фил", "fil"));
        words.add(new Word("fish", "моҳӣ", "mohi"));
        words.add(new Word("flea", "кайк", "kaik"));
        words.add(new Word("fly", "пашша", "pasha"));
        words.add(new Word("fox", "рӯбоҳ", "rüboh"));
        words.add(new Word("frog", "қурбоққа", "qurboqqa"));
        words.add(new Word("goat", "буз", "buz"));
        words.add(new Word("goose", "ғоз", "ghoz"));
        words.add(new Word("horse", "асп", "asp"));
        words.add(new Word("lion", "шер", "sher"));
        words.add(new Word("lizard", "калтакалос", "kaltakalos"));
        words.add(new Word("monkey", "маймун", "maimun"));
        words.add(new Word("mouse", "муш", "mush"));
        words.add(new Word("nightingale", "булбул", "bulbul"));
        words.add(new Word("owl", "бум", "bum"));
        words.add(new Word("parrot", "тӯтӣ", "tüti"));
        words.add(new Word("partridge", "кабк", "kabk"));
        words.add(new Word("peacock", "товус", "tovus"));
        words.add(new Word("pig", "хуқ", "khuq"));
        words.add(new Word("pigeon", "кафтар", "kaftar"));
        words.add(new Word("rabbit", "харгӯш", "khargüsh"));
        words.add(new Word("rat", "калламуш", "kallamush"));
        words.add(new Word("rooster", "хурӯс", "khurüs"));
        words.add(new Word("scorpion", "каждум", "kazhdum"));
        words.add(new Word("sheep", "гӯсфанд", "güsfand"));
        words.add(new Word("spider", "тортанак", "tortanak"));
        words.add(new Word("snake", "мор", "mor"));
        words.add(new Word("squirrel", "санҷоб", "sanjob"));
        words.add(new Word("tortoise", "сангпушт", "sangpusht"));
        words.add(new Word("trout", "гулмоҳӣ", "gulmohi"));
        words.add(new Word("wasp", "ору", "oru"));
        words.add(new Word("whale", "кит", "kit"));
        words.add(new Word("wolf", "гург", "gurg"));
        words.add(new Word("worm", "кирм", "kirm"));





        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        //for copying
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));
    }
}

