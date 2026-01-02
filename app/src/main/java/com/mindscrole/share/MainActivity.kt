package com.mindscrole.share

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        textView = TextView(this).apply {
            textSize = 16f
            setPadding(48, 48, 48, 48)
        }

        setContentView(textView)
        handleIntent(intent)
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        handleIntent(intent)
    }

    private fun handleIntent(intent: Intent?) {
        if (intent?.action == Intent.ACTION_SEND && intent.type == "text/plain") {
            val sharedText = intent.getStringExtra(Intent.EXTRA_TEXT)
            textView.text = sharedText?.let {
                "📥 Shared content received:\n\n$it"
            } ?: "⚠️ No text received"
        } else {
            textView.text = "Mindscrole ready ✅\n\nShare an Instagram Reel to process."

        }
    }
}
