package Plugins.Exia.PluginsManageur;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

public class Item implements Listener {

	public int time = 40;
	
	@EventHandler
	public void oncousum(PlayerItemConsumeEvent e) {
		Player p = e.getPlayer();
		ItemStack item = p.getItemInHand();

		if (item == null || item.getItemMeta() == null)
			return;

		if (item.getType() != Material.GOLDEN_APPLE)
			return;

		if (item.getItemMeta().getDisplayName().equalsIgnoreCase("§d§k!!§5Mythique§r§d§k!!§r §f§l» §5Osmanthe Apple")) {
			e.setCancelled(true);
			
			if(!Main.instance.Osmanthe_Apple.contains(p)) {
				Main.instance.Osmanthe_Apple.add(p);
				
				if (item.getAmount() > 1) {

					item.setAmount(item.getAmount() - 1);
				} else if (item.getAmount() == 1) {
					item.setAmount(0);
				}

				p.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 7200, 0));
				p.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 300, 1));
				p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 1200, 1));

				p.setFoodLevel(20);
				
				new BukkitRunnable() {
					
					
					@Override
					public void run() {
						
						if (time == 0) {
							Main.instance.Osmanthe_Apple.remove(p);
							time = 40;
							p.sendMessage("§7[§2Exia§bMC§7] §aVous pouvez de nouveau utilisé votre §5Osmanthe Apple");
							this.cancel();
						}
						
						time--;
					}
				}.runTaskTimer(Main.instance, 45, 45);
				
			} else {
				if(time != 0) {
					p.sendMessage("§7[§2Exia§bMC§7] §aVous Devez attendre encore §2" + time + " §asecondes");
					return;
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

		if (item.getType() != Material.GOLDEN_APPLE)
			return;

		if (action == Action.RIGHT_CLICK_AIR) {

			if (item.getItemMeta().getDisplayName()
					.equalsIgnoreCase("§d§k!!§5Mythique§r§d§k!!§r §f§l» §5Osmanthe Apple")) {
				if (p.getFoodLevel() > 19) {
					p.setFoodLevel(19);
				}
			}

		}

	}

}
