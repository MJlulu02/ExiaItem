package Plugins.Exia.PluginsManageur;

import java.util.Arrays;

import org.bukkit.Material;
<<<<<<< HEAD
import org.bukkit.enchantments.Enchantment;
=======
>>>>>>> master
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
<<<<<<< HEAD
				appleM.setLore(Arrays.asList(" ", "§6§nCaractéristique de l'item §7:", "§eDonne un effet de Régénération 3,", "§eAbsorption 2", " ","§f§l» §8Miam :)", "§8[ §7Cooldown : 40 secondes §8]"));
				apple.setItemMeta(appleM);
				
				ItemStack apero = new ItemStack(Material.COOKIE, 1);
				ItemMeta aperoM = apero.getItemMeta();
				aperoM.setDisplayName("§e§k!!§6Limiter§e§k!!§r §f§l» §6Gato Apèro");
				aperoM.setLore(Arrays.asList(" ", "§f§l» §8De la joie, de la bonne humeur, mangez des Gato Apèro !", " ", "§8Ps §7: §8OxiGirl en raffole"));
				apero.setItemMeta(aperoM);
				
				ItemStack block_osm = new ItemStack(Material.BRICK, 1);
				ItemMeta block_osmM = block_osm.getItemMeta();
				block_osmM.setDisplayName("§b§k!!§9Rare§b§k!!§r §f§l» §9Osmanthe Block");
				block_osmM.setLore(Arrays.asList(" ", "§f§l» §8Ce Block d'Osmanthe est fabriqué à partir de l'ingot d'Osmanthe"));
				block_osm.setItemMeta(block_osmM);
				
				ItemStack ang_buck = new ItemStack(Material.WATER_BUCKET, 1);
				ItemMeta ang_buckM = ang_buck.getItemMeta();
				ang_buckM.setDisplayName("§e§k!!§6Légendaire§e§k!!§r §f§l» §6Angelique Osmanthe Water Bucket");
				ang_buckM.setLore(Arrays.asList(" ","§f§l» §8Source d'eau magique et inépuisable"));
				ang_buck.setItemMeta(ang_buckM);
				
				ItemStack retour = new ItemStack(Material.ARROW, 1);
				ItemMeta retourM = retour.getItemMeta();
				retourM.setDisplayName("§f§l» §4Retour");
				retour.setItemMeta(retourM);

				ItemStack right = new ItemStack(Material.REDSTONE, 1);
				ItemMeta rightM = right.getItemMeta();
				rightM.setDisplayName("§f§l» §9Suivant");
				rightM.addEnchant(Enchantment.DURABILITY, 1, true);
				right.setItemMeta(rightM);
				
				Main.instance.DiversInventory.setItem(0, retour);
				Main.instance.DiversInventory.setItem(1, vitre);
				Main.instance.DiversInventory.setItem(2, ingot);
				Main.instance.DiversInventory.setItem(3, block_osm);
				Main.instance.DiversInventory.setItem(4, apple);
				Main.instance.DiversInventory.setItem(5, apero);
				Main.instance.DiversInventory.setItem(6, ang_buck);
				Main.instance.DiversInventory.setItem(7, vitre);
				Main.instance.DiversInventory.setItem(8, right);
=======
				appleM.setLore(Arrays.asList(" ","§f§l» §8Miam :)"));
				apple.setItemMeta(appleM);
				
				
				
				Main.instance.DiversInventory.setItem(2, ingot);
				Main.instance.DiversInventory.setItem(3, apple);
				Main.instance.DiversInventory.setItem(1, vitre);
				Main.instance.DiversInventory.setItem(7, vitre);
>>>>>>> master
				
				p.openInventory(Main.instance.DiversInventory);
			}
			
			
		}
		
		if (inv.getName().equalsIgnoreCase("§2§l» §aDivers")) {
			e.setCancelled(true);
			
<<<<<<< HEAD
			if (it.getType() == Material.ARROW && it.getItemMeta().getDisplayName().equalsIgnoreCase("§f§l» §4Retour")) {
				p.closeInventory();
				
				p.openInventory(Main.instance.ItemInventory);
			}
			
=======
>>>>>>> master
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
<<<<<<< HEAD
				appleM.setLore(Arrays.asList(" ", "§6§nCaractéristique de l'item §7:", "§eDonne un effet de Régénération 3,", "§eAbsorption 2", " ","§f§l» §8Miam :)", "§8[ §7Cooldown : 40 secondes §8]"));
=======
				appleM.setLore(Arrays.asList(" ","§f§l» §8Miam :)"));
>>>>>>> master
				apple.setItemMeta(appleM);
				
				p.getInventory().addItem(apple);
			}
			
<<<<<<< HEAD
			if (it.getType() == Material.COOKIE && it.getItemMeta().getDisplayName().equalsIgnoreCase("§e§k!!§6Limiter§e§k!!§r §f§l» §6Gato Apèro")) {
				p.closeInventory();
				
				ItemStack apero = new ItemStack(Material.COOKIE, 1);
				ItemMeta aperoM = apero.getItemMeta();
				aperoM.setDisplayName("§e§k!!§6Limiter§e§k!!§r §f§l» §6Gato Apèro");
				aperoM.setLore(Arrays.asList(" ", "§f§l» §8De la joie, de la bonne humeur, mangez des Gato Apèro !", " ", "§8Ps §7: §8OxiGirl en raffole"));
				apero.setItemMeta(aperoM);
				
				
				p.getInventory().addItem(apero);
			}
			
			if (it.getType() == Material.BRICK && it.getItemMeta().getDisplayName().equalsIgnoreCase("§b§k!!§9Rare§b§k!!§r §f§l» §9Osmanthe Block")) {
				p.closeInventory();
				
				ItemStack block_osm = new ItemStack(Material.BRICK, 1);
				ItemMeta block_osmM = block_osm.getItemMeta();
				block_osmM.setDisplayName("§b§k!!§9Rare§b§k!!§r §f§l» §9Osmanthe Block");
				block_osmM.setLore(Arrays.asList(" ", "§f§l» §8Ce Block d'Osmanthe est fabriqué à partir de l'ingot d'Osmanthe"));
				block_osm.setItemMeta(block_osmM);
				
				
				p.getInventory().addItem(block_osm);
			}
			
			if (it.getType() == Material.WATER_BUCKET && it.getItemMeta().getDisplayName().equalsIgnoreCase("§e§k!!§6Légendaire§e§k!!§r §f§l» §6Angelique Osmanthe Water Bucket")) {
				p.closeInventory();
				
				ItemStack ang_buck = new ItemStack(Material.WATER_BUCKET, 1);
				ItemMeta ang_buckM = ang_buck.getItemMeta();
				ang_buckM.setDisplayName("§e§k!!§6Légendaire§e§k!!§r §f§l» §6Angelique Osmanthe Water Bucket");
				ang_buckM.setLore(Arrays.asList(" ","§f§l» §8Source d'eau magique et inépuisable"));
				ang_buck.setItemMeta(ang_buckM);
				
				
				p.getInventory().addItem(ang_buck);
			}
=======
>>>>>>> master
			
		}
	}
}
