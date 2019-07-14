package mods.eln.sim

open class RegulatorFurnaceProcess(name: String, internal var furnace: FurnaceProcess) : RegulatorProcess(name) {

    override fun getHit(): Double {
        return furnace.load.Tc
    }

    override fun setCmd(cmd: Double) {
        furnace.gain = cmd
    }
}