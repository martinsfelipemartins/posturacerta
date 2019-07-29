package br.com.posturacerta.views;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import br.com.posturacerta.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class PrincipalFragment extends Fragment {

    TextView textViewPrincipal;
    Button btnprogress;
    ProgressBar progressBa;

    public PrincipalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_principal, container, false);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
     Button  btnprogress=view.findViewById(R.id.btnpercent);
    final  ProgressBar  progressBa=view.findViewById(R.id.progresshorizontal);

      btnprogress.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              progressBa.setProgress(34);


          }
      });
    }
}


