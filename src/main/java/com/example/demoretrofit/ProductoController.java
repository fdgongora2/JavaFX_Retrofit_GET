package com.example.demoretrofit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;

public class ProductoController implements Callback<List<ProductoModelo>> {

    static final String BASE_URL = "http://localhost:8080/";

    public void start() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        ProductosInterface productosAPI = retrofit.create(ProductosInterface.class);

        Call<List<ProductoModelo>> call = productosAPI.listProductos();
        call.enqueue(this);

    }

    @Override
    public void onResponse(Call<List<ProductoModelo>> call, Response<List<ProductoModelo>> response) {
        if(response.isSuccessful()) {
            List<ProductoModelo> changesList = response.body();
            changesList.forEach(change -> System.out.println(change.getProductName()));
        } else {
            System.out.println(response.errorBody());
        }
    }

    @Override
    public void onFailure(Call<List<ProductoModelo>> call, Throwable throwable) {
        throwable.printStackTrace();
    }
}
