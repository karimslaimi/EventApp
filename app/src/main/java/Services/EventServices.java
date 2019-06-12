package Services;

import java.util.*;

import Entities.Event;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface EventServices {

    @GET("GetEvents")
    Call<List<Event>> findAll();

    @GET("/{id}")
    Call<Event> findbyId(@Query("id") int id);

}
