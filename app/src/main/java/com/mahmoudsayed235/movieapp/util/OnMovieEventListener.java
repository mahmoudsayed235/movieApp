package com.mahmoudsayed235.movieapp.util;

import com.mahmoudsayed235.movieapp.entity.Movie;
import com.mahmoudsayed235.movieapp.fragment.MainFragment;
import com.mahmoudsayed235.movieapp.fragment.MovieDeatailsFragment;

public interface OnMovieEventListener {
    public void OnSelectionChanged( Movie movie);

    public void favoriteHandler(Movie movie);

    public void setFirstMovie(Movie movie);

    public void detailViewRegistration(MovieDeatailsFragment movieDeatailsFragment);

    public void mainViewRegistration(MainFragment mainFragment);
}
