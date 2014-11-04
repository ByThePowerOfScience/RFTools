package com.mcjty.rftools.blocks.shield;

import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.IMob;

public class HostileFilter extends AbstractShieldFilter {
    @Override
    public boolean match(Entity entity) {
        return entity instanceof IMob;
    }

    @Override
    public String getFilterName() {
        return "hostile";
    }
}
