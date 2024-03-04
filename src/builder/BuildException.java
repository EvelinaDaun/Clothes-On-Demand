package builder;

// Klass BuildException - En enkel undantagsklass med utskrift.
public class BuildException extends RuntimeException {
    public BuildException (String buildComponent, Object value){
        super(buildComponent + " har ett felaktigt värde: " + value);
    }
}