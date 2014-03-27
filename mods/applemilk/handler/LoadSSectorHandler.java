package mods.applemilk.handler;

import java.util.ArrayList;

import mods.applemilk.api.IceRecipe;
import mods.applemilk.common.DCsAppleMilk;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class LoadSSectorHandler {
	
	public static ItemStack sakeBottle;
	public static ItemStack rumBottle;
	public static ItemStack ginBottle;
	public static ItemStack beerBottle;
	public static ItemStack emptyBottle;
	
	public void load()
	{
		ArrayList<ItemStack> sake = OreDictionary.getOres("drinkSake");
		ArrayList<ItemStack> rum = OreDictionary.getOres("drinkRum");
		ArrayList<ItemStack> gin = OreDictionary.getOres("drinkGin");
		ArrayList<ItemStack> beer = OreDictionary.getOres("drinkBeer");
		ArrayList<ItemStack> bottle = OreDictionary.getOres("craftingBottle");
		
		if (sake.size() > 0){
			sakeBottle = sake.get(0);
			if (sakeBottle != null) {
				LoadModHandler.registerModItems("drinkSake", new ItemStack(sakeBottle.itemID, 1, 0));
			}
		}
		if (rum.size() > 0){
			rumBottle = rum.get(0);
			if (rumBottle != null) {

				LoadModHandler.registerModItems("drinkRum", new ItemStack(rumBottle.itemID, 1, 0));
			}
		}
		if (gin.size() > 0){
			ginBottle = gin.get(0);
			if (ginBottle != null) {
				LoadModHandler.registerModItems("drinkGin", new ItemStack(ginBottle.itemID, 1, 0));
			}
		}
		if (beer.size() > 0){
			beerBottle = beer.get(0);
			if (beerBottle != null) {
				LoadModHandler.registerModItems("drinkBeer", new ItemStack(beerBottle.itemID, 1, 0));
			}
		}
		if (bottle.size() > 0){
			emptyBottle = bottle.get(0);
			if (emptyBottle != null) {
			}
		}

	}

}
