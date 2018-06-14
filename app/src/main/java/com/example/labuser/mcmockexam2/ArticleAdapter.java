package com.example.labuser.mcmockexam2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ArticleAdapter extends ArrayAdapter<Article> {

    private Context mContext;

    public ArticleAdapter(@NonNull Context context,
                          int resource) {
        super(context, resource);

        this.mContext = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null) {
            convertView = LayoutInflater
                    .from(mContext)
                    .inflate(R.layout.list_item_article,
                            parent,
                            false);
        }

        TextView titleTextView =
                (TextView) convertView.findViewById(R.id.list_item_article_title);

        TextView authorTextView =
                (TextView) convertView.findViewById(R.id.list_item_article_author);

        TextView descriptionTextView =
                (TextView) convertView.findViewById(R.id.list_item_article_description);

        Article article = (Article) getItem(position);

        titleTextView.setText(article.getTitle());
        authorTextView.setText(article.getAuthor());
        descriptionTextView.setText(article.getDescription());

        return convertView;
    }
}
