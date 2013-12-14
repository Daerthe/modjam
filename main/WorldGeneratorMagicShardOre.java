package modjam.main;
import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorMagicShardOre implements IWorldGenerator {
@Override
public void generate(Random random, int chunkX, int chunkZ, World world,
IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
// TODO Auto-generated method stub
switch(world.provider.dimensionId){
//case -1: generateNether(world, random,chunkX*16,chunkZ*16);
case 0 : generateSurface(world, random,chunkX*16,chunkZ*16);
}
}

private void generateSurface(World world, Random random, int BlockX, int BlockZ) {
for(int i =0; i<6;i++){
int Xcoord = BlockX + random.nextInt(16);
int Zcoord = BlockZ + random.nextInt(16);
int Ycoord = random.nextInt(64);
(new WorldGenMinable(magicalfantastic.magicshardore.blockID, 4)).generate(world, random, Xcoord, Ycoord, Zcoord);
}}}