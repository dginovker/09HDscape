package rs09.game.system.command.sets

import core.game.node.entity.player.link.music.MusicEntry
import core.plugin.Initializable
import rs09.game.system.command.Command

@Initializable
class MusicCommandSet : CommandSet(Command.Privilege.STANDARD){
    override fun defineCommands() {

        /**
         * Command that lets you play a specific song
         */
        define("playsong"){player,args ->
            if(args.size < 2){
                reject(player,"Usage: ::playsong songID")
            }
            val id = args[1].toIntOrNull()
            if(id == null){
                reject(player,"Please use a valid integer for the song id.")
            }
            player.musicPlayer.play(MusicEntry.forId(id!!))
            notify(player,"Now playing song $id")
        }

        /**
         * Command that unlocks all music tracks for the player
         * Restricted to ADMIN access only.
         */
        define("allmusic", Command.Privilege.ADMIN){ player, _ ->
            for (me in MusicEntry.getSongs().values) {
                player.musicPlayer.unlock(me.id)
            }
        }
    }
}