package plugin.quest.members.thelosttribe

import core.cache.def.impl.ItemDefinition
import core.game.node.entity.player.Player
import core.game.node.item.Item
import core.plugin.InitializablePlugin
import core.plugin.Plugin
import core.tools.Items

@InitializablePlugin
/**
 * Prevents players from equipping the dorg cbow without completing lost tribe
 * @author Ceikry
 */
class DorgCbowEquipPlugin : Plugin<Item>{
    override fun newInstance(arg: Item?): Plugin<Item> {
        ItemDefinition.forId(Items.DORGESHUUN_CBOW_8880).handlers["equipment"] = this
        return this
    }

    override fun fireEvent(identifier: String?, vararg args: Any?): Any {
        val player = args[0] as Player
        if(!player.questRepository.isComplete("Lost Tribe")){
            player.dialogueInterpreter.sendDialogue("You must complete Lost Tribe to use this.")
            return false
        } else {
            return true
        }
    }

}