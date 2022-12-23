package ui_generator

import design.defination.CupertinoDesign
import design.defination.MaterialDesign
import design.defination.OtherOsDesign


interface UIGenerator {
    fun generateMacOsUI(): CupertinoDesign
    fun generateWinOsUI(): MaterialDesign
    fun generateOtherOsUI(): OtherOsDesign
}