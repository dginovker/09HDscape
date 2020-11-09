package plugin.skill.farming.pot

import core.game.container.Container
import core.game.node.entity.player.Player
import core.game.node.item.Item
import core.game.system.task.Pulse
import core.game.world.GameWorld
import core.game.world.GameWorld.Pulser
import core.game.world.repository.Repository
import core.plugin.Plugin
import org.json.simple.JSONArray
import org.json.simple.JSONObject
import java.nio.ByteBuffer
import java.util.*

/**
 * Maintains a list of seedlings for a given player
 * @author Ceikry
 */
class SeedlingManager(private val player: Player){
    /**
     * Represents the list of active seedlings.
     */
    val seedlings: MutableList<Item> = ArrayList()

    /**
     * Method used to add a seedling to the manager.
     * @param seedling the seedling.
     */
    fun addSeedling(seedling: Item) {
        seedling.charge = 1001
        seedlings.add(seedling)
    }

    fun save(root: JSONObject){
        val seedlingArray = JSONArray()
        seedlings.forEach{
            val seedling = JSONObject()
            seedling["itemId"] = it.id
            seedling["charge"] = it.charge
            seedlingArray.add(seedling)
        }
        root["seedlings"] = seedlingArray
    }

    fun parse(seedlingData: JSONArray){
        seedlingData.forEach{
            val seedling = it as JSONObject
            seedlings.add(Item(seedling["itemId"].toString().toInt(),1,seedling["charge"].toString().toInt()))
        }
    }
}