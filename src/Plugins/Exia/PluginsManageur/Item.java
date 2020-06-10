package Plugins.Exia.PluginsManageur;

import java.util.Arrays;
import java.util.Random;

import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

public class Item implements Listener {

	public int time = 40;
	public int gato_time = 90;
	public int ang_time = 4;

	@EventHandler
	public void oncousum(PlayerItemConsumeEvent e) {
		Player p = e.getPlayer();
		ItemStack item = p.getItemInHand();

		if (item == null || item.getItemMeta() == null)
			return;

		if (item.getType() == Material.GOLDEN_APPLE) {

			if (item.getItemMeta().getDisplayName()
					.equalsIgnoreCase("§d§k!!§5Mythique§r§d§k!!§r §f§l» §5Osmanthe Apple")) {
				e.setCancelled(true);

				if (!Main.instance.Osmanthe_Apple.contains(p)) {
					Main.instance.Osmanthe_Apple.add(p);

					if (item.getAmount() > 1) {

						item.setAmount(item.getAmount() - 1);

						p.updateInventory();
					} else if (item.getAmount() == 1) {
						p.getInventory().removeItem(item);
					}

					p.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 7200, 0));
					p.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 300, 2));
					p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 1200, 1));

					p.setFoodLevel(20);

					new BukkitRunnable() {

						@Override
						public void run() {

							if (time == 0) {
								Main.instance.Osmanthe_Apple.remove(p);
								time = 40;
								p.sendMessage(
										"§7[§2Exia§bMC§7] §aVous pouvez de nouveau utilisé votre §5Osmanthe Apple");
								this.cancel();
							}

							time--;
						}
					}.runTaskTimer(Main.instance, 45, 45);

				} else {
					if (time != 0) {
						p.sendMessage("§7[§2Exia§bMC§7] §aVous Devez attendre encore §2" + time + " §asecondes");
						return;
					}
				}

			}
		} else if (item.getType() == Material.COOKIE) {
			if (item.getItemMeta().getDisplayName().equalsIgnoreCase("§e§k!!§6Limiter§e§k!!§r §f§l» §6Gato Apèro")) {
				e.setCancelled(true);

				if (!Main.instance.Gato_Apero.contains(p)) {
					Main.instance.Gato_Apero.add(p);

					if (item.getAmount() > 1) {

						item.setAmount(item.getAmount() - 1);

						p.updateInventory();
					} else if (item.getAmount() == 1) {
						p.getInventory().removeItem(item);
					}

					p.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 1200, 2));

					p.setFoodLevel(20);

					new BukkitRunnable() {

						@Override
						public void run() {

							if (gato_time == 0) {
								Main.instance.Gato_Apero.remove(p);
								gato_time = 90;
								p.sendMessage("§7[§2Exia§bMC§7] §aVous pouvez de nouveau manger des §6Gato Apèro");
								this.cancel();

							}

							gato_time--;
						}
					}.runTaskTimer(Main.instance, 95, 95);

				} else {
					if (gato_time != 0) {
						p.sendMessage("§7[§2Exia§bMC§7] §aVous Devez attendre encore §2" + gato_time + " §asecondes");
						return;
					}
				}
			}
		}

	}

	@EventHandler
	public void onclicek(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		ItemStack item = p.getItemInHand();
		Action action = e.getAction();

		if (item == null || item.getItemMeta() == null)
			return;

		if (action == Action.RIGHT_CLICK_BLOCK) {
			if (item.getType() == Material.WATER_BUCKET && item.getItemMeta().getDisplayName()
					.equalsIgnoreCase("§e§k!!§6Légendaire§e§k!!§r §f§l» §6Angelique Osmanthe Water Bucket")) {

				ItemStack ang_buck = new ItemStack(Material.WATER_BUCKET, 1);
				ItemMeta ang_buckM = ang_buck.getItemMeta();
				ang_buckM.setDisplayName("§e§k!!§6Légendaire§e§k!!§r §f§l» §6Angelique Osmanthe Water Bucket");
				ang_buckM.setLore(Arrays.asList(" ", "§f§l» §8Source d'eau magique et inépuisable"));
				ang_buck.setItemMeta(ang_buckM);

				ItemStack ang_buck1 = new ItemStack(Material.BUCKET, 1);
				ItemMeta ang_buck1M = ang_buck1.getItemMeta();
				ang_buck1M.setDisplayName("§e§k!!§6Légendaire§e§k!!§r §f§l» §6Angelique Osmanthe Bucket");
				ang_buck1M.setLore(Arrays.asList(" ", "§f§l» §8Source d'eau magique et inépuisable"));
				ang_buck1.setItemMeta(ang_buck1M);

				new BukkitRunnable() {
					int time1 = 2;

					@Override
					public void run() {

						if (time1 == 0) {

							p.getInventory().removeItem(item);
							p.getInventory().addItem(ang_buck1);
							time1 = 2;
							this.cancel();

						}

					}
				}.runTaskTimer(Main.instance, 3, 3);

				new BukkitRunnable() {

					@Override
					public void run() {

						if (ang_time == 0) {

							p.getInventory().removeItem(ang_buck1);
							p.getInventory().addItem(ang_buck);

							ang_time = 4;
							this.cancel();
						}

						ang_time--;
					}
				}.runTaskTimer(Main.instance, 5, 5);

			}
		}

		if (action != Action.RIGHT_CLICK_AIR)
			return;
		if (item.getType() == Material.GOLDEN_APPLE) {

			if (item.getItemMeta().getDisplayName()
					.equalsIgnoreCase("§d§k!!§5Mythique§r§d§k!!§r §f§l» §5Osmanthe Apple")) {
				if (p.getFoodLevel() > 19) {
					p.setFoodLevel(19);
					return;
				}

			}
		} else if (item.getType() == Material.COOKIE) {
			if (item.getItemMeta().getDisplayName().equalsIgnoreCase("§e§k!!§6Limiter§e§k!!§r §f§l» §6Gato Apèro")) {
				if (p.getFoodLevel() > 19) {
					p.setFoodLevel(19);
					return;
				}
			}
		}
	}

	@EventHandler
	public void onpickup(PlayerPickupItemEvent e) {
		Player p = e.getPlayer();
		ItemStack it = e.getItem().getItemStack();
		Random random = new Random();
		int number = 0;

		ItemStack flower = new ItemStack(Material.RED_ROSE, 1, (byte) 1);

		for (int counter = 1; counter <= 1; counter++) {
			number = 1 + random.nextInt(10);

			if (number == 1) {

				if (it.getType() == flower.getType()) {

					ItemMeta im = it.getItemMeta();
					im.setDisplayName("§7§k!!§fCommun§7§k!!§r §f§l» §fOsmanthe Flower");
					im.setLore(Arrays.asList(" ", "§f§l» §8Cette Fleur d'Osmanthe sert à craft un lingot d'Osmanthe"));
					it.setItemMeta(im);

					e.setCancelled(true);
					((Entity) e.getItem()).remove();

					p.getInventory().addItem(it);
				}
			}

		}
	}

}
