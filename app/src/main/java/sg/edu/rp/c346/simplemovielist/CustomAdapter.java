package sg.edu.rp.c346.simplemovielist;

import android.content.Context;
import android.graphics.Movie;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import android.support.annotation.*;
import java.util.List;

/**
 * Created by 17042725 on 18/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<MovieItem> movieList;

    public CustomAdapter(Context context, int resource, ArrayList<MovieItem> movieList) {
        super(context, resource, movieList);
        this.parent_context = context;
        this.layout_id = resource;
        this.movieList = movieList;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvName = rowView.findViewById(R.id.tvName);
        TextView tvDate = rowView.findViewById(R.id.tvDate);
        TextView tvRating = rowView.findViewById(R.id.tvRating);

        MovieItem currentItem = movieList.get(position);
        tvName.setText(currentItem.getMovieName());
        tvDate.setText(currentItem.getReleaseDate());
        tvRating.setText(currentItem.getMovieRatings());

        return rowView;

    }
}
