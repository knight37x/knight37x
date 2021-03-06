package knight37x.magic.items;

import static io.netty.buffer.Unpooled.buffer;
import io.netty.buffer.ByteBuf;

import java.util.Iterator;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.network.internal.FMLProxyPacket;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import knight37x.lance.Lance;
import knight37x.lance.StaticMethods;
import knight37x.magic.Base;
import knight37x.magic.VictimWithDrops;
import knight37x.magic.entity.EntityDrop;
import knight37x.magic.entity.EntityDropParticle;
import knight37x.magic.entity.EntityLightning;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class ItemMirror extends ItemSword {

	public ItemMirror() {
		super(ToolMaterial.WOOD);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		if(StaticMethods.isRunningOnClient()) {
			this.mirrorUse(player);
		}
		super.onItemRightClick(stack, world, player);
		return stack;
	}

	@SubscribeEvent(priority = EventPriority.NORMAL)
    public void mirrorUse(EntityPlayer player) {
		ByteBuf data = buffer(4);
		data.writeInt(Base.mirrorUsePacketID);
		data.writeInt(player.getEntityId());
		FMLProxyPacket packet = new FMLProxyPacket(data, "lance");
		Lance.packetHandler.sendToServer(packet);
	}
	
	@Override
	public float func_150931_i()
    {
        return 1.0F;
    }

	@Override
    public float func_150893_a(ItemStack stack, Block block) {
        return 1.0F;
    }
	
	@Override
	public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase) {
        return false;
    }
	
	@SideOnly(Side.CLIENT)
    @Override
	public boolean isFull3D() {
        return this.bFull3D;
    }
	
	@Override
	public boolean func_150897_b(Block p_150897_1_) {
        return false;
    }
	
	@Override
	public int getItemEnchantability() {
        return 0;
    }
	
	@Override
	public boolean getIsRepairable(ItemStack stack1, ItemStack stack2) {
        return stack1.getItem() == stack2.getItem() ? true : super.getIsRepairable(stack1, stack2);
    }
	
	@Override
	@Deprecated
    public Multimap getItemAttributeModifiers() {
        return HashMultimap.create();
    }
}
