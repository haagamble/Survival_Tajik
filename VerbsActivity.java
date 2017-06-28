package com.talktajiktoday.survivaltajik;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class VerbsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        //22 words as of 24/06/2017
        words.add(new Word("to answer", "ҷавоб додан", "javob dodan"));
        words.add(new Word("to arrive", "омадан", "omadan"));
        words.add(new Word("to ask", "пурсидан", "pursidan"));
        words.add(new Word("to be", "будан", "budan"));
        words.add(new Word("to be able", "тавонистан", "tavonistan"));
        words.add(new Word("to be afraid", "тарсидан", "tarsidan"));
        words.add(new Word("to beat", "задан", "zadan"));
        words.add(new Word("to become", "шудан", "shudan"));
        words.add(new Word("to believe", "бовар кардан", "bovar kardan"));
        words.add(new Word("to break", "шикастан", "shikastan"));
        words.add(new Word("to bring", "овардан", "ovardan"));
        words.add(new Word("to build", "сохтан", "sokhtan"));
        words.add(new Word("to burn", "сӯхтан", "sükhtan"));
        words.add(new Word("to buy", "харидан", "kharidan"));
        words.add(new Word("to call", "ҷеғ задан", "jegh zadan"));
        words.add(new Word("to choose", "интихоб кардан", "intikhob kardan"));
        words.add(new Word("to clean", "тоза кардан", "toza kardan"));
        words.add(new Word("to close", "пӯшидан", "püshidan"));
        words.add(new Word("to come down", "фуромадан", "furomadan"));
        words.add(new Word("to come in", "даромадан", "daromadan"));
        words.add(new Word("to complain", "шикоят кардан", "shikoyat kardan"));
        words.add(new Word("to confess", "иқрор кардан", "iqror kardan"));
        words.add(new Word("to cook", "пухтан", "pukhtan"));
        words.add(new Word("to correct", "ислоҳ кардан", "isloh kardan"));
        words.add(new Word("to count", "шумурдан", "shumurdan"));
        words.add(new Word("to crack", "кафидан", "kafidan"));
        words.add(new Word("to cry", "гиря кардан", "girya kardan"));
        words.add(new Word("to decide", "қарор додан", "qaror dodan"));
        words.add(new Word("to deny", "инкор кардан", "inkor kardan"));
        words.add(new Word("to dig", "кофтан", "koftan"));
        words.add(new Word("to divide", "тақсим кардан", "taqsim kardan"));
        words.add(new Word("to do", "кардан", "kardan"));
        words.add(new Word("to dream", "хоб дидан", "khob didan"));
        words.add(new Word("to drink", "нӯшидан", "nüshidan"));
        words.add(new Word("to drop", "афтондан", "aftondan"));
        words.add(new Word("to drown", "ғарк шудан", "ghark shudan"));
        words.add(new Word("to eat", "ҳӯрдан", "hürdan"));
        words.add(new Word("to fall in love", "ошиқ шудан", "oshiq shudan"));
        words.add(new Word("to feed (someone)", "хӯрондан", "khürondan"));
        words.add(new Word("to fill", "пур кардан", "pur kardan"));
        words.add(new Word("to find", "ёфтан", "yoftan"));
        words.add(new Word("to finish", "тамом кардан", "tamom kardan"));
        words.add(new Word("to fly", "паридан", "paridan"));
        words.add(new Word("to force", "маҷбур кардан", "majbur kardan"));
        words.add(new Word("to forget", "фаромӯш кардан", "faromüsh kardan"));
        words.add(new Word("to forgive", "бахшидан", "bakhshidan"));
        words.add(new Word("to free, to liberate", "озод кардан", "ozod kardan"));
        words.add(new Word("to get tired", "монда шудан", "monda shudan"));
        words.add(new Word("to give", "додан", "dodan"));
        words.add(new Word("to give advice", "маслиҳат додан", "maslihat dodan"));
        words.add(new Word("to go", "рафтан", "raftan"));
        words.add(new Word("to go out", "баромадан", "baromadan"));
        words.add(new Word("to go to sleep", "хоб рафтан", "khob raftan"));
        words.add(new Word("to guess", "ёфтан", "yoftan"));
        words.add(new Word("to hang", "овехтан", "ovekhtan"));
        words.add(new Word("to have", "доштан", "doshtan"));
        words.add(new Word("to hear", "шунидан", "shunidan"));
        words.add(new Word("to help", "кумак расондан, ёрдам кардан", "kumak rasondan, yordam kardan"));
        words.add(new Word("to hide", "пинҳон кардан", "pinhon kardan"));
        words.add(new Word("to hope", "умед доштан", "umed doshtan"));
        words.add(new Word("to imagine", "тасаввур кардан", "tasavvur kardan"));
        words.add(new Word("to inform", "хабар додан", "khabar dodan"));
        words.add(new Word("to invite", "даъват кардан", "daъvat kardan"));
        words.add(new Word("to kill", "куштан", "kushtan"));
        words.add(new Word("to know", "донистан", "donistan"));
        words.add(new Word("to laugh", "хандидан", "khandidan"));
        words.add(new Word("to lie", "дурӯғ гуфтан", "durügh guftan"));
        words.add(new Word("to listen", "гӯш кардан", "güsh kardan"));
        words.add(new Word("to live", "зиндагӣ кардан", "zindagi kardan"));
        words.add(new Word("to look for", "ҷустан, кофтан", "justan, koftan"));
        words.add(new Word("to love", "дӯст доштан", "düst doshtan"));
        words.add(new Word("to make a mistake", "хато кардан", "khato kardan"));
        words.add(new Word("to meet, to make an acquaintance", "шинос шудан", "shinos shudan"));
        words.add(new Word("to name", "номидан", "nomidan"));
        words.add(new Word("to open", "кушодан", "kushodan"));
        words.add(new Word("to participate", "иштирок кардан", "ishtirok kardan"));
        words.add(new Word("to pay", "пул додан", "pul dodan"));
        words.add(new Word("to play", "бозӣ кардан", "bozi kardan"));
        words.add(new Word("to pour", "рехтан", "rekhtan"));
        words.add(new Word("to practice", "машқ кардан", "mashq kardan"));
        words.add(new Word("to pray", "дуо кардан", "duo kardan"));
        words.add(new Word("to prepare", "тайёр кардан", "taiyor kardan"));
        words.add(new Word("to promise", "ваъда додан", "vaъda dodan"));
        words.add(new Word("to pronounce", "талаффуз кардан", "talaffuz kardan"));
        words.add(new Word("to prove", "исбот кардан", "isbot kardan"));
        words.add(new Word("to put", "мондан", "mondan"));
        words.add(new Word("to read", "хондан", "khondan"));
        words.add(new Word("to recognize", "шинохтан", "shinokhtan"));
        words.add(new Word("to repeat", "такрор кардан", "takror kardan"));
        words.add(new Word("to rest, to take a break", "дам гирифтан", "dam giriftan"));
        words.add(new Word("to return", "баргаштан", "bargashtan"));
        words.add(new Word("to run", "давидан", "davidan"));
        words.add(new Word("to scratch", "харошидан", "kharoshidan"));
        words.add(new Word("to sell", "фурӯхтан", "furükhtan"));
        words.add(new Word("to shout, to yell", "дод задан", "dod zadan"));
        words.add(new Word("to show", "нишон додан", "nishon dodan"));
        words.add(new Word("to sign", "имзо кардан", "imzo kardan"));
        words.add(new Word("to sit", "нишастан", "nishastan"));
        words.add(new Word("to smell", "буй кардан", "bui kardan"));
        words.add(new Word("to smile", "табассум кардан", "tabassum kardan"));
        words.add(new Word("to spill", "рехтан", "rekhtan"));
        words.add(new Word("to spit", "туф кардан", "tuf kardan"));
        words.add(new Word("to start", "сар кардан", "sar kardan"));
        words.add(new Word("to steal", "дуздидан", "duzdidan"));
        words.add(new Word("to stop", "истодан", "istodan"));
        words.add(new Word("to study", "омӯхтан", "omükhtan"));
        words.add(new Word("to swim", "шино кардан", "shino kardan"));
        words.add(new Word("to take", "гирифтан", "giriftan"));
        words.add(new Word("to take a picture", "сурат гирифтан", "surat giriftan"));
        words.add(new Word("to think", "фикр кардан", "fikr kardan"));
        words.add(new Word("to throw", "партофтан", "partoftan"));
        words.add(new Word("to understand", "фаҳмидан", "fahmidan"));
        words.add(new Word("to use", "истеъмол кардан", "isteъmol kardan"));
        words.add(new Word("to wake up", "бедор кардан", "bedor kardan"));
        words.add(new Word("to want", "хостан", "khostan"));
        words.add(new Word("to wash", "шустан", "shustan"));
        words.add(new Word("to work", "кор кардан", "kor kardan"));
        words.add(new Word("to wrap", "печондан", "pechondan"));
        words.add(new Word("to write", "навиштан", "navishtan"));




        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        //for copying
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));
        //words.add(new Word("", ""));
    }
}
