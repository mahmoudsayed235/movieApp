package com.mahmoudsayed235.movieapp.util.fetcher;

import java.io.IOException;
import java.net.MalformedURLException;


public class FetchTrailerData extends BaseFetcher {

    private static FetchTrailerData fwd = null;

    private FetchTrailerData() {
    }

    public static FetchTrailerData getInstance() {
        if (fwd == null)
            fwd = new FetchTrailerData();
        return fwd;
    }

    public String fetch(String id) throws MalformedURLException, IOException {
        return perform(baseUrl + id + "/videos?api_key=" + KEY);
    }
}
