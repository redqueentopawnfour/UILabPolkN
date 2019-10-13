package edu.uw.tcss450.polkn.uilab.ui.home;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.uw.tcss450.polkn.uilab.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class TextViewFragment extends Fragment {

    public TextViewFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_text_view, container, false);
    }
}
