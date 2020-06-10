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
<<<<<<< HEAD
		
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
		
		ItemStack apple = new ItemStack(Material.GOLDEN_APPLE, 1);
		ItemMeta appleM = apple.getItemMeta();
		appleM.setDisplayName("§d§k!!§5Mythique§r§d§k!!§r §f§l» §5Osmanthe Apple");
		appleM.setLore(Arrays.asList(" ", "§6§nCaractéristique de l'item §7:", "§eDonne un effet de Régénération 3,", "§eAbsorption 2", " ","§f§l» §8Miam :)", "§8[ §7Cooldown : 40 secondes §8]"));
		apple.setItemMeta(appleM);
		
		ItemStack ang_buck = new ItemStack(Material.WATER_BUCKET, 1);
		ItemMeta ang_buckM = ang_buck.getItemMeta();
		ang_buckM.setDisplayName("§e§k!!§6Légendaire§e§k!!§r §f§l» §6Angelique Osmanthe Water Bucket");
		ang_buckM.setLore(Arrays.asList(" ","§f§l» §8Source d'eau magique et inépuisable"));
		ang_buck.setItemMeta(ang_buckM);
		
		ItemStack flower = new ItemStack(Material.RED_ROSE, 1, (byte) 1);
		ItemMeta flowerM = flower.getItemMeta();
		flowerM.setDisplayName("§7§k!!§fCommun§7§k!!§r §f§l» §fOsmanthe Flower");
		flowerM.setLore(Arrays.asList(" ", "§f§l» §8Cette Fleur d'Osmanthe sert à craft un lingot d'Osmanthe"));
		flower.setItemMeta(flowerM);
=======
>>>>>>> master

		ShapedRecipe Ingot = new ShapedRecipe(ingot);

		Ingot.shape("MBM", "BCB", "MBM");

<<<<<<< HEAD
		Ingot.setIngredient('B', flower.getData());
		Ingot.setIngredient('M', Material.DIAMOND_BLOCK);
		Ingot.setIngredient('C', Material.INK_SACK, (byte) 3);

		ShapedRecipe Block_Osm = new ShapedRecipe(block_osm);

		Block_Osm.shape("BBB", "BBB", "BBB");

		Block_Osm.setIngredient('B', ingot.getData());
		
		ShapedRecipe gato = new ShapedRecipe(apero);

		gato.shape("/-/", "-_-", "/-/");

		gato.setIngredient('-', Material.COOKIE);
		gato.setIngredient('/', Material.CAKE);
		gato.setIngredient('_', Material.GOLDEN_CARROT);
		
		ShapedRecipe Apple = new ShapedRecipe(apple);

		Apple.shape(" - ", "-_-", " - ");

		Apple.setIngredient('-', ingot.getData());
		Apple.setIngredient('_', Material.GOLDEN_APPLE, (byte) 1);

		getServer().addRecipe(gato);
		getServer().addRecipe(Block_Osm);
		getServer().addRecipe(Ingot);
		getServer().addRecipe(Apple);
=======
		Ingot.setIngredient('B', Material.RED_ROSE, (byte) 1);
		Ingot.setIngredient('M', Material.DIAMOND_BLOCK);
		Ingot.setIngredient('C', Material.INK_SACK, (byte) 3);

		ShapedRecipe Block_Osm = new ShapedRecipe(ingot);

		Block_Osm.shape("BBB", "BBB", "BBB");

		Block_Osm.setIngredient('B', Material.CLAY_BRICK);

		getServer().addRecipe(Ingot);
>>>>>>> master
	}

	
	public List<Player> Osmanthe_Apple = new ArrayList<Player>();
<<<<<<< HEAD
	public List<Player> Gato_Apero = new ArrayList<Player>();
=======
>>>>>>> master
	
	public void onDisable() {
		System.out.println("[ExiaItem] Disable");

		getServer().clearRecipes();
	}

}
