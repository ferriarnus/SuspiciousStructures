package dev.ferriarnus.suspiciousstructures;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(SuspiciousStructures.MODID)
public class SuspiciousStructures
{
    public static final String MODID = "suspiciousstructures";
    private static final Logger LOGGER = LogUtils.getLogger();

    public SuspiciousStructures(IEventBus modEventBus, ModContainer modContainer) {

    }
}
