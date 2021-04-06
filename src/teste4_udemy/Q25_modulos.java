package teste4_udemy;

/*
 Question ID: UK81542473

java.se is a/an ____________ module. 

In modular JDK, module names starting with "java." are known as standard modules. Non-standard module names don't start with "java.", such as module names starting with "jdk." are non-standard.

'java.se' is standard module and it is not deprecated.



An aggregator module collects and re-exports the content of other modules but adds no content of its own.


If you describe the java.se module:

C:\>java --describe-module java.se

java.se@11.0.3

requires java.xml.crypto transitive

requires java.datatransfer transitive

requires java.naming transitive

requires java.management transitive

requires java.instrument transitive

requires java.sql transitive

requires java.xml transitive

requires java.security.sasl transitive

requires java.base mandated

requires java.prefs transitive

requires java.security.jgss transitive

requires java.transaction.xa transitive

requires java.desktop transitive

requires java.sql.rowset transitive

requires java.management.rmi transitive

requires java.rmi transitive

requires java.net.http transitive

requires java.compiler transitive

requires java.logging transitive

requires java.scripting transitive


It is just re-exporting other java standard modules, hence 'java.se' is an aggregator module.
 */
