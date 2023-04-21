package com.example.memointent;

import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.SearchManager;
import android.content.ContentValues;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.ContentInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SearchEvent;
import android.widget.ImageView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity{

    TextInputEditText mEditText;
    Uri mImgUri;
    ImageView mImageView;

    ActivityResultLauncher mGetContent = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            result -> {
                if (result.getResultCode() == Activity.RESULT_OK) {
                    if (result.getData() != null) {
                        Log.d("test","mImgUri = " + mImgUri);
                        mImageView.setImageURI(mImgUri);
                    }
                }
            }
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText = findViewById(R.id.eInput);
        mImageView = findViewById(R.id.ivPic);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        String keyword = mEditText.getText().toString();
        int itemId = item.getItemId();
        if(itemId == R.id.action_send){
            Intent intent = new Intent(getApplication(),SecondAcivity.class);
            intent.putExtra("Message",keyword);
            startActivity(intent);

        }else if ( itemId == R.id.action_google){
            Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
            intent.putExtra(SearchManager.QUERY,keyword);
            startActivity(intent);
        }else if ( itemId == R.id.action_camera){
            String fileName = System.currentTimeMillis() + ".jpg";
            ContentValues values = new ContentValues();
            values.put(MediaStore.Images.Media.TITLE, fileName);
            values.put(MediaStore.Images.Media.MIME_TYPE, "image/jpeg");
            mImgUri = getContentResolver().insert(
                    MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values
            );
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            intent.putExtra(MediaStore.EXTRA_OUTPUT, mImgUri);
            mGetContent.launch(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}