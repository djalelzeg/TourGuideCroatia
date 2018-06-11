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

public class NationalparksFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);



        // Create a list of words
        final ArrayList<Word> words= new ArrayList<Word>();

        words.add(new Word(R.string.Brijuni, R.string.Brijuni_description, R.drawable.brijuni ));
        words.add(new Word(R.string.Kornati,R.string.Kornati_description, R.drawable.kornati));
        words.add(new Word(R.string.Krka, R.string.Krka_description, R.drawable.krka));
        words.add(new Word(R.string.Mljet, R.string.Mljet_description, R.drawable.mljet));
        words.add(new Word(R.string.Northern_Velebit,R.string.Northern_Velebit_description,
                R.drawable.northern_velebit_national_park));
        words.add(new Word(R.string.Paklenica, R.string.Paklenica_description, R.drawable.paklenica));
        words.add(new Word(R.string.Plitvice_Lakes, R.string.Plitvice_Lakes_description, R.drawable.plitvice_lakes_national_park));
        words.add(new Word(R.string.Risnjak,R.string.Risnjak_description, R.drawable.risnjak));

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
