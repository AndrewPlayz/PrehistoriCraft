package net.andrewplayz.prehistoricraft.server.block.blocks;

import net.andrewplayz.prehistoricraft.PrehistoriCraft;
import net.andrewplayz.prehistoricraft.server.block.tileentity.TileEntityLaptopBlock;
import net.andrewplayz.prehistoricraft.server.core.PhCBlocks;
import net.andrewplayz.prehistoricraft.server.core.PhCCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

import javax.annotation.Nullable;

public class BlockLaptop extends BlockContainer {

    public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
    private static boolean isOnline;

    public BlockLaptop(String name, boolean isOnline) {
        super(Material.IRON);
        this.setHardness(2.0F);
        this.setResistance(5.0F);
        this.isOnline = isOnline;
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
        this.setSoundType(SoundType.STONE);
        this.setCreativeTab(PhCCreativeTabs.creativetab_prehistoricraft_main);
        this.setUnlocalizedName("prehistoricraft." + name);
        GameRegistry.registerBlock(this, name);
        PrehistoriCraft.PROXY.addItemRender(Item.getItemFromBlock(this), name);
        GameRegistry.registerTileEntity(TileEntityLaptopBlock.class, name);
    }

    public static void setState(boolean online, World worldIn, BlockPos pos)
    {
        IBlockState iblockstate = worldIn.getBlockState(pos);
        TileEntity tileentity = worldIn.getTileEntity(pos);

        if (online)
        {
            worldIn.setBlockState(pos, PhCBlocks.block_laptop_block.getDefaultState().withProperty(FACING, iblockstate.getValue(FACING)), 3);
            worldIn.setBlockState(pos, PhCBlocks.block_laptop_block.getDefaultState().withProperty(FACING, iblockstate.getValue(FACING)), 3);
        }
        else
        {
            worldIn.setBlockState(pos, PhCBlocks.block_laptop_block.getDefaultState().withProperty(FACING, iblockstate.getValue(FACING)), 3);
            worldIn.setBlockState(pos, PhCBlocks.block_laptop_block.getDefaultState().withProperty(FACING, iblockstate.getValue(FACING)), 3);
        }

        if (tileentity != null)
        {
            tileentity.validate();
            worldIn.setTileEntity(pos, tileentity);
        }
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

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
        if (playerIn.isSneaking()) {
            return false;
        } else {
            playerIn.openGui(PrehistoriCraft.INSTANCE, 0, worldIn, pos.getX(), pos.getY(), pos.getZ());
            return true;
        }
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityLaptopBlock() {
            @Override
            public int getSizeInventory() {
                return 0;
            }

            @Nullable
            @Override
            public ItemStack getStackInSlot(int index) {
                return null;
            }

            @Nullable
            @Override
            public ItemStack decrStackSize(int index, int count) {
                return null;
            }

            @Nullable
            @Override
            public ItemStack removeStackFromSlot(int index) {
                return null;
            }

            @Override
            public void setInventorySlotContents(int index, @Nullable ItemStack stack) {

            }

            @Override
            public boolean isItemValidForSlot(int index, ItemStack stack) {
                return false;
            }

            @Override
            public int getField(int id) {
                return 0;
            }

            @Override
            public void setField(int id, int value) {

            }

            @Override
            public int getFieldCount() {
                return 0;
            }

            @Override
            public void clear() {

            }

            @Override
            public int[] getSlotsForFace(EnumFacing side) {
                return new int[0];
            }

            @Override
            public boolean canInsertItem(int index, ItemStack itemStackIn, EnumFacing direction) {
                return false;
            }

            @Override
            public boolean canExtractItem(int index, ItemStack stack, EnumFacing direction) {
                return false;
            }
        };
    }
}