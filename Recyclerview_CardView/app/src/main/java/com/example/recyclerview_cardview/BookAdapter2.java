package com.example.recyclerview_cardview;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class BookAdapter2 extends RecyclerView.Adapter<BookAdapter2.BookViewHolder>{
    private List<Book2> mBooks;
    public void setData(List<Book2> list) {
        this.mBooks = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_book, parent, false);
        return new BookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
        Book2 book2 = mBooks.get(position);
        if (book2 != null) {
            return;
        }
        holder.imgBook.setImageResource(book2.getResourceId());
        holder.txtTitle.setText(book2.getTitle());
    }

    @Override
    public int getItemCount() {
        if (mBooks != null) {
            return mBooks.size();
        }
        return 0;
    }

    public class BookViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgBook;
        private TextView txtTitle;
        public BookViewHolder(@NonNull View itemView) {
            super(itemView);
            imgBook = itemView.findViewById(R.id.img_book);
            txtTitle = itemView.findViewById(R.id.tv_title);
        }
    }
}
