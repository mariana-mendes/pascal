/**
 * generated by Xtext 2.15.0
 */
package compilador;

import compilador.PascalStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class PascalStandaloneSetup extends PascalStandaloneSetupGenerated {
  public static void doSetup() {
    new PascalStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}