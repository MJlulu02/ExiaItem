package Plugins.Exia.PluginsManageur;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Menu implements Listener {
	
	
	@EventHandler
	public void oninteract(InventoryClickEvent e) {
		Inventory inv = e.getInventory();
		Player p = (Player) e.getWhoClicked();
		ItemStack it = e.getCurrentItem();
		if (it == null)
			return;
		
		if (inv.getName().equalsIgnoreCase("§2§l» §aMenu Item")) {
			e.setCancelled(true);
			
			if (it.getType() == Material.WOOD && it.getItemMeta().getDisplayName().equalsIgnoreCase("§f§l» §aDivers")) {
				p.closeInventory();
				
				ItemStack ingot = new ItemStack(Material.CLAY_BRICK, 1);
				ItemMeta ingotM = ingot.getItemMeta();
				ingotM.setDisplayName("§2§k!!§aAtypique§r§2§k!!§r §f§l» §aOsmanthe Ingot");
				ingotM.setLore(Arrays.asList(" ","§f§l» §8Ce lingot provient d'une fleur d'Osmanthe"));
				ingot.setItemMeta(ingotM);
				
				ItemStack vitre = new ItemStack(Material.STAINED_GLASS_PANE, 1);
				ItemMeta vitreM = vitre.getItemMeta();
				vitreM.setDisplayName("");
				vitre.setItemMeta(vitreM);
				
				ItemStack apple = new ItemStack(Material.GOLDEN_APPLE, 1);
				ItemMeta appleM = apple.getItemMeta();
				appleM.setDisplayName("§d§k!!§5Mythique§r§d§k!!§r §f§l» §5Osmanthe Apple");
				appleM.setLore(Arrays.asList(" ","§f§l» §8Miam :)"));
				apple.setItemMeta(appleM);
				
				
				
				Main.instance.DiversInventory.setItem(2, ingot);
				Main.instance.DiversInventory.setItem(3, apple);
				Main.instance.DiversInventory.setItem(1, vitre);
				Main.instance.DiversInventory.setItem(7, vitre);
				
				p.openInventory(Main.instance.DiversInventory);
			}
			
			
		}
		
		if (inv.getName().equalsIgnoreCase("§2§l» §aDivers")) {
			e.setCancelled(true);
			
			if (it.getType() == Material.CLAY_BRICK && it.getItemMeta().getDisplayName().equalsIgnoreCase("§2§k!!§aAtypique§r§2§k!!§r §f§l» §aOsmanthe Ingot")) {
				p.closeInventory();
				
				ItemStack ingot = new ItemStack(Material.CLAY_BRICK, 1);
				ItemMeta ingotM = ingot.getItemMeta();
				ingotM.setDisplayName("§2§k!!§aAtypique§r§2§k!!§r §f§l» §aOsmanthe Ingot");
				ingotM.setLore(Arrays.asList(" ","§f§l» §8Ce lingot provient d'une fleur d'Osmanthe"));
				ingot.setItemMeta(ingotM);
				
				
				p.getInventory().addItem(ingot);
			}
			
			if(it.getType() == Material.GOLDEN_APPLE && it.getItemMeta().getDisplayName().equalsIgnoreCase("§d§k!!§5Mythique§r§d§k!!§r §f§l» §5Osmanthe Apple")) {
				p.closeInventory();
				
				ItemStack apple = new ItemStack(Material.GOLDEN_APPLE, 1);
				ItemMeta appleM = apple.getItemMeta();
				appleM.setDisplayName("§d§k!!§5Mythique§r§d§k!!§r §f§l» §5Osmanthe Apple");
				appleM.setLore(Arrays.asList(" ","§f§l» §8Miam :)"));
				apple.setItemMeta(appleM);
				
				p.getInventory().addItem(apple);
			}
			
			
		}
	}
}
