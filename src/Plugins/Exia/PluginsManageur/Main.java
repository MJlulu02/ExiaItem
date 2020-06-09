package Plugins.Exia.PluginsManageur;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import Plugins.Exia.Commands.CommandItem;

public class Main extends JavaPlugin {

	public static Main instance;

	public Inventory ItemInventory = Bukkit.createInventory(null, 9, "§2§l» §aMenu Item");
	public Inventory DiversInventory = Bukkit.createInventory(null, 9, "§2§l» §aDivers");

	@SuppressWarnings("deprecation")
	public void onEnable() {
		System.out.println("[ExiaItem] Enabled");
		EventManager.registerEvents(this);

		Main.instance = this;

		getCommand("item").setExecutor(new CommandItem());

		// Craft Item

		ItemStack ingot = new ItemStack(Material.CLAY_BRICK, 1);
		ItemMeta ingotM = ingot.getItemMeta();
		ingotM.setDisplayName("§2§k!!§aAtypique§r§2§k!!§r §f§l» §aOsmanthe Ingot");
		ingotM.setLore(Arrays.asList(" ", "§f§l» §8Ce lingot provient d'une fleur d'Osmanthe"));
		ingot.setItemMeta(ingotM);

		ShapedRecipe Ingot = new ShapedRecipe(ingot);

		Ingot.shape("MBM", "BCB", "MBM");

		Ingot.setIngredient('B', Material.RED_ROSE, (byte) 1);
		Ingot.setIngredient('M', Material.DIAMOND_BLOCK);
		Ingot.setIngredient('C', Material.INK_SACK, (byte) 3);

		ShapedRecipe Block_Osm = new ShapedRecipe(ingot);

		Block_Osm.shape("BBB", "BBB", "BBB");

		Block_Osm.setIngredient('B', Material.CLAY_BRICK);

		getServer().addRecipe(Ingot);
	}

	
	public List<Player> Osmanthe_Apple = new ArrayList<Player>();
	
	public void onDisable() {
		System.out.println("[ExiaItem] Disable");

		getServer().clearRecipes();
	}

}
