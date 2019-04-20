package Services;

import java.util.List;

import Entities.Event;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface EventServices {

    @GET("")
    Call<List<Event>> findAll();

    @GET("/{id}")
    Call<Event> findbyId(@Query("id") int id);

}
