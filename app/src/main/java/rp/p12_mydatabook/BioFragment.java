package rp.p12_mydatabook;


import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BioFragment extends Fragment {
    Button edit;
    TextView textView;

    public BioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        final View view = inflater.inflate(R.layout.biofragment, container, false);
        final LinearLayout passbioinput = (LinearLayout) inflater.inflate(R.layout.bioinput,null);

        final EditText bioEdit = passbioinput.findViewById(R.id.bioEdit);

        edit = view.findViewById(R.id.editButton);
        textView = view.findViewById(R.id.textView);

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(getContext());

                // Set the view of the dialog
                myBuilder.setView(passbioinput);
                myBuilder.setTitle("Please enter");

                myBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {

                        String getbioEdit = bioEdit.getText().toString();

                        String message = getbioEdit;
                        textView.setText(message);
                    }
                });
                myBuilder.setNegativeButton("Cancel", null);
                AlertDialog myDialog = myBuilder.create();
                myDialog.show();
            }
        });

        return view;


    }


}