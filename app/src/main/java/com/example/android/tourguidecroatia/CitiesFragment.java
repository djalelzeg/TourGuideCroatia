package com.example.android.tourguidecroatia;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by djalél on 10/06/2018.
 */

public class CitiesFragment extends Fragment {
    public CitiesFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);



        // Create a list of words
        final ArrayList<Word> words= new ArrayList<Word>();
        words.add(new Word(R.string.Esplanade, R.string.Esplanade_description, R.drawable.hotel_esplanade_zagreb ));
        words.add(new Word(R.string.Monte_mulini,R.string.Monte_mulini_description, R.drawable.hotel_monte_mulini_rovinj
        ));
        words.add(new Word(R.string.Osijek_Hotel, R.string.Osijek_Hotel_description, R.drawable.hotel_osijek));
        words.add(new Word(R.string.Valamar, R.string.Valamar_description, R.drawable.valamar_hotel_dubrovnik));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.colorPrimary);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);



        return rootView;
    }

}
