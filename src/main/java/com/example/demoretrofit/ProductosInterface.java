package com.example.demoretrofit;
import retrofit2.*;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface ProductosInterface {
    @GET("productos")
    Call<List<ProductoModelo>> listProductos();
}
