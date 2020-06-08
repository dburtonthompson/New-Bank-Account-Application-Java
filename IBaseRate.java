public interface IBaseRate {

    // Write method that returns a base rate
    default double getBaseRate() {

        return 2.5;
    }

}