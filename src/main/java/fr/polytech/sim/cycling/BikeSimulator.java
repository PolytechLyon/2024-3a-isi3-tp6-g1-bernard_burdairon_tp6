package fr.polytech.sim.cycling;

import fr.polytech.sim.Simulation;
import fr.polytech.sim.log.Logger;
import fr.polytech.sim.log.LoggerFactory;
import fr.polytech.sim.utils.Context;

import java.util.Iterator;

/**
 * Bike simulation.
 */
public class BikeSimulator implements Simulation {
    private final Logger logger = LoggerFactory.createLogger("BikeSimulator");

    public void run() {
        Bike bike = new SimpleBike();
        this.logger.log("Bike's speed %.2f Km/h.", bike.getVelocity());
        this.logger.log("Bike's mass %.2f Kg.", bike.getMass());

        bike = new TagAlongBike();
        this.logger.log("Bike's speed %.2f Km/h.", bike.getVelocity());
        this.logger.log("Bike's mass %.2f Kg.", bike.getMass());

        Bike injectedBike = Context.inject(Bike.class);
        this.logger.log("Type of injected bike: %s", injectedBike.getClass());

        Iterator<Bike> injectedBikes = Context.injectAll(Bike.class);
        while(injectedBikes.hasNext()) {
            this.logger.log("Type of injected bikes: %s", injectedBikes.next().getClass());
        }
    }
}
