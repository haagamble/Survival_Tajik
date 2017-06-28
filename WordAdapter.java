package com.talktajiktoday.survivaltajik;

/**
 * Created by Heather on 24/06/2017.
 * WordAdapter is a custom ArrayAdapter that takes the Word objects.
 */

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(Activity context, ArrayList<Word> vocabWords) {
        super(context, 0, vocabWords);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the Word object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout for word in Tajik
        TextView tajikTextView = (TextView) listItemView.findViewById(R.id.tajikTextView);
        // Get the English word object and
        // set this text on the first TextView
        tajikTextView.setText(currentWord.getTajikTranslation());

        // Find the TextView in the list_item.xml layout for word in English
        TextView englishTextView = (TextView) listItemView.findViewById(R.id.englishTextView);
        // Get the Miwok word object and
        // set this text on the second TextView
        englishTextView.setText(currentWord.getEnglishTranslation());

        //Find the TextView in the list_item.xml layout with the tajikLatin
        TextView tajikLatinTextView = (TextView) listItemView.findViewById(R.id.tajikLatinTextView);

        //see if the word includes the Latin transliteration
        if (currentWord.hasLatin()){
            tajikLatinTextView.setText(currentWord.getTajikInLatin());
            tajikLatinTextView.setVisibility(View.VISIBLE);
        }
        else{
           tajikLatinTextView.setVisibility(View.GONE);
        }



        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        //see if the word includes an image
        if (currentWord.hasImage()){
            imageView.setImageResource(currentWord.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);

        }
        else {
            //GONE means that view is invisible and takes up no space
            imageView.setVisibility(View.GONE);
        }



        return listItemView;
    }

}

