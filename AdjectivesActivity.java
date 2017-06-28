package com.talktajiktoday.survivaltajik;

/**
 * Created by Heather on 24/06/2017.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AdjectivesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        // 88 words as of 24/06/2017

        words.add(new Word("angry", "ғазабнок", "ghazabnok"));
        words.add(new Word("beautiful", "зебо", "zebo"));
        words.add(new Word("big, large", "калон", "kalon"));
        words.add(new Word("bitter", "талх", "talkh"));
        words.add(new Word("cheap", "арзон", "arzon"));
        words.add(new Word("cheerful", "хушҳол", "khushhol"));
        words.add(new Word("clean", "тоза", "toza"));
        words.add(new Word("clear, pure", "соф", "sof"));
        words.add(new Word("closed", "пӯшида", "püshida"));
        words.add(new Word("cold", "хунук", "khunuk"));
        words.add(new Word("correct", "рост, дуруст", "rost, durust"));
        words.add(new Word("crooked", "каҷ", "kaj"));
        words.add(new Word("dangerous", "хатарнок", "khatarnok"));
        words.add(new Word("dark", "торик", "torik"));
        words.add(new Word("deep", "чуқур", "chuqur"));
        words.add(new Word("dirty", "чиркин", "chirkin"));
        words.add(new Word("dry", "хушк", "khushk"));
        words.add(new Word("easy", "осон", "oson"));
        words.add(new Word("empty", "холӣ", "kholi"));
        words.add(new Word("equal", "баробар", "barobar"));
        words.add(new Word("evil", "бад", "bad"));
        words.add(new Word("expensive", "қимат", "qimat"));
        words.add(new Word("far", "дур", "dur"));
        words.add(new Word("fast", "тез, босуръат", "tez, bosurъat"));
        words.add(new Word("fat", "фарбеҳ", "farbeh"));
        words.add(new Word("free (no cost)", "бепул", "bepul"));
        words.add(new Word("free (unrestricted", "озод", "ozod"));
        words.add(new Word("full", "пур", "pur"));
        words.add(new Word("good", "нағз, нек", "naghz, nek"));
        words.add(new Word("happy", "хурсанд", "khursand"));
        words.add(new Word("hard", "сахт", "sakht"));
        words.add(new Word("hard, difficult", "душвор", "dushvor"));
        words.add(new Word("healthy", "тандуруст", "tandurust"));
        words.add(new Word("heavy", "вазнин", "vaznin"));
        words.add(new Word("high", "баланд", "baland"));
        words.add(new Word("hot, warm", "гарм", "garm"));
        words.add(new Word("huge, great", "бузург", "buzurg"));
        words.add(new Word("hungry", "гурусна", "gurusna"));
        words.add(new Word("important", "муҳим, зарур", "muhim, zarur"));
        words.add(new Word("impossible", "имконнопазир", "imkonnopazir"));
        words.add(new Word("kind", "меҳрӯбон", "mehrübon"));
        words.add(new Word("left", "чап", "chap"));
        words.add(new Word("light (not heavy)", "сабук", "sabuk"));
        words.add(new Word("light, bright", "равшан", "ravshan"));
        words.add(new Word("little, small", "майда, хурд", "maida, khurd"));
        words.add(new Word("long", "дароз", "daroz"));
        words.add(new Word("loud", "баланд", "baland"));
        words.add(new Word("low", "паст", "past"));
        words.add(new Word("main", "асосӣ", "asosi"));
        words.add(new Word("narrow", "танг", "tang"));
        words.add(new Word("near", "наздик", "nazdik"));
        words.add(new Word("necessary", "даркорӣ", "darkori"));
        words.add(new Word("new", "нав", "nav"));
        words.add(new Word("old (people)", "пир", "pir"));
        words.add(new Word("old (things)", "кӯҳна", "kühna"));
        words.add(new Word("open", "кушода", "kushoda"));
        words.add(new Word("polite", "боадаб", "boadab"));
        words.add(new Word("poor", "камбағал", "kambaghal"));
        words.add(new Word("possible", "имконпазир", "imkonpazir"));
        words.add(new Word("quiet", "ором", "orom"));
        words.add(new Word("raw", "хом", "khom"));
        words.add(new Word("rich", "бой", "boi"));
        words.add(new Word("right", "рост", "rost"));
        words.add(new Word("ripe", "пухта", "pukhta"));
        words.add(new Word("rude", "беадаб", "beadab"));
        words.add(new Word("sad", "ғамгин", "ghamgin"));
        words.add(new Word("salty", "шӯр", "shür"));
        words.add(new Word("sharp", "тез", "tez"));
        words.add(new Word("short", "кӯтоҳ", "kütoh"));
        words.add(new Word("sick", "касал", "kasal"));
        words.add(new Word("similar", "монанд", "monand"));
        words.add(new Word("slow", "оҳиста", "ohista"));
        words.add(new Word("smooth", "ҳамвор", "hamvor"));
        words.add(new Word("sour", "турш", "tursh"));
        words.add(new Word("spicy", "тез", "tez"));
        words.add(new Word("straight", "рост", "rost"));
        words.add(new Word("strong", "боқувват", "boquvvat"));
        words.add(new Word("sweet", "ширин", "shirin"));
        words.add(new Word("tasty", "бомаза", "bomaza"));
        words.add(new Word("thick", "ғафс", "ghafs"));
        words.add(new Word("thin", "хароб, лоғар", "kharob, loghar"));
        words.add(new Word("tired, exhausted", "монда", "monda"));
        words.add(new Word("tired, sleepy", "хоболуд", "khobolud"));
        words.add(new Word("weak", "беқувват", "bequvvat"));
        words.add(new Word("wet", "тар", "tar"));
        words.add(new Word("whole", "бутун", "butun"));
        words.add(new Word("wide", "васеъ", "vaseъ"));
        words.add(new Word("young", "ҷавон", "javon"));


        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        //for copying
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));
    }
}

