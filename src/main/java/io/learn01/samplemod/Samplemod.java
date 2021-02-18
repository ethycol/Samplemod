package io.learn01.samplemod;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Samplemod implements ModInitializer {
    public static final String MODID = "samplemod";
    public static final Logger LOGGER = LogManager.getLogger(Samplemod.class);

    @Override
    public void onInitialize() {
        LOGGER.info("This is the fabric mod");
    }
}
