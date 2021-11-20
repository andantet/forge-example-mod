package me.andante.example;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Example.MOD_ID)
public class Example {
    public static final String MOD_ID = "example";
    public static final String MOD_NAME = "Example";

    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public Example() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("Initializing {}", MOD_NAME);

        //

        LOGGER.info("Initialized {}", MOD_NAME);
    }
}
