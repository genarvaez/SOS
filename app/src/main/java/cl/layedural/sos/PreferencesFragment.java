package cl.layedural.sos;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class PreferencesFragment extends Fragment {


    public PreferencesFragment() {
        // Required empty public constructor
    }

    public static PreferencesFragment newInstance(){
        return new PreferencesFragment();
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_preferences, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkbox_meat:
                if (checked)
                    Toast.makeText(getContext(), "Carabineros", Toast.LENGTH_SHORT).show();
            else
                // Remove the meat
                break;
            case R.id.checkbox_cheese:
                if (checked)
                    Toast.makeText(getContext(), "Carabineros", Toast.LENGTH_SHORT).show();
            else
                // I'm lactose intolerant
                break;
            // TODO: Veggie sandwich
        }
    }
}
