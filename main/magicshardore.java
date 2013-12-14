package modjam.main;
import java.util.Random;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
public class magicshardore extends Block {
public magicshardore(int par1, Block magicshardore) {
super(par1, Material.iron);
setCreativeTab(CreativeTabs.tabBlock); //place in creative tabs
}
//drops when broken with pickaxe
public int idDropped(int par1, Random par2Random, int par3)
{
return magicalfantastic.magicshard.itemID;
}
public int quantityDropped(Random par1random){
int i = (int) (Math.random()*2+1); //drops 1-3
return i;
}
public void registerIcons(IconRegister reg) { // Make sure to import IconRegister!
this.blockIcon = reg.registerIcon("magic_shard_ore"); // You can also replace blockID and blockIcon with itemID and itemIcon
}
}