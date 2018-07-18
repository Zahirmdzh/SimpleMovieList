package sg.edu.rp.c346.simplemovielist;

import android.app.Activity;
import android.graphics.Movie;
import android.os.Bundle;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends Activity {

    ListView lvMovie;
    ArrayList<MovieItem> alMovieList;
    CustomAdapter caMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = findViewById(R.id.ListViewMovie);

        alMovieList = new ArrayList<>();
        MovieItem item1 = new MovieItem("Avengers: Infinity War", "Release Date: April 2018","PG13");
        MovieItem item2 = new MovieItem("Avengers: Infinity War", "Release Date: April 2018","PG13");
        MovieItem item3 = new MovieItem("Avengers: Infinity War", "Release Date: April 2018","PG13");
        MovieItem item4 = new MovieItem("Avengers: Infinity War", "Release Date: April 2018","PG13");

        alMovieList.add(item1);
        alMovieList.add(item2);
        alMovieList.add(item3);
        alMovieList.add(item4);

        caMovie = new CustomAdapter(this, R.layout.movie_item, alMovieList);
        lvMovie.setAdapter(caMovie);
    }
}
