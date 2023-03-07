package com.example.android.miwok;

import static android.view.LayoutInflater.from;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private  int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words,int colorResourceId){
        super(context,0,words);
        mColorResourceId = colorResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Word currentWord = getItem(position);

        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        TextView defaultTranalation = (TextView) listItemView.findViewById(R.id.english);
        defaultTranalation.setText(currentWord.getmDefaultTranslation());

        TextView miyokTranalation = (TextView) listItemView.findViewById(R.id.miyok);
        miyokTranalation.setText(currentWord.getmMiwokTranslation());


        ImageView img = (ImageView) listItemView.findViewById(R.id.list_image);

        if (currentWord.hasImage()) {
            img.setImageResource(currentWord.getmResourceId());
            img.setVisibility(View.VISIBLE);
        }
        else
            img.setVisibility(View.GONE);
        //return super.getView(position, convertView, parent);

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),mColorResourceId);
        textContainer.setBackgroundColor(color);

        return  listItemView;
    }
}
