public class HomeAutomationFacade {
    private Light light;
    private Thermostat thermostat;
    private EntertainmentSystem entertainmentSystem;

    public HomeAutomationFacade(Light light, Thermostat thermostat, EntertainmentSystem entertainmentSystem) {
        this.light = light;
        this.thermostat = thermostat;
        this.entertainmentSystem = entertainmentSystem;
    }

    public void startMovieNight() {
        System.out.println("\nSetting up Movie Night...");
        light.dim();
        thermostat.setTemperature(22);
        entertainmentSystem.turnOn();
        entertainmentSystem.setMovieMode();
        System.out.println("Movie Night setup complete. Enjoy!");
    }

    public void leaveHome() {
        System.out.println("\nPreparing to leave home...");
        light.turnOff();
        thermostat.turnOff();
        entertainmentSystem.turnOff();
        System.out.println("Home is secured. Goodbye!");
    }

    public void comeHome() {
        System.out.println("\nWelcome Home...");
        light.turnOn();
        thermostat.setTemperature(24);
        System.out.println("Home is ready and cozy!");
    }
}
