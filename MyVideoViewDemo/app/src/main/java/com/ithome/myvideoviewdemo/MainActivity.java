package com.ithome.myvideoviewdemo;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private VideoView videoView;
    private Button submitBtn;
    private MediaController mediaController;
    private ListView listView;
    private ArrayList<String> videoList;
    private ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = (VideoView) findViewById(R.id.videoViewId);
        listView = findViewById(R.id.list_itemId);

        videoList = new ArrayList<>();
        videoList.add("August Alone Animation");
        videoList.add("Funny Short Animation");
        videoList.add("Show Jumping");

        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, videoList);
        listView.setAdapter(arrayAdapter);




        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(getApplicationContext(), i + "", Toast.LENGTH_SHORT).show();

                switch(i)
                {
                    case 0:
                        String augustUri = "android.resource://" + getPackageName() + "/" + R.raw.august;

                        if (videoView != null) {
                            videoView.setVideoURI(Uri.parse(augustUri));
                            videoView.requestFocus();

                            mediaController = new MediaController(MainActivity.this);
                            videoView.setMediaController(mediaController);

                            videoView.start();
                        } else {
                            Toast.makeText(getApplicationContext(), "video is null", Toast.LENGTH_SHORT).show();
                        }
                        break;

                    case 1:
                        String funnyShortUri = "android.resource://" + getPackageName() + "/" + R.raw.funny_short;

                        if (videoView != null) {
                            videoView.setVideoURI(Uri.parse(funnyShortUri));
                            videoView.requestFocus();

                            mediaController = new MediaController(MainActivity.this);
                            videoView.setMediaController(mediaController);

                            videoView.start();
                        } else {
                            Toast.makeText(getApplicationContext(), "video is null", Toast.LENGTH_SHORT).show();
                        }
                        break;

                    case 2:
                        String showjumpingUri = "android.resource://" + getPackageName() + "/" + R.raw.showjumping;

                        if (videoView != null) {
                            videoView.setVideoURI(Uri.parse(showjumpingUri));
                            videoView.requestFocus();

                            mediaController = new MediaController(MainActivity.this);
                            videoView.setMediaController(mediaController);

                            videoView.start();
                        } else {
                            Toast.makeText(getApplicationContext(), "video is null", Toast.LENGTH_SHORT).show();
                        }
                        break;

                        default:
                            break;
                }



            }
        });



    }
}
