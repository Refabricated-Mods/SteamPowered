/*
 * Copyright (c) 2021 TeamMoeg
 *
 * This file is part of Steam Powered.
 *
 * Steam Powered is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, version 3.
 *
 * Steam Powered is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Steam Powered. If not, see <https://www.gnu.org/licenses/>.
 */

package com.teammoeg.steampowered;

import io.github.fabricators_of_create.porting_lib.util.FluidAttributes;
import io.github.fabricators_of_create.porting_lib.util.SimpleFlowableFluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.material.Fluids;
public class FluidRegistry {
    public static final ResourceLocation STILL_STEAM_TEXTURE = new ResourceLocation(SteamPowered.MODID, "block/steam");
    public static final ResourceLocation FLOWING_STEAM_TEXTURE = new ResourceLocation(SteamPowered.MODID, "block/steam");

    //public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, SteamPowered.MODID);
    //public static RegistryObject<FlowingFluid> steam = FLUIDS.register("steam", () -> new ForgeFlowingFluid.Source(FluidRegistry.PROPERTIES));
    //public static RegistryObject<FlowingFluid> steamFlowing = FLUIDS.register("steam_flowing", () -> new ForgeFlowingFluid.Flowing(FluidRegistry.PROPERTIES));
    //public static ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(steam, steamFlowing, FluidAttributes.builder(STILL_STEAM_TEXTURE, FLOWING_STEAM_TEXTURE).density(-10).viscosity(1).gaseous().temperature(473)).block(null).slopeFindDistance(3).explosionResistance(100F);

    public static FlowingFluid steam = Fluids.LAVA;
    public static FlowingFluid steamFlowing = Fluids.WATER;
    //public static SimpleFlowableFluid.Properties PROPERTIES = new SimpleFlowableFluid.Properties(() -> steam, () -> steamFlowing, new FluidAttributes.Builder());

    public static void register() {
    }
}
