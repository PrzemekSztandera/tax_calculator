package tax;

public class FeatureToggle {

    private boolean active;

    public FeatureToggle(boolean active) {
        this.active = active;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

}
