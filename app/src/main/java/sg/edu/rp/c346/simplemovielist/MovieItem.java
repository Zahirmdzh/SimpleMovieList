package sg.edu.rp.c346.simplemovielist;

/**
 * Created by 17042725 on 18/7/2018.
 */

public class MovieItem {
    private String movieName;
    private String releaseDate;
    private String movieRatings;

    public MovieItem(String movieName, String releaseDate, String movieRatings) {
        this.movieName = movieName;
        this.releaseDate = releaseDate;
        this.movieRatings = movieRatings;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getMovieRatings() {
        return movieRatings;
    }

    public void setMovieRatings(String movieRatings) {
        this.movieRatings = movieRatings;
    }

    @Override
    public String toString() {
        return "MovieItem{" +
                "movieName='" + movieName + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", movieRatings='" + movieRatings + '\'' +
                '}';
    }
}

