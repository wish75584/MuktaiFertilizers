package com.stubborn.muktaifertilizers.fragments;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.stubborn.muktaifertilizers.R;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


//    YouTubePlayerView youTubePlayerView;
//    YouTubePlayer.OnInitializedListener onInitializedListener;
//    Button btn_vdo1;

//    private static final String VIDEO_ID = "mdI35SrAKjA";
//    private static final int RECOVERY_DIALOG_REQUEST = 1;
//    YouTubePlayerFragment myYouTubePlayerFragment;


public class VideosFragmentX extends AppCompatActivity {
    YouTubePlayerView youTubePlayerView;

//    public static final String DEVELOPER_KEY = "AIzaSyAf0ehIXDbrcgnXbyoxg4KfhxA7S8vLUoo";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_videos);
//        youTubePlayerView = findViewById(R.id.youtube_fragment);
//        youTubePlayerView = findViewById(R.id.youtube_fragment2);
//        youTubePlayerView = findViewById(R.id.youtube_fragment3);
//        youTubePlayerView = findViewById(R.id.youtube_fragment4);

//        com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
//        getLifecycle().addObserver(youTubePlayerView);

    }
    }

//    public void playVideoOne(View view) {
//        youTubePlayerView = findViewById(R.id.youtube_fragment);
//        youTubePlayerView.initialize(DEVELOPER_KEY, new YouTubePlayer.OnInitializedListener() {
//            @Override
//            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
//                youTubePlayer.loadVideo("mdI35SrAKjA");
//            }
//
//            @Override
//            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
//                Toast.makeText(VideosFragmentX.this, "error", Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
//
//    public void playVideoTwo(View view) {
//        youTubePlayerView = findViewById(R.id.youtube_fragment2);
//        youTubePlayerView.initialize(DEVELOPER_KEY, new YouTubePlayer.OnInitializedListener() {
//            @Override
//            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
//                youTubePlayer.loadVideo("gIqLt36o8Gc");
//            }
//
//            @Override
//            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
//                Toast.makeText(VideosFragmentX.this, "error", Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
//
//    public void playVideoThree(View view) {
//        youTubePlayerView = findViewById(R.id.youtube_fragment3);
//        youTubePlayerView.initialize(DEVELOPER_KEY, new YouTubePlayer.OnInitializedListener() {
//            @Override
//            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
//                youTubePlayer.loadVideo("eLtYxTDA1iE");
//            }
//
//            @Override
//            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
//                Toast.makeText(VideosFragmentX.this, "error", Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
//
//    public void playVideoFour(View view) {
//        youTubePlayerView = findViewById(R.id.youtube_fragment4);
//        youTubePlayerView.initialize(DEVELOPER_KEY, new YouTubePlayer.OnInitializedListener() {
//            @Override
//            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
//                youTubePlayer.loadVideo("2ejW2O0W6Rk");
//            }
//
//            @Override
//            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
//                Toast.makeText(VideosFragmentX.this, "error", Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
//}


//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//
//        View rootView = inflater.inflate(R.layout.fragment_videos, container, false);
//
//        youTubePlayerFragment = (YouTubePlayerSupportFragment) rootView.getSupportFragmentManager()
//                .findFragmentById(R.id.youtube_fragment);
//
//        youTubePlayerFragment = YouTubePlayerSupportFragment.newInstance();
//        youTubePlayerFragment.initialize("AIzaSyDoSBqPTwsDvbBzIVYdALhLDPlNFWq5kBw", new YouTubePlayer.OnInitializedListener() {
//            @Override
//            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
//                if (!b) {
//                    YPlayer = youTubePlayer;
//                    YPlayer.setFullscreen(true);
//                    YPlayer.loadVideo("2zNSgSzhBfM");
//                    YPlayer.play();
//                }
//            }
//
//            @Override
//            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
//            }
//        });
//        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
//        transaction.replace(R.id.youtube_fragment, youTubePlayerFragment).commit();
//        return rootView;
//    }
//}