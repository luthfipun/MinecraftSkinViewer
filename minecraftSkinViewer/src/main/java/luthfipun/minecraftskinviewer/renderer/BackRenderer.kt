package luthfipun.minecraftskinviewer.renderer

import android.graphics.Bitmap
import android.graphics.Canvas
import luthfipun.minecraftskinviewer.BackPart
import luthfipun.minecraftskinviewer.BackSection
import luthfipun.minecraftskinviewer.BackSectionHD
import luthfipun.minecraftskinviewer.extractor.extractBackSection
import luthfipun.minecraftskinviewer.extractor.extractBackSectionHD
import java.util.ArrayList

fun obtainBackRenderingBitmap(width: Int): Bitmap {
    return if (width == 64) {
        Bitmap.createBitmap(16, 32, Bitmap.Config.ARGB_8888)
    }else Bitmap.createBitmap(36, 70, Bitmap.Config.ARGB_8888)
}

fun renderBackFull(skinTexture: Bitmap, width: Int = 16, height: Int = 32): Bitmap {

    val fullRender = obtainBackRenderingBitmap(skinTexture.width)

    if (skinTexture.width == 64){
        avatarBack {
            with(skinTexture) {
                withHead(extractBackSection(BackSection.BackHead()))
                withBody(extractBackSection(BackSection.BackBody()))
                withRightArm(extractBackSection(BackSection.BackArmRight()))
                withLeftArm(extractBackSection(BackSection.BackArmLeft()))
                withRightLeg(extractBackSection(BackSection.BackLegRight()))
                withLeftLeg(extractBackSection(BackSection.BackLegLeft()))
                withHead(extractBackSection(BackSection.BackHeadOverlay()))
                withBody(extractBackSection(BackSection.BackBodyOverlay()))
                withRightArm(extractBackSection(BackSection.BackArmRightOverlay()))
                withLeftArm(extractBackSection(BackSection.BackArmLeftOverlay()))
                withRightLeg(extractBackSection(BackSection.BackLegRightOverlay()))
                withLeftLeg(extractBackSection(BackSection.BackLegLeftOverlay()))
            }
        }.draw(Canvas(fullRender))
    }else {
        avatarBack {
            with(skinTexture) {
                withHead(extractBackSectionHD(BackSectionHD.BackHead()))
                withBody(extractBackSectionHD(BackSectionHD.BackBody()))
                withRightArm(extractBackSectionHD(BackSectionHD.BackArmRight()))
                withLeftArm(extractBackSectionHD(BackSectionHD.BackArmLeft()))
                withRightLeg(extractBackSectionHD(BackSectionHD.BackLegRight()))
                withLeftLeg(extractBackSectionHD(BackSectionHD.BackLegLeft()))
                withHead(extractBackSectionHD(BackSectionHD.BackHeadOverlay()))
                withBody(extractBackSectionHD(BackSectionHD.BackBodyOverlay()))
                withRightArm(extractBackSectionHD(BackSectionHD.BackArmRightOverlay()))
                withLeftArm(extractBackSectionHD(BackSectionHD.BackArmLeftOverlay()))
                withRightLeg(extractBackSectionHD(BackSectionHD.BackLegRightOverlay()))
                withLeftLeg(extractBackSectionHD(BackSectionHD.BackLegLeftOverlay()))
            }
        }.draw(Canvas(fullRender))
    }
    return Bitmap.createScaledBitmap(fullRender, width, height, false).also { fullRender.recycle() }
}

fun renderBackPrimary(skinTexture: Bitmap, width: Int = 16, height: Int = 32): Bitmap {

    val fullRender = obtainBackRenderingBitmap(skinTexture.width)

    if (skinTexture.width == 64){
        avatarBack {
            with(skinTexture) {
                withHead(extractBackSection(BackSection.BackHead()))
                withBody(extractBackSection(BackSection.BackBody()))
                withRightArm(extractBackSection(BackSection.BackArmRight()))
                withLeftArm(extractBackSection(BackSection.BackArmLeft()))
                withRightLeg(extractBackSection(BackSection.BackLegRight()))
                withLeftLeg(extractBackSection(BackSection.BackLegLeft()))
            }
        }.draw(Canvas(fullRender))
    }else {
        avatarBack {
            with(skinTexture) {
                withHead(extractBackSectionHD(BackSectionHD.BackHead()))
                withBody(extractBackSectionHD(BackSectionHD.BackBody()))
                withRightArm(extractBackSectionHD(BackSectionHD.BackArmRight()))
                withLeftArm(extractBackSectionHD(BackSectionHD.BackArmLeft()))
                withRightLeg(extractBackSectionHD(BackSectionHD.BackLegRight()))
                withLeftLeg(extractBackSectionHD(BackSectionHD.BackLegLeft()))
            }
        }.draw(Canvas(fullRender))
    }
    return Bitmap.createScaledBitmap(fullRender, width, height, false).also { fullRender.recycle() }
}

fun avatarBack(func: BackRendererBuilder.() -> Unit): List<BackPart> {
    return BackRendererBuilder().run {
        func()
        build()
    }
}

fun List<BackPart>.draw(canvas: Canvas) {
    forEach {
        it.draw(canvas)
        it.recycle()
    }
}

class BackRendererBuilder {

    private var parts = ArrayList<BackPart>()

    fun withHead(bitmap: Bitmap) {
        parts.add(BackPart.BackHead(bitmap))
    }

    fun withBody(bitmap: Bitmap) {
        parts.add(BackPart.BackBody(bitmap))
    }

    fun withRightArm(bitmap: Bitmap) {
        parts.add(BackPart.BackArmRight(bitmap))
    }

    fun withLeftArm(bitmap: Bitmap) {
        parts.add(BackPart.BackArmLeft(bitmap))
    }

    fun withRightLeg(bitmap: Bitmap) {
        parts.add(BackPart.BackLegRight(bitmap))
    }

    fun withLeftLeg(bitmap: Bitmap) {
        parts.add(BackPart.BackLegLeft(bitmap))
    }

    fun build() = parts
}