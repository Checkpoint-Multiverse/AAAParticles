package mod.chloeprime.aaaparticles.fabric;

import mod.chloeprime.aaaparticles.AAAParticles;
import net.fabricmc.api.ModInitializer;

public class AAAParticlesFabric extends AAAParticles implements ModInitializer {
    @Override
    public void onInitialize() {
        AAAParticles.init();
    }
}