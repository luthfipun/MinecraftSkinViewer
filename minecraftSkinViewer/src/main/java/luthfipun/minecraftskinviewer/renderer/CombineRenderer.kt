package luthfipun.minecraftskinviewer.renderer

import android.graphics.Bitmap
import android.graphics.Canvas

fun combineBitmap(front: Bitmap, back: Bitmap): Bitmap {
    val width = front.width + back.width
    val height = front.height

    val bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
    val canvas = Canvas(bitmap)
    canvas.drawBitmap(front, 0f, 0f, null)
    canvas.drawBitmap(back, front.width.toFloat(), 0f, null)

    return bitmap
}