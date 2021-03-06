package com.AnZaNaMa.EnergyTools.Block;

import com.AnZaNaMa.EnergyTools.EnergyTools;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Andrew Graber on 2/25/2015.
 */
public class energyblock extends Block implements IEnergyBlock{

    public energyblock(String unlocalizedName, Material material, float localHardness, float localResistance){
        super(material);
        GameRegistry.registerBlock(this, unlocalizedName);
        this.setCreativeTab(EnergyTools.creativeTab);
        this.setUnlocalizedName(unlocalizedName);
        this.setHardness(localHardness);
        this.setResistance(localResistance);
    }
    public energyblock(String unlocalizedName, Material material){
        this(unlocalizedName, material, 1.5F, 10.0F);
    }

    public String getName(){
        return this.getUnlocalizedName().substring(5);
    }

}
