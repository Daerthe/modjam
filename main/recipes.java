package modjam.main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class recipes {
public static void recipes(){
	GameRegistry.addRecipe(new ItemStack(magicalfantastic.orangedust,1),new Object[]{
		
		"IGR","","",'I',magicalfantastic.magicextractor,'G',Item.glowstone,'R',Item.redstone
		
	});

}
}
