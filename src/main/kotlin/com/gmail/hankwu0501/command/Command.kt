package com.gmail.hankwu0501.command

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

object Command : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<String?>): Boolean {
        if (sender is Player) {
            if (sender.hasPermission("getitemcmd.commands")) {
                var cmd = "無"
                if (sender.inventory.itemInMainHand.itemMeta?.hasCustomModelData() == true) cmd = sender.inventory.itemInMainHand.itemMeta?.customModelData.toString()
                val item = sender.inventory.itemInMainHand.data?.itemType.toString()
                sender.sendMessage("你手上的物品為: $item, CustomModelData : $cmd")
            }else {
                sender.sendMessage("§c你沒有權限使用此指令")
                return false
            }
            return true
        }else{
            sender.sendMessage("§c你不是一位玩家!")
            return false
        }
    }
}