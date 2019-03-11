package com.example.manveer.foodmainiarecipebook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class GalleryListActivity extends AppCompatActivity {

    ListView recipeListView;

    int[] images = {
            R.drawable.cake,
            R.drawable.homemade_cheez_its,
            R.drawable.oatmeal_cookies
    };

    String[] names = {
            "Triple Layer Chocolate Cake",
            "Home Made Cheez It",
            "Oatmeal Chocolate Chip Cookies"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_list);

        recipeListView = findViewById(R.id.recipeList);

        RecipeListAdapter adapter = new RecipeListAdapter();

        recipeListView.setAdapter( adapter );
    }

    class RecipeListAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View view = getLayoutInflater().inflate(R.layout.recipelistlayout, null);

            ImageView recipeImageView = view.findViewById(R.id.singleImageView);
            TextView recipeTitleText = view.findViewById(R.id.singleTitleText);

            recipeImageView.setImageResource(images[position]);
            recipeTitleText.setText(names[position]);

            return view;
        }
    }
}
