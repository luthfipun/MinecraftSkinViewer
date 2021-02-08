package luthfipun.minecraftskinviewer

/**
 * Represents an area or section of a complete Minecraft skin texture
 */
sealed class Section(val x: Int, val y: Int, val width: Int, val height: Int) {
    class Head : Section(8, 8, 8, 8)
    class Body : Section(20, 20, 8, 12)
    class ArmRight : Section(44, 20, 4, 12)
    class ArmLeft : Section(36, 52, 4, 12)
    class LegRight : Section(4, 20, 4, 12)
    class LegLeft : Section(20, 52, 4, 12)
    class HeadOverlay : Section(40, 8, 8, 8)
    class BodyOverlay : Section(20, 36, 8, 12)
    class ArmRightOverlay : Section(44, 36, 4, 12)
    class ArmLeftOverlay : Section(52, 52, 4, 12)
    class LegRightOverlay : Section(4, 36, 4, 12)
    class LegLeftOverlay : Section(4, 52, 4, 12)
}

sealed class SectionHD(val x: Int, val y: Int, val width: Int, val height: Int) {
    class Head : SectionHD(8 * 2, 8 * 2, 8 * 2, 8 * 2)
    class Body : SectionHD(20 * 2, 20 * 2, 8 * 2, 12 * 2)
    class ArmRight : SectionHD(44 * 2, 20 * 2, 4 * 2, 12 * 2)
    class ArmLeft : SectionHD(36 * 2, 52 * 2, 4 * 2, 12 * 2)
    class LegRight : SectionHD(4 * 2, 20 * 2, 4 * 2, 12 * 2)
    class LegLeft : SectionHD(20 * 2, 52 * 2, 4 * 2, 12 * 2)
    class HeadOverlay : SectionHD(40 * 2, 8 * 2, 8 * 2, 8 * 2)
    class BodyOverlay : SectionHD(20 * 2, 36 * 2, 8 * 2, 12 * 2)
    class ArmRightOverlay : SectionHD(44 * 2, 36 * 2, 4 * 2, 12 * 2)
    class ArmLeftOverlay : SectionHD(52 * 2, 52 * 2, 4 * 2, 12 * 2)
    class LegRightOverlay : SectionHD(4 * 2, 36 * 2, 4 * 2, 12 * 2)
    class LegLeftOverlay : SectionHD(4 * 2, 52 * 2, 4 * 2, 12 * 2)
}

sealed class BackSection(val x: Int, val y: Int, val width: Int, val height: Int) {
    class BackHead : BackSection(24, 8, 8, 8)
    class BackBody : BackSection(32, 20, 8, 12)
    class BackArmRight : BackSection(50, 20, 4, 12)
    class BackArmLeft : BackSection(42, 52, 4, 12)
    class BackLegRight : BackSection(12, 20, 4, 12)
    class BackLegLeft : BackSection(28, 52, 4, 12)
    class BackHeadOverlay : BackSection(56, 8, 8, 8)
    class BackBodyOverlay : BackSection(32, 36, 8, 12)
    class BackArmRightOverlay : BackSection(50, 36, 4, 12)
    class BackArmLeftOverlay : BackSection(58, 52, 4, 12)
    class BackLegRightOverlay : BackSection(12, 36, 4, 12)
    class BackLegLeftOverlay : BackSection(12, 52, 4, 12)
}

sealed class BackSectionHD(val x: Int, val y: Int, val width: Int, val height: Int) {
    class BackHead : BackSectionHD(24 * 2, 8 * 2, 8 * 2, 8 * 2)
    class BackBody : BackSectionHD(32 * 2, 20 * 2, 8 * 2, 12 * 2)
    class BackArmRight : BackSectionHD(50 * 2, 20 * 2, 4 * 2, 12 * 2)
    class BackArmLeft : BackSectionHD(42 * 2, 52 * 2, 4 * 2, 12 * 2)
    class BackLegRight : BackSectionHD(12 * 2, 20 * 2, 4 * 2, 12 * 2)
    class BackLegLeft : BackSectionHD(28 * 2, 52 * 2, 4 * 2, 12 * 2)
    class BackHeadOverlay : BackSectionHD(56 * 2, 8 * 2, 8 * 2, 8 * 2)
    class BackBodyOverlay : BackSectionHD(32 * 2, 36 * 2, 8 * 2, 12 * 2)
    class BackArmRightOverlay : BackSectionHD(50 * 2, 36 * 2, 4 * 2, 12 * 2)
    class BackArmLeftOverlay : BackSectionHD(58 * 2, 52 * 2, 4 * 2, 12 * 2)
    class BackLegRightOverlay : BackSectionHD(12 * 2, 36 * 2, 4 * 2, 12 * 2)
    class BackLegLeftOverlay : BackSectionHD(12 * 2, 52 * 2, 4 * 2, 12 * 2)
}