package com.example.up2date;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class FullArticleActivity extends AppCompatActivity {
    private TextView mTitreArticle;
    private ImageView mImageArticle;
    private TextView mTexteArticle;
    private Button mProfilButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_article);

        mTitreArticle = (TextView) findViewById(R.id.titreArticleTxt);
        mImageArticle = (ImageView) findViewById(R.id.articleImg);
        mTexteArticle = (TextView) findViewById(R.id.article_txt);
        mProfilButton = (Button) findViewById(R.id.profil_btn);

        mProfilButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // The user just clicked
                Intent userProfilActivityIntent = new Intent(FullArticleActivity.this, UserProfilActivity.class);
                startActivity(userProfilActivityIntent);

            }
        });


    }
    }

