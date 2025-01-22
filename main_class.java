public class HomeAutomationDemo {
    public static void main(String[] args) {
        // Create subsystems
        Light light = new Light();
        Thermostat thermostat = new Thermostat();
        EntertainmentSystem entertainmentSystem = new EntertainmentSystem();

        // Create facade
        HomeAutomationFacade homeFacade = new HomeAutomationFacade(light, thermostat, entertainmentSystem);

        // Use facade methods
        homeFacade.comeHome();
        homeFacade.startMovieNight();
        homeFacade.leaveHome();
    }
}
