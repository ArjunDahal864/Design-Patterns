package ui_generator

import design.concrete.ConcreteCupertinoDesign
import design.concrete.ConcreteMaterialDesign
import design.concrete.ConcreteOtherDesign
import design.defination.CupertinoDesign


class ConcreteUIGenerator:UIGenerator {
    override fun generateMacOsUI(): CupertinoDesign {
        return ConcreteCupertinoDesign()
    }

    override fun generateWinOsUI(): ConcreteMaterialDesign {
        return ConcreteMaterialDesign()
    }

    override fun generateOtherOsUI(): ConcreteOtherDesign {
        return ConcreteOtherDesign()
    }
}