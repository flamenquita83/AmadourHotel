package com.example.hotelapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivityContact extends AppCompatActivity {

    private TextView mTextViewSite, mTextViewEmail;
    private ImageView mImageViewSignal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_contact);

        mTextViewSite = (TextView)findViewById(R.id.textViewSiteWeb);
        mTextViewEmail = (TextView)findViewById(R.id.textViewEmail);

        mTextViewSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://www.amadour-hotel.com/fr/index.php";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);


            }
        });




    }
}