package modjam.main;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.*;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;


public class basicitem extends Item{
public basicitem(int par1){
	
	super(par1);
	setCreativeTab(CreativeTabs.tabMaterials);
}
public void registerIcons(IconRegister reg) { // Make sure to import IconRegister!
if (itemID == magicalfantastic.magicshard.itemID) {
this.itemIcon = reg.registerIcon("magic_shard"); // You can also replace blockID and blockIcon with itemID and itemIcon
}
if (itemID == magicalfantastic.orangedust.itemID) {
this.itemIcon = reg.registerIcon("orange_dust"); // You can also replace blockID and blockIcon with itemID and itemIcon
}
}
}
