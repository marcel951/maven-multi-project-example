
package de.mes;

/**
 *
 * @author esche
 */
public class Module1 implements ReactorModule {
    
    protected static final String MODULE_NAME = "module1";

    @Override
    public String reactorMethod() {
        return MODULE_NAME;
    }
    
}
