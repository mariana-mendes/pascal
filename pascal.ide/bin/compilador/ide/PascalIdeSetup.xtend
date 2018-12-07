/*
 * generated by Xtext 2.15.0
 */
package compilador.ide

import com.google.inject.Guice
import compilador.PascalRuntimeModule
import compilador.PascalStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class PascalIdeSetup extends PascalStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new PascalRuntimeModule, new PascalIdeModule))
	}
	
}