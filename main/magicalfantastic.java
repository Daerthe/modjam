package modjam.main; //Package directory
/*
* Basic importing
*/
import javax.swing.text.html.HTMLDocument.HTMLReader.FormAction;

import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
/*
* Basic needed forge stuff
*/
@Mod(modid="ModTutorial",name="Mod Tutorial",version="v1")
@NetworkMod(clientSideRequired=true,serverSideRequired=false)
public class magicalfantastic {
/*
* ToolMaterial
*/
//Telling forge that we are creating these
//items
public static Item Woodstaff;
public static Item magicshard;
//blocks
public static Block magicshardore;

//tools

//Declaring Init
@Init
public void load(FMLInitializationEvent event){

 
 // define items
        Woodstaff=new basicstaff(3250).setUnlocalizedName("Woodstaff");
        magicshard = new basicitem(3251).setUnlocalizedName("magicshard");
// define blocks
magicshardore = new magicshardore(3350,magicshardore).setUnlocalizedName("MagicShardOre").setHardness(7.0F).setLightValue(0.625F).setResistance(5.0F);
GameRegistry.registerBlock(magicshardore,"magicshardore");
//adding names
LanguageRegistry.addName(Woodstaff,"Wooden Staff");
LanguageRegistry.addName(magicshardore, "Melpomene");
LanguageRegistry.addName(magicshard, "Melpomene Fragment");
//world generators
GameRegistry.registerWorldGenerator(new WorldGeneratorMagicShardOre());

}
}
