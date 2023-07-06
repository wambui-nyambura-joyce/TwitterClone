package dev.nyambura7.twitterclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.nyambura7.twitterclone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayTweet()
    }
    fun displayTweet(){
        var tweet1 = TweetData("","Silvia","@machakos","Lorem ipusm",6,9,94)
        var tweet2 = TweetData("","Mercy","@nanyuki","In publishing and graphic design, Lorem ipsum is a placeholder text commonly used to demonstrate the visual form of a document or a typeface without relying on meaningful content. Lorem ipsum may be used as a placeholder before final copy is available",16,29,4)
        var tweet3 = TweetData("","Joy","@kiambu","Word auto-generates five paragraphs of lorem ipsum with the \"()\" format. Or you can customize the amount it generates by using the \"(paragraph, sentence)\" format and inputting the number of paragraphs and sentences you want.",66,19,3)
        var tweet4 = TweetData("","Esther","@juja","Lorem ipusm",6,9,94)
        var tweetList = listOf<TweetData>(tweet1,tweet2,tweet3,tweet4)
        binding.rvTweets.layoutManager = LinearLayoutManager(this)
        var tweetsAdapter = TweetsRvAdapter(tweetList)
        binding.rvTweets.adapter = tweetsAdapter
    }
}