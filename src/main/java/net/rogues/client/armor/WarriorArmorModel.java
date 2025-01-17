package net.rogues.client.armor;

import mod.azure.azurelibarmor.model.GeoModel;
import net.minecraft.util.Identifier;
import net.rogues.RoguesMod;
import net.rogues.item.armor.WarriorArmor;

public class WarriorArmorModel extends GeoModel<WarriorArmor> {
    @Override
    public Identifier getModelResource(WarriorArmor object) {
        return new Identifier(RoguesMod.NAMESPACE, "geo/warrior_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(WarriorArmor armor) {
        var texture = armor.customMaterial.name();
        return new Identifier(RoguesMod.NAMESPACE, "textures/armor/" + texture + ".png");
    }

    @Override
    public Identifier getAnimationResource(WarriorArmor animatable) {
        return null; // new Identifier(PaladinsMod.ID, "animations/armor_idle.json");
    }
}
