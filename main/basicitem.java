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
	
}
