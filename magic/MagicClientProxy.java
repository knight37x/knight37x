package knight37x.magic;

import knight37x.magic.entity.EntityDropParticle;
import knight37x.magic.entity.EntityLightning;
import knight37x.magic.entity.EntityLightningParticle;
import knight37x.magic.entity.EntityMagic;
import knight37x.magic.entity.EntityTroll;
import knight37x.magic.model.ModelTroll;
import knight37x.magic.render.RenderEnderCannon;
import knight37x.magic.render.RenderLightning;
import knight37x.magic.render.RenderLightningParticle;
import knight37x.magic.render.RenderMagic;
import knight37x.magic.render.RenderMana;
import knight37x.magic.render.RenderTroll;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;

public class MagicClientProxy extends MagicCommonProxy {
	
	@Override
	public void registerRenderers() {
		MinecraftForgeClient.registerItemRenderer(Base.mana, (IItemRenderer) new RenderMana());
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTroll.class, new RenderTroll(new ModelTroll(), 0.6F));
		RenderingRegistry.registerEntityRenderingHandler(EntityLightningParticle.class, new RenderLightningParticle());
		RenderingRegistry.registerEntityRenderingHandler(EntityLightning.class, new RenderLightning());
//		RenderingRegistry.registerEntityRenderingHandler(EntityDropParticle.class, new RenderMagic());
//		
//		RenderingRegistry.registerEntityRenderingHandler(EntityPlayer.class, new RenderCustomPlayer(new ModelPlayerFlying()));
    }

	@Override
	public void registerSound() {
	}
}