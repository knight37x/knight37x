package knight37x.magic.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelLightning_old extends ModelBase {
	// fields
	ModelRenderer vertical;
	ModelRenderer horizontal;

	public ModelLightning_old() {
		textureWidth = 256;
		textureHeight = 32;

		vertical = new ModelRenderer(this, 0, -120);
		vertical.addBox(0F, -10F, 0F, 0, 20, 120);
		vertical.setRotationPoint(0F, 0F, 0F);
		vertical.setTextureSize(256, 32);
		vertical.mirror = true;
		setRotation(vertical, 0F, 0F, 0F);
		horizontal = new ModelRenderer(this, 0, -120);
		horizontal.addBox(0F, -10F, 0F, 0, 20, 120);
		horizontal.setRotationPoint(0F, 0F, 0F);
		horizontal.setTextureSize(256, 32);
		horizontal.mirror = true;
		setRotation(horizontal, 0F, 0F, 1.570796F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		vertical.render(f5);
		horizontal.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

}
