/*
 * generated by Xtext 2.15.0
 */
package compilador


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class PascalStandaloneSetup extends PascalStandaloneSetupGenerated {

	def static void doSetup() {
		new PascalStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
