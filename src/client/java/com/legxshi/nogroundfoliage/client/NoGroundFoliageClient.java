package com.legxshi.nogroundfoliage.client;

import net.fabricmc.api.ClientModInitializer;
import java.util.Set;

public class NoGroundFoliageClient implements ClientModInitializer {

	public static final Set<String> KNOWN_PLANTS = Set.of(
			"minecraft:grass",
			"minecraft:short_grass",
			"minecraft:tall_grass",
			"minecraft:fern",
			"minecraft:large_fern",
			"minecraft:dead_bush",
			"minecraft:dandelion",
			"minecraft:poppy",
			"minecraft:blue_orchid",
			"minecraft:allium",
			"minecraft:azure_bluet",
			"minecraft:red_tulip",
			"minecraft:orange_tulip",
			"minecraft:white_tulip",
			"minecraft:pink_tulip",
			"minecraft:oxeye_daisy",
			"minecraft:cornflower",
			"minecraft:lily_of_the_valley",
			"minecraft:sunflower",
			"minecraft:lilac",
			"minecraft:rose_bush",
			"minecraft:peony",
			"minecraft:pitcher_plant",
			"minecraft:torchflower",
			"minecraft:brown_mushroom",
			"minecraft:red_mushroom",
			"minecraft:sugar_cane",
			"minecraft:bamboo",

			"minecraft:crimson_fungus",
			"minecraft:warped_fungus",
			"minecraft:bush",
			"minecraft:short_dry_grass",
			"minecraft:cactus_flower",
			"minecraft:closed_eyeblossom",
			"minecraft:open_eyeblossom",
			"minecraft:wither_rose",
			"minecraft:pink_petals",
			"minecraft:wildflowers",
			"minecraft:leaf_litter",
			"minecraft:firefly_bush",
			"minecraft:crimson_roots",
			"minecraft:warped_roots",
			"minecraft:nether_sprouts",
			"minecraft:golden_dandelion"
	);

	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
	}
}