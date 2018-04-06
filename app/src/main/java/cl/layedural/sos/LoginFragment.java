package cl.layedural.sos;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {


    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final Button fragmentBtn = view.findViewById(R.id.signBtn);
        final View   relative = view.findViewById(R.id.signForm);
        final TextView textInit = view.findViewById(R.id.textInit);


        fragmentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputString = (String) textInit.getText().toString();
                relative.setVisibility(View.GONE);
                fragmentBtn.setVisibility(View.GONE);
                textInit.setText(inputString);
                textInit.setVisibility(View.VISIBLE);


                Toast.makeText(getContext(), "Tienes 0 Notificaciones de emergencia", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
