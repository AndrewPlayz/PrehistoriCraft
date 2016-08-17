package net.andrewplayz.prehistoricraft.server.block.blocks.fossils;

import net.andrewplayz.prehistoricraft.PrehistoriCraft;
import net.andrewplayz.prehistoricraft.server.block.tileentity.TileEntityIchthyosaurusFossilBlock;
import net.andrewplayz.prehistoricraft.server.core.PhCCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockIchthyosaurusFossil extends Block{

    public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);

    public BlockIchthyosaurusFossil(String name) {
        super(Material.ROCK);
        this.setHardness(2.0F);
        this.setResistance(5.0F);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
        this.setSoundType(SoundType.STONE);
        this.setCreativeTab(PhCCreativeTabs.creativetab_prehistoricraft_main);
        this.setUnlocalizedName("prehistoricraft." + name);
        GameRegistry.registerBlock(this, name);
        PrehistoriCraft.PROXY.addItemRender(Item.getItemFromBlock(this), name);
        GameRegistry.registerTileEntity(TileEntityIchthyosaurusFossilBlock.class, name);
    }

    @Override
    public IBlockState withRotation(IBlockState state, Rotation rot) {
        return state.withProperty(FACING, rot.rotate(state.getValue(FACING)));
    }

    @Override
    public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
        IBlockState iblockstate = worldIn.getBlockState(pos.down());
        return iblockstate.getBlock() != Blocks.AIR;
    }

    @Override
    public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn) {
        this.checkAndDropBlock(worldIn, pos, worldIn.getBlockState(pos.down()));
    }

    private boolean checkAndDropBlock(World worldIn, BlockPos pos, IBlockState state) {
        if (!this.canPlaceBlockAt(worldIn, pos)) {
            worldIn.destroyBlock(pos, true);
            return false;
        } else {
            return true;
        }
    }

    @Override
    public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
        return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing());
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(FACING, EnumFacing.getHorizontal(meta));
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return state.getValue(FACING).getHorizontalIndex();
    }

    @Override
    public boolean isOpaqueCube(IBlockState blockstate) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState blockstate) {
        return false;
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[]{FACING});
    }

    public TileEntity createTileEntity(World world, IBlockState state)
    {
        return new TileEntityIchthyosaurusFossilBlock() {
        };
    }
}