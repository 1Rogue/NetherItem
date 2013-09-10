package io.github.excusemyluck;

import java.util.ArrayList;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class PlayerListener implements Listener {
	public NI pl;
	private ArrayList<String> cooldown = new ArrayList<String>();

	public PlayerListener(NI plugin) {
		pl = plugin;
	}

	@SuppressWarnings("deprecation")
	@EventHandler(priority = EventPriority.NORMAL)
	public void playerClickEvent(PlayerInteractEvent event) {
		final Player p = event.getPlayer();
		Material material = event.getMaterial();
		Inventory i = p.getInventory();
		Action action = event.getAction();

		if (material.equals(Material.NETHER_STAR)
				& action == Action.RIGHT_CLICK_BLOCK) {
			int itemIds[] = { 254, 257, 258, 257, 261, 276, 277, 278, 279, 292,
					293, 294 };
			short durabilites[] = { 25, 66, 78, 99, 152, 164, 127, 220 };
			int enchants[] = { 1, 2, 3, 4, 5 };
			int enchantLvl[] = { 1, 2, 3, 4, 5 };
			Random rand = new Random();

			int randomId = itemIds[rand.nextInt(itemIds.length)];
			short randomDur = durabilites[rand.nextInt(durabilites.length)];
			int randomEnch = enchants[rand.nextInt(enchants.length)];
			int randomEnchLvl = enchantLvl[rand.nextInt(enchantLvl.length)];

			@SuppressWarnings("static-access")
			Material mat = material.getMaterial(randomId);

			if (mat != null) {
				ItemStack item = new ItemStack(mat, 1, randomDur);

				if (cooldown.contains(p.getName())) {
					p.sendMessage(ChatColor.RED
							+ "You cannot get an item at this time!");
				} else {

					if (randomEnch == 1) {
						if (mat.equals(Material.DIAMOND_SWORD)
								|| mat.equals(Material.GOLD_SWORD)
								|| mat.equals(Material.IRON_SWORD)) {
							if (randomEnchLvl > 3) {
								int enchantlvl1[] = { 1, 2, 3 };
								int randomEnchLvl1 = enchantlvl1[rand
										.nextInt(enchantlvl1.length)];
								item.addEnchantment(Enchantment.DAMAGE_ALL,
										randomEnchLvl1);
							}
						}

						if (mat.equals(Material.DIAMOND_AXE)
								|| mat.equals(Material.GOLD_AXE)
								|| mat.equals(Material.IRON_AXE)) {
							int enchantlvl1[] = { 1 };
							int randomEnchLvl1 = enchantlvl1[rand
									.nextInt(enchantlvl1.length)];
							item.addEnchantment(Enchantment.SILK_TOUCH,
									randomEnchLvl1);
						}
						
						if (mat.equals(Material.DIAMOND_SPADE)
								|| mat.equals(Material.GOLD_SPADE)
								|| mat.equals(Material.IRON_SPADE)) {
							int enchantlvl1[] = { 1, 2 };
							int randomEnchLvl1 = enchantlvl1[rand
									.nextInt(enchantlvl1.length)];
							item.addEnchantment(Enchantment.SILK_TOUCH,
									randomEnchLvl1);
						}
						
						if (mat.equals(Material.DIAMOND_PICKAXE)
								|| mat.equals(Material.GOLD_PICKAXE)
								|| mat.equals(Material.IRON_PICKAXE)) {
							int enchantlvl1[] = { 1 };
							int randomEnchLvl1 = enchantlvl1[rand
									.nextInt(enchantlvl1.length)];
							item.addEnchantment(Enchantment.SILK_TOUCH,
									randomEnchLvl1);
						}
						
						if (mat.equals(Material.BOW)) {
							int enchantlvl1[] = { 1, 2, 3 };
							int randomEnchLvl1 = enchantlvl1[rand
									.nextInt(enchantlvl1.length)];
							item.addEnchantment(Enchantment.ARROW_DAMAGE,
									randomEnchLvl1);
						}
					} else if (randomEnch == 2) {
						if (mat.equals(Material.DIAMOND_SWORD)
								|| mat.equals(Material.GOLD_SWORD)
								|| mat.equals(Material.IRON_SWORD)) {
							if (randomEnchLvl > 2) {
								int enchantlvl1[] = { 1, 2 };
								int randomEnchLvl1 = enchantlvl1[rand
										.nextInt(enchantlvl1.length)];
								item.addEnchantment(Enchantment.FIRE_ASPECT,
										randomEnchLvl1);
							}
						}
						
						if (mat.equals(Material.DIAMOND_SPADE)
								|| mat.equals(Material.GOLD_SPADE)
								|| mat.equals(Material.IRON_SPADE)) {
							int enchantlvl1[] = { 1, 2 };
							int randomEnchLvl1 = enchantlvl1[rand
									.nextInt(enchantlvl1.length)];
							item.addEnchantment(Enchantment.LOOT_BONUS_BLOCKS,
									randomEnchLvl1);
						}

						if (mat.equals(Material.DIAMOND_AXE)
								|| mat.equals(Material.GOLD_AXE)
								|| mat.equals(Material.IRON_AXE)) {
							int enchantlvl1[] = { 1, 2 };
							int randomEnchLvl1 = enchantlvl1[rand
									.nextInt(enchantlvl1.length)];
							item.addEnchantment(Enchantment.LOOT_BONUS_BLOCKS,
									randomEnchLvl1);
						}
						
						if (mat.equals(Material.DIAMOND_PICKAXE)
								|| mat.equals(Material.GOLD_PICKAXE)
								|| mat.equals(Material.IRON_PICKAXE)) {
							int enchantlvl1[] = { 1, 2 };
							int randomEnchLvl1 = enchantlvl1[rand
									.nextInt(enchantlvl1.length)];
							item.addEnchantment(Enchantment.LOOT_BONUS_BLOCKS,
									randomEnchLvl1);
						}
						
						if (mat.equals(Material.BOW)) {
							int enchantlvl1[] = { 1, 2 };
							int randomEnchLvl1 = enchantlvl1[rand
									.nextInt(enchantlvl1.length)];
							item.addEnchantment(Enchantment.ARROW_FIRE,
									randomEnchLvl1);
						}
					} else if (randomEnch == 3) {
						if (mat.equals(Material.DIAMOND_SWORD)
								|| mat.equals(Material.GOLD_SWORD)
								|| mat.equals(Material.IRON_SWORD)) {
							if (randomEnchLvl > 3) {
								int enchantlvl1[] = { 1, 2, 3 };
								int randomEnchLvl1 = enchantlvl1[rand
										.nextInt(enchantlvl1.length)];
								item.addEnchantment(Enchantment.DAMAGE_ALL,
										randomEnchLvl1);
							}
						}
						
						if (mat.equals(Material.DIAMOND_AXE)
								|| mat.equals(Material.GOLD_AXE)
								|| mat.equals(Material.IRON_AXE)) {
							int enchantlvl1[] = { 1, 2 };
							int randomEnchLvl1 = enchantlvl1[rand
									.nextInt(enchantlvl1.length)];
							item.addEnchantment(Enchantment.SILK_TOUCH,
									randomEnchLvl1);
						}

						if (mat.equals(Material.DIAMOND_AXE)
								|| mat.equals(Material.GOLD_AXE)
								|| mat.equals(Material.IRON_AXE)) {
							int enchantlvl1[] = { 1, 2 };
							int randomEnchLvl1 = enchantlvl1[rand
									.nextInt(enchantlvl1.length)];
							item.addEnchantment(Enchantment.DIG_SPEED,
									randomEnchLvl1);
						}
						
						if (mat.equals(Material.DIAMOND_PICKAXE)
								|| mat.equals(Material.GOLD_PICKAXE)
								|| mat.equals(Material.IRON_PICKAXE)) {
							int enchantlvl1[] = { 1, 2 };
							int randomEnchLvl1 = enchantlvl1[rand
									.nextInt(enchantlvl1.length)];
							item.addEnchantment(Enchantment.DIG_SPEED,
									randomEnchLvl1);
						}
						
						if (mat.equals(Material.BOW)) {
							int enchantlvl1[] = { 1 };
							int randomEnchLvl1 = enchantlvl1[rand
									.nextInt(enchantlvl1.length)];
							item.addEnchantment(Enchantment.ARROW_INFINITE,
									randomEnchLvl1);
						}
					} else if (randomEnch == 4) {
						if (mat.equals(Material.DIAMOND_SWORD)
								|| mat.equals(Material.GOLD_SWORD)
								|| mat.equals(Material.IRON_SWORD)) {
							if (randomEnchLvl > 3) {
								int enchantlvl1[] = { 1, 2, 3 };
								int randomEnchLvl1 = enchantlvl1[rand
										.nextInt(enchantlvl1.length)];
								item.addEnchantment(Enchantment.DURABILITY,
										randomEnchLvl1);
							}
						}

						if (mat.equals(Material.DIAMOND_AXE)
								|| mat.equals(Material.GOLD_AXE)
								|| mat.equals(Material.IRON_AXE)) {
							int enchantlvl1[] = { 1, 2, 3 };
							int randomEnchLvl1 = enchantlvl1[rand
									.nextInt(enchantlvl1.length)];
							item.addEnchantment(Enchantment.DURABILITY,
									randomEnchLvl1);
						}
						
						if (mat.equals(Material.DIAMOND_PICKAXE)
								|| mat.equals(Material.GOLD_PICKAXE)
								|| mat.equals(Material.IRON_PICKAXE)) {
							int enchantlvl1[] = { 1, 2, 3 };
							int randomEnchLvl1 = enchantlvl1[rand
									.nextInt(enchantlvl1.length)];
							item.addEnchantment(Enchantment.DURABILITY,
									randomEnchLvl1);
						}
						
						if (mat.equals(Material.BOW)) {
							int enchantlvl1[] = { 1, 2, 3 };
							int randomEnchLvl1 = enchantlvl1[rand
									.nextInt(enchantlvl1.length)];
							item.addEnchantment(Enchantment.ARROW_KNOCKBACK,
									randomEnchLvl1);
						}
					} else if (randomEnch == 5) {
						// add no enchant
					}

					i.removeItem(new ItemStack(Material.NETHER_STAR, 1));
					i.addItem(item);
					p.updateInventory();

					cooldown.add(p.getName());
					p.getServer().getScheduler()
							.scheduleSyncDelayedTask(pl, new Runnable() {

								public void run() {
									cooldown.remove(p.getName());
								}
							}, 100L);

					p.sendMessage(ChatColor.RED
							+ "You can get another item in 5 seconds!");
				}
			}
		}
	}
}
