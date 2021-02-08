package luthfipun.minecraftskinviewer.extractor

import android.graphics.Bitmap
import luthfipun.minecraftskinviewer.BackSection
import luthfipun.minecraftskinviewer.BackSectionHD
import luthfipun.minecraftskinviewer.Section
import luthfipun.minecraftskinviewer.SectionHD

fun Bitmap.extractSection(section: Section): Bitmap = Bitmap.createBitmap(this, section.x, section.y, section.width, section.height)
fun Bitmap.extractSectionHD(section: SectionHD): Bitmap = Bitmap.createBitmap(this, section.x, section.y, section.width, section.height)
fun Bitmap.extractBackSection(section: BackSection): Bitmap = Bitmap.createBitmap(this, section.x, section.y, section.width, section.height)
fun Bitmap.extractBackSectionHD(section: BackSectionHD): Bitmap = Bitmap.createBitmap(this, section.x, section.y, section.width, section.height)