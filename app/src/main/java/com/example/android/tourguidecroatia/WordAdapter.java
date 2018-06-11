package com.example.android.tourguidecroatia;

import android.app.Activity;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by djalél on 10/06/2018.
 */

public class WordAdapter extends ArrayAdapter {

    /** Resource ID for the background color for this list of words */
    private int mColorResourceId;

    /**
     * Create a new {@link WordAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param Words is the list of {@link Word}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of words
     */

    public WordAdapter(Context context, ArrayList<Word> Words, int colorResourceId) {
        super(context,0, Words);

        mColorResourceId = colorResourceId;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the {@link Word} object located at this position in the list
        Word currentword= (Word) getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView title = (TextView) listItemView.findViewById(R.id.title);
        // Get the title from the currentWord object and set this text on
        // the title TextView.
        title.setText(currentword.gettitle());
        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView description = (TextView) listItemView.findViewById(R.id.description);
        // Get the description from the currentWord object and set this text on
        // the description TextView.
        description.setText(currentword.getdescribtion());
        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Set the ImageView to the image resource specified in the current Word
        // Check if an image is provided for this word or not
        if (currentword.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentword.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;

    }
}