package de.mes;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;

/**
 *
 * @author esche
 */
@RunWith(Parameterized.class)
public class Module1Test {
    
    private final Module1 module;

    public Module1Test(Module1 module) {
        this.module = module;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
      return Arrays.asList(new Object[][] {
          { new Module1() },
      });
    } 

    
    @Test
    public void testReactorMethod(){
        Assert.assertEquals(Module1.MODULE_NAME,  this.module.reactorMethod());
    }
        
}
