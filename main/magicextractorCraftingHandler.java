package modjam.main;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.ICraftingHandler;

public class magicextractorCraftingHandler implements ICraftingHandler {

	
	public void onCrafting(EntityPlayer player, ItemStack item, IInventory inv) 
	{
	  	for(int i=0; i < inv.getSizeInventory(); i++)
		{        	
	    	if(inv.getStackInSlot(i) != null)
	    	{
	    		ItemStack j = inv.getStackInSlot(i);
	    		if(j.getItem() != null && j.getItem() == magicalfantastic.magicextractor)
	    		{
	    			ItemStack k = new ItemStack(magicalfantastic.magicextractor, 2, (j.getItemDamage() + 0));
	    			inv.setInventorySlotContents(i, k);
	    		}
	    	}  
		}
	}

	
	public void onSmelting(EntityPlayer player, ItemStack item) {
		
		
	}

}
