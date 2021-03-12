package rs09.game.node.entity.skill.construction.decoration.bedroom

import core.cache.def.impl.ObjectDefinition
import core.game.component.Component
import core.game.interaction.OptionHandler
import core.game.node.Node
import core.game.node.entity.player.Player
import core.plugin.Initializable
import core.plugin.Plugin
import rs09.tools.Components

@Initializable
class ShavingStandHandler : OptionHandler() {
    override fun newInstance(arg: Any?): Plugin<Any> {
        ObjectDefinition.forId(13162).handlers["option:preen"] = this
        ObjectDefinition.forId(13163).handlers["option:preen"] = this
        ObjectDefinition.forId(13168).handlers["option:preen"] = this
        return this
    }

    override fun handle(player: Player?, node: Node?, option: String?): Boolean {
        player ?: return false
        node ?: return false
        if(player.appearance.isMale){
            player.interfaceManager.open(Component(Components.Hairdressers_salon_596))
        } else {
            player.interfaceManager.open(Component(Components.Hairdressers_salon_592))
        }
        return true
    }

}