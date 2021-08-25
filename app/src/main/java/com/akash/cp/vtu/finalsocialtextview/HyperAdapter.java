package com.akash.cp.vtu.finalsocialtextview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@SuppressWarnings("all")
public class HyperAdapter extends RecyclerView.Adapter<HyperAdapter.ViewHolder> {

    private List<Item> mData;
    private LayoutInflater mInflater;
    private Context ctx;

    HyperAdapter(Context context, List<Item> data) {
        this.mInflater = LayoutInflater.from(context);
        this.ctx = context;
        this.mData = data;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.hyper, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Item animal = mData.get(position);
        Spannable spanString = new SpannableString(animal.getDesc());
        Matcher matcher = Pattern.compile("@([A-Za-z0-9_-]+)").matcher(spanString);
        Matcher matcher1 = Pattern.compile("#([A-Za-z0-9_-]+)").matcher(spanString);


        while (matcher.find()) {
            spanString.setSpan(new ForegroundColorSpan(Color.YELLOW), matcher.start(), matcher.end(), /*Spannable.SPAN_EXCLUSIVE_EXCLUSIVE*/0); //to highlight word having '@'
            final String tag = matcher.group(0);
            ClickableSpan clickableSpan = new ClickableSpan() {
                @Override
                public void onClick(View textView) {
                    Log.e("click", "click " + tag);
                    Toast.makeText(ctx, " " + tag, Toast.LENGTH_SHORT).show();
                }

                @Override
                public void updateDrawState(TextPaint ds) {
                    ds.setColor(ctx.getResources().getColor(R.color.mention_color));
                    ds.setTextSize(40);
                    ds.setTypeface(Typeface.DEFAULT_BOLD);

                }
            };
            spanString.setSpan(clickableSpan, matcher.start(), matcher.end(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        }
        while (matcher1.find()) {
            spanString.setSpan(new ForegroundColorSpan(Color.parseColor("#EE0000")), matcher1.start(), matcher1.end(), 0); //to highlight word having '#'
            final String tag = matcher1.group(0);
            ClickableSpan clickableSpan = new ClickableSpan() {
                @Override
                public void onClick(View textView) {
                    Log.e("click", "click " + tag);
                    Toast.makeText(ctx, " " + tag, Toast.LENGTH_SHORT).show();
                }

                @Override
                public void updateDrawState(TextPaint ds) {
                    ds.setColor(ctx.getResources().getColor(R.color.hashtag_color));
                    ds.setTextSize(40);
                    ds.setUnderlineText(true);
                    ds.setTypeface(Typeface.DEFAULT_BOLD);

                }
            };
            spanString.setSpan(clickableSpan, matcher1.start(), matcher1.end(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        }
        holder.myTextView.setMovementMethod(LinkMovementMethod.getInstance());
        holder.myTextView.setText(spanString);


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder /*implements View.OnClickListener*/ {
        ExpandableSocialTextView myTextView;
        int mOffset;

        ViewHolder(View itemView) {
            super(itemView);
            Pattern mentionPattern = Pattern.compile("(@[A-Za-z0-9_-]+)");
            Pattern hashtagPattern = Pattern.compile("(#[A-Za-z0-9_-]+)");
            myTextView = itemView.findViewById(R.id.textViewContent);
        }


    }
}