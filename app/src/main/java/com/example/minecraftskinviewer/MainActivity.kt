package com.example.minecraftskinviewer

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import com.example.minecraftskinviewer.databinding.ActivityMainBinding
import luthfipun.minecraftskinviewer.renderer.renderFull

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
    }

    private fun initView() {
        loadFromAssets()
//        loadFromUrl()
    }

    private fun loadFromUrl() {
        val imgUrl = ""

        Glide.with(this)
                .asBitmap()
                .load(imgUrl)
                .listener(object : RequestListener<Bitmap> {
                    override fun onLoadFailed(e: GlideException?, model: Any?, target: Target<Bitmap>?, isFirstResource: Boolean): Boolean {
                        Log.e("ENOG", "FAILED LOAD IMAGE => ${e?.localizedMessage}")
                        return false
                    }

                    override fun onResourceReady(resource: Bitmap?, model: Any?, target: Target<Bitmap>?, dataSource: DataSource?, isFirstResource: Boolean): Boolean {
                        resource?.let { setImageBitmap(it) }
                        return false
                    }
                }).submit()
    }


    private fun loadFromAssets() {
        val skinTexture = bitmapFromAsset(this, "xxxx.png")
        setImageBitmap(skinTexture)
    }

    private fun setImageBitmap(bitmap: Bitmap) {
        binding.imageView.setImageBitmapOnReady { renderFull(bitmap, width, width * 2) }
    }

    private fun bitmapFromAsset(context: Context, filePath: String): Bitmap {
        val inputStream = context.assets.open(filePath)
        val bitmap = BitmapFactory.decodeStream(inputStream)
        inputStream.close()
        return bitmap!!
    }

    private fun ImageView.setImageBitmapOnReady(func: ImageView.() -> Bitmap) {
        post { setImageBitmap(func()) }
    }
}