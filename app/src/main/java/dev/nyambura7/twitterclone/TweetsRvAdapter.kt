package dev.nyambura7.twitterclone

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.nyambura7.twitterclone.databinding.TweetListItemBinding

class TweetsRvAdapter(var tweetsList: List<TweetData>):RecyclerView.Adapter<TweetsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetsViewHolder {
        var binding = TweetListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TweetsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TweetsViewHolder, position: Int) {
        var tweet = tweetsList[position]
        holder.binding.tvDisplayName.text = tweet.displayName
        holder.binding.textView2.text = tweet.textView2
        holder.binding.tvComment.text = tweet.comm
    }

    override fun getItemCount(): Int {
        return tweetsList.size
    }
}


class TweetsViewHolder(var binding: TweetListItemBinding):RecyclerView.ViewHolder(binding.root)