package br.com.posturacerta.dicas;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.posturacerta.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DicasFragment extends Fragment {


    public DicasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dicas, container, false);
    }

}
