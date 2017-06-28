package com.talktajiktoday.survivaltajik;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Heather on 24/06/2017.
 */
public class FruitVegActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        //33 words as of 24/06/2017
        words.add(new Word("apple", "себ", "seb"));
        words.add(new Word("apricot", "зардолу", "zardolu"));
        words.add(new Word("banana", "банан", "banan"));
        words.add(new Word("beetroot", "лаблабу", "lablabu"));
        words.add(new Word("cabbage", "карам", "karam"));
        words.add(new Word("carrot", "сабзӣ", "sabzi"));
        words.add(new Word("cauliflower", "гулкарам", "gulkaram"));
        words.add(new Word("cherry", "гелос", "gelos"));
        words.add(new Word("cucumber", "бодиринг", "bodiring"));
        words.add(new Word("eggplant", "боимҷон", "boimjon"));
        words.add(new Word("fruit", "мева", "meva"));
        words.add(new Word("garlic", "чиснок", "chisnok"));
        words.add(new Word("kiwi", "кивӣ", "kivi"));
        words.add(new Word("lemon", "лиму", "limu"));
        words.add(new Word("melon", "харбуз", "kharbuz"));
        words.add(new Word("onion", "пиёз", "piyoz"));
        words.add(new Word("orange", "афлесун", "aflesun"));
        words.add(new Word("peach", "шафтолу", "shaftolu"));
        words.add(new Word("pear", "нок", "nok"));
        words.add(new Word("persimmon", "хурмо", "khurmo"));
        words.add(new Word("pineapple", "ананас", "ananas"));
        words.add(new Word("plum", "олу", "olu"));
        words.add(new Word("pomegranate", "анор", "anor"));
        words.add(new Word("potato", "картошка", "kartoshka"));
        words.add(new Word("pumpkin", "каду", "kadu"));
        words.add(new Word("radish", "радиска", "radiska"));
        words.add(new Word("raisin", "мавиз", "maviz"));
        words.add(new Word("sour cherry", "олуча", "olucha"));
        words.add(new Word("strawberry", "кулфинай", "kulfinai"));
        words.add(new Word("tomato", "помедор", "pomedor"));
        words.add(new Word("turnip", "шалғам", "shalgham"));
        words.add(new Word("vegetables", "сабзавот", "sabzavot"));
        words.add(new Word("watermelon", "тарбуза", "tarbuza"));




        //for copying
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));


        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

    }
}


