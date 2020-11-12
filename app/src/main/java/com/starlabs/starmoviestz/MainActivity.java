package com.starlabs.starmoviestz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.starlabs.starmoviestz.adapter.BannerMoviesPagerAdapter;
import com.starlabs.starmoviestz.model.BannerMovies;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    BannerMoviesPagerAdapter bannerMoviesPagerAdapter;
    TabLayout tabLayout;
    ViewPager bannerMoviesViewPager;
    List<BannerMovies>bannerMoviesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bannerMoviesList=new ArrayList<>();
        bannerMoviesList.add(new BannerMovies(1,"test","http://androidappsforyoutube.s3.ap-south-1.amazonaws.com/primevideo/banners/homebanner1.png",""));
        bannerMoviesList.add(new BannerMovies(2,"test","http://androidappsforyoutube.s3.ap-south-1.amazonaws.com/primevideo/banners/homebanner2.png",""));
        bannerMoviesList.add(new BannerMovies(3,"test","http://androidappsforyoutube.s3.ap-south-1.amazonaws.com/primevideo/banners/homebanner3.png",""));
        bannerMoviesList.add(new BannerMovies(4,"test","http://androidappsforyoutube.s3.ap-south-1.amazonaws.com/primevideo/banners/homebanner4.png",""));
        bannerMoviesList.add(new BannerMovies(5,"test","http://androidappsforyoutube.s3.ap-south-1.amazonaws.com/primevideo/banners/homebanner5.png",""));

        setBannerMoviesPagerAdapter(bannerMoviesList);
    }

    private void setBannerMoviesPagerAdapter(List<BannerMovies> bannerMoviesList){
        bannerMoviesViewPager= findViewById(R.id.banner_viewpager);
        bannerMoviesPagerAdapter= new BannerMoviesPagerAdapter(this, bannerMoviesList);
        bannerMoviesViewPager.setAdapter(bannerMoviesPagerAdapter);
    }
}