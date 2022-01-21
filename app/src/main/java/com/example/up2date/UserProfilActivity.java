package com.example.up2date;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class UserProfilActivity extends AppCompatActivity {
    private TextView mTitre;
    private ImageView mAvatarIcon;
    private TextView mScoreTxt;
    private Button mButtonFinish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profil);
        mTitre = (TextView) findViewById(R.id.title_txt);
        mAvatarIcon = (ImageView) findViewById(R.id.avatarIcon);
        mScoreTxt = (TextView) findViewById(R.id.score_txt);
        mButtonFinish = (Button) findViewById(R.id.finish_btn);

        mButtonFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // The user just clicked
                Intent mainActivityIntent = new Intent(UserProfilActivity.this, MainActivity.class);
                startActivity(mainActivityIntent);

            }
        });
    }
}
