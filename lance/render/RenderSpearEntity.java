//package knight37x.lance.render;
//
//import org.lwjgl.opengl.GL11;
//import org.lwjgl.opengl.GL12;
//
//import net.minecraft.client.Minecraft;
//import net.minecraft.client.gui.inventory.GuiContainerCreative;
//import net.minecraft.client.gui.inventory.GuiInventory;
//import net.minecraft.client.renderer.Tessellator;
//import net.minecraft.client.renderer.entity.Render;
//import net.minecraft.client.renderer.entity.RenderArrow;
//import net.minecraft.client.renderer.entity.RenderManager;
//import net.minecraft.entity.Entity;
//import net.minecraft.entity.player.EntityPlayer;
//import net.minecraft.entity.projectile.EntityArrow;
//import net.minecraft.util.MathHelper;
//import net.minecraft.util.ResourceLocation;
//
//public class RenderSpearEntity extends Render {
//
//	private ResourceLocation arrowTextures;
//	
//	public RenderSpearEntity() {
//		this.arrowTextures = new ResourceLocation("lance:textures/entity/spear.png");
//	}
//	
//	public RenderSpearEntity(String location) {
//		this.arrowTextures = new ResourceLocation(location);
//	}
//	
//	@Override
//	public void doRender(Entity entity, double par2, double par4, double par6, float par8, float par9)
//    {
//        this.bindEntityTexture(entity);
//        GL11.glPushMatrix();
//        GL11.glTranslatef((float)par2, (float)par4, (float)par6);
//        GL11.glRotatef(entity.prevRotationYaw + (entity.rotationYaw - entity.prevRotationYaw) * par9 - 90.0F, 0.0F, 1.0F, 0.0F);
//        GL11.glRotatef(entity.prevRotationPitch + (entity.rotationPitch - entity.prevRotationPitch) * par9, 0.0F, 0.0F, 1.0F);
//        Tessellator tessellator = Tessellator.instance;
//        byte b0 = 0;
//        float f2 = 0.0F;
//        float f3 = 0.5F;
//        float f4 = (float)(0 + b0 * 10) / 32.0F;
//        float f5 = (float)(5 + b0 * 10) / 32.0F;
//        float f6 = 0.0F;
//        float f7 = 0.15625F;
//        float f8 = (float)(5 + b0 * 10) / 32.0F;
//        float f9 = (float)(10 + b0 * 10) / 32.0F;
//        float f10 = 0.15F;
////        float f10 = 0.05625F;
//        GL11.glEnable(GL12.GL_RESCALE_NORMAL);
//        float f11 = (float)0;
//
//        if (f11 > 0.0F)
//        {
//            float f12 = -MathHelper.sin(f11 * 3.0F) * f11;
//            GL11.glRotatef(f12, 0.0F, 0.0F, 1.0F);
//        }
//
//        GL11.glRotatef(45.0F, 1.0F, 0.0F, 0.0F);
//        GL11.glScalef(f10, f10 / 2, f10 / 2);
//        GL11.glTranslatef(-4.0F, 0.0F, 0.0F);
//        GL11.glNormal3f(f10, 0.0F, 0.0F);
//        tessellator.startDrawingQuads();
//        tessellator.addVertexWithUV(-7.0D, -2.0D, -2.0D, (double)f6, (double)f8);
//        tessellator.addVertexWithUV(-7.0D, -2.0D, 2.0D, (double)f7, (double)f8);
//        tessellator.addVertexWithUV(-7.0D, 2.0D, 2.0D, (double)f7, (double)f9);
//        tessellator.addVertexWithUV(-7.0D, 2.0D, -2.0D, (double)f6, (double)f9);
//        tessellator.draw();
//        GL11.glNormal3f(-f10, 0.0F, 0.0F);
//        tessellator.startDrawingQuads();
//        tessellator.addVertexWithUV(-7.0D, 2.0D, -2.0D, (double)f6, (double)f8);
//        tessellator.addVertexWithUV(-7.0D, 2.0D, 2.0D, (double)f7, (double)f8);
//        tessellator.addVertexWithUV(-7.0D, -2.0D, 2.0D, (double)f7, (double)f9);
//        tessellator.addVertexWithUV(-7.0D, -2.0D, -2.0D, (double)f6, (double)f9);
//        tessellator.draw();
// 
//        for (int i = 0; i < 4; ++i)
//        {
//            GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
//            GL11.glNormal3f(0.0F, 0.0F, f10);
//            tessellator.startDrawingQuads();
//            tessellator.addVertexWithUV(-8.0D, -2.0D, 0.0D, (double)f2, (double)f4);
//            tessellator.addVertexWithUV(8.0D, -2.0D, 0.0D, (double)f3, (double)f4);
//            tessellator.addVertexWithUV(8.0D, 2.0D, 0.0D, (double)f3, (double)f5);
//            tessellator.addVertexWithUV(-8.0D, 2.0D, 0.0D, (double)f2, (double)f5);
//            tessellator.draw();
//        }
//
//        GL11.glDisable(GL12.GL_RESCALE_NORMAL);
//        GL11.glPopMatrix();
//    }
//	
//	@Override
//	protected ResourceLocation getEntityTexture(Entity par1Entity)
//    {
//        return this.arrowTextures;
//    }
//}


package knight37x.lance.render;

import knight37x.lance.model.ModelLanceUp;
import knight37x.lance.model.ModelSpear;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainerCreative;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.texture.SimpleTexture;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;

public class RenderSpearEntity extends Render {

	protected ModelBase model;
	private ResourceLocation arrowTextures;
	
	public RenderSpearEntity() {
		this.arrowTextures = new ResourceLocation("lance:textures/models/modelSpear.png");
		this.model = new ModelSpear();
	}
	
	public RenderSpearEntity(String location) {
		this.arrowTextures = new ResourceLocation(location);
		this.model = new ModelSpear();
	}
	
	public RenderSpearEntity(ModelBase model) {
		this.arrowTextures = new ResourceLocation("lance:textures/models/modelSpear.png");
		this.model = model;
	}
	
	public RenderSpearEntity(ModelBase model, String location) {
		this.arrowTextures = new ResourceLocation(location);
		this.model = model;
	}
	
	@Override
	public void doRender(Entity entity, double par2, double par4, double par6, float par8, float par9)
    {
		this.bindEntityTexture(entity);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)par2, (float)par4, (float)par6);
        
        GL11.glRotatef(entity.rotationYaw + 0.0F, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
        GL11.glRotatef((float) (-entity.rotationPitch * 1.0 + 270.0F), 1.0F, 0.0F, 0.0F);
        float f10 = 1.0F;
        GL11.glScalef(f10 / 2, f10 / 2, f10 / 2);

        this.model.render(null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
        
        GL11.glDisable(GL12.GL_RESCALE_NORMAL);
        GL11.glPopMatrix();
    }
	
	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.arrowTextures;
    }
}