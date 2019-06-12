package com.example.sami.cckpfe.APIConfig;

import com.example.sami.cckpfe.Model.AccueilModel;
import com.example.sami.cckpfe.Model.Formation;
import com.example.sami.cckpfe.Model.Profil;
import com.example.sami.cckpfe.Model.Reunion;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {

    @GET("EmployeAPI/{id}")
    Call<Profil> GetProfil(@Path("id")int id);

    @GET("ReunionAPI/{id}")
    Call<List<Reunion>> GetReunions(@Path("id")int id);

    @GET("Auth/{id}")
    Call<String> Auth(@Path("id")int id, @Query("mdp")String mdp);

    @GET("Accueil/{id}")
    Call<AccueilModel> AccueilCall(@Path("id")int id);
    @GET("FormationAPI/{id}")
    Call<List<Formation>> formations(@Path("id")int id);


    @POST("EmployeAPI/{id}")
    Call<String> Permission(@Path("id") int id, @Query("date") String date,@Query("raison")String raison,@Query("nb")Integer nb);

    @POST("ReunionAPI/{id}")
    Call<String> Organiser(@Path("id") int id, @Query("date") String date,@Query("duree")Integer duree,@Query("lieu")String lieu,@Query("cible")String cible);


    /*  @GET("emprunts/{id}")
    Call<List<Emprunt>> GetEmprunts(@Path("id") Long id);
*/
/*    @POST("ajouteremprunt/{id}/{id2}")
    Call<Emprunt> Emprunter(@Path("id") Long id, @Path("id2") Integer id2);
*/
  /*  @DELETE("deletepanier/{id}")
    Call<Panier> delete(@Path("id") Long id);
*/
}
