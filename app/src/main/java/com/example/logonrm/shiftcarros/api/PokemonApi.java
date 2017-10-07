package com.example.logonrm.shiftcarros.api;

import com.example.logonrm.shiftcarros.model.Pokemon;
import com.example.logonrm.shiftcarros.model.PokemonResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PokemonApi {

    @GET("api/v2/pokemon")
    Call<PokemonResponse> getPokemons();

}
