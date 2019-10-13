package edu.uw.tcss450.polkn.uilab.ui.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import edu.uw.tcss450.polkn.uilab.R;
import edu.uw.tcss450.polkn.uilab.ui.home.dummy.DummyContent;

/**
 * A simple {@link Fragment} subclass.
 */
public class ViewStudentFragment extends Fragment {

    public ViewStudentFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_view_student, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();

        if (getArguments() != null) {
            DummyContent.Student student = (DummyContent.Student) getArguments().getSerializable(getString(R.string.key_student_view));
            updateContent(student);
        }
    }

    public void updateContent(DummyContent.Student student) {
        TextView idDisplay = getActivity().findViewById(R.id.textView_viewStudent_id);
        TextView nameDisplay = getActivity().findViewById(R.id.textView_viewStudent_name);
        TextView detailsDisplay = getActivity().findViewById(R.id.textView_viewStudent_details);

        String id = student.getId();
        String name = student.getName();
        String details = student.getDetails();

        idDisplay.setText(id);
        nameDisplay.setText(name);
        detailsDisplay.setText(details);
    }
}
