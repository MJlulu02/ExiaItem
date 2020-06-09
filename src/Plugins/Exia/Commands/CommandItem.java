package Plugins.Exia.Commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import Plugins.Exia.PluginsManageur.Main;

public class CommandItem implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
		
		Player p = (Player) sender;
		if (sender instanceof Player && p.hasPermission("Item.use")) {
			
			
			
			if (args.length > 1) {
				p.sendMessage("§7[§2Exia§bMC§7] §aLa Commande est §f: §7/§aItem ");

				return true;
			}
			
			
			
			ItemStack armure = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
			ItemMeta armureM = armure.getItemMeta();
			armureM.setDisplayName("§f§l» §aArmure");
			armureM.addEnchant(Enchantment.DURABILITY, 1, true);
			armure.setItemMeta(armureM);
			
			ItemStack outils = new ItemStack(Material.DIAMOND_AXE, 1);
			ItemMeta outilsM = outils.getItemMeta();
			outilsM.setDisplayName("§f§l» §aOutils");
			outilsM.addEnchant(Enchantment.DURABILITY, 1, true);
			outils.setItemMeta(outilsM);
			
			ItemStack divers = new ItemStack(Material.WOOD, 1);
			ItemMeta diversM = divers.getItemMeta();
			diversM.setDisplayName("§f§l» §aDivers");
			diversM.addEnchant(Enchantment.DURABILITY, 1, true);
			divers.setItemMeta(diversM);
			
			Main.instance.ItemInventory.setItem(2, armure);
			Main.instance.ItemInventory.setItem(4, outils);
			Main.instance.ItemInventory.setItem(6, divers);
			
			p.openInventory(Main.instance.ItemInventory);
		}else {
			p.sendMessage("§7[§2Exia§bMC§7] §aVous n'avez pas accès à la commande !");

			return true;
		}
		
		return false;
	}

}