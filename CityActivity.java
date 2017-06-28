package com.talktajiktoday.survivaltajik;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        //54 words as of 24/06/2017
        words.add(new Word("airport", "аэропорт", "aeroport"));
        words.add(new Word("ATM", "банкомат", "bankomat"));
        words.add(new Word("avenue, wide street", "хиёбон", "khiyobon"));
        words.add(new Word("bakery", "нонвойхона", "nonvoikhona"));
        words.add(new Word("bank", "банк", "bank"));
        words.add(new Word("bazaar", "бозор", "bozor"));
        words.add(new Word("bookshop", "мағозаи китоб", "maghozai kitob"));
        words.add(new Word("botanical garden", "боғи ботаникӣ", "boghi botaniki"));
        words.add(new Word("building", "бино", "bino"));
        words.add(new Word("capital city", "пойтахт", "poitakht"));
        words.add(new Word("church", "калисо", "kaliso"));
        words.add(new Word("cinema", "кинотеатр", "kinoteatr"));
        words.add(new Word("circus", "сирк", "sirk"));
        words.add(new Word("city", "шаҳр", "shahr"));
        words.add(new Word("city centre", "маркази шаҳр", "markazi shahr"));
        words.add(new Word("coffee shop", "қаҳвахона", "qahvakhona"));
        words.add(new Word("college, institute", "институт", "institut"));
        words.add(new Word("column", "сутун", "sutun"));
        words.add(new Word("company", "ширкат", "shirkat"));
        words.add(new Word("embassy", "сафоратхона", "saforatkhona"));
        words.add(new Word("factory", "завод", "zavod"));
        words.add(new Word("firm", "фирма", "firma"));
        words.add(new Word("gym", "толори варзишӣ", "tolori varzishi"));
        words.add(new Word("hair dresser", "сартарошхона", "sartaroshkhona"));
        words.add(new Word("hospital", "касалхона", "kasalkhona"));
        words.add(new Word("hotel", "меҳмонхона", "mehmonkhona"));
        words.add(new Word("house", "хона", "khona"));
        words.add(new Word("house with a yard", "ҳавлӣ", "havli"));
        words.add(new Word("library", "китобхона", "kitobkhona"));
        words.add(new Word("school", "мактаб", "maktab"));
        words.add(new Word("mosque", "масҷид", "masjid"));
        words.add(new Word("museum", "осорхона", "osorkhona"));
        words.add(new Word("neighbourhood", "маҳалла", "mahalla"));
        words.add(new Word("office", "офис", "ofis"));
        words.add(new Word("park", "боғ", "bogh"));
        words.add(new Word("pharmacy", "дорухона", "dorukhona"));
        words.add(new Word("post office", "почта", "pochta"));
        words.add(new Word("pub", "пивахона", "pivakhona"));
        words.add(new Word("restaurant", "тарабхона", "tarabkhona"));
        words.add(new Word("shop", "магазин, мағоза", "magazin, maghoza"));
        words.add(new Word("shopping centre, mall", "маркази савдо", "markazi savdo"));
        words.add(new Word("side street, narrow street", "тангкуча", "tangkucha"));
        words.add(new Word("statue", "ҳайкал", "haikal"));
        words.add(new Word("street", "куча", "kucha"));
        words.add(new Word("supermarket", "супермаркет", "supermarket"));
        words.add(new Word("swimming pool", "ҳавз", "havz"));
        words.add(new Word("tailors", "ателе", "atele"));
        words.add(new Word("tea house", "чойхона", "choikhona"));
        words.add(new Word("tennis court", "майдони теннис", "maidoni tennis"));
        words.add(new Word("theatre", "театр", "teatr"));
        words.add(new Word("university", "университет", "universitet"));
        words.add(new Word("wall", "девор", "devor"));
        words.add(new Word("zoo", "боғи ҳайвонот", "boghi haivonot"));





        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        //for copying
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));
    }
}