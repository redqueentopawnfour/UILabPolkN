package edu.uw.tcss450.polkn.uilab.ui.home;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import edu.uw.tcss450.polkn.uilab.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AutoCompleteTextFragment extends Fragment {

    public AutoCompleteTextFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_auto_complete_text, container, false);
        final String[] COLORS = getResources().getStringArray(R.array.auto_complete_colors);
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(getActivity(),
                        android.R.layout.simple_dropdown_item_1line,
                        COLORS);
        AutoCompleteTextView text = (AutoCompleteTextView) v.findViewById(R.id.autoCompleteTextView);
        text.setAdapter(adapter);

        return v;
    }
}
