package com.example.logonrm.shiftcarros.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.logonrm.shiftcarros.R;
import com.example.logonrm.shiftcarros.api.PokemonApi;
import com.example.logonrm.shiftcarros.model.Pokemon;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class PokemonFragment extends Fragment {


    public PokemonFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pokemon, container, false);
    }

    public void carregaPokemons() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://pokeapi.co/")
                .build();
        PokemonApi api = retrofit.create(PokemonApi.class);
        api.getPokemons()
                .enqueue(new Callback<List<Pokemon>>() {
                    @Override
                    public void onResponse(Call<List<Pokemon>> call, Response<List<Pokemon>> response) {

                    }

                    @Override
                    public void onFailure(Call<List<Pokemon>> call, Throwable t) {
                        Toast.makeText(
                                getContext(),
                                "Deu ruim!",
                                Toast.LENGTH_SHORT).show();
                    }
                });
    }

}
