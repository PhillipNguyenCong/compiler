antlrjar = antlr-4.13.2-complete.jar

###### FOR LINUX AND MAC -- comment the following line if you use Windows:
classpath = '$(antlrjar):.'

###### FOR WINDOWS -- uncomment the following line if you use Windows:
#classpath = '$(antlrjar);.'

antlr4 = java -cp $(classpath) org.antlr.v4.Tool
grun = java -cp $(classpath) org.antlr.v4.gui.TestRig
SRCFILES = main.java
GENERATED = ccListener.java ccBaseListener.java ccParser.java ccLexer.java

all:	
	make grun

ccLexer.java:	cc.g4
	$(antlr4) cc.g4

ccLexer.class:	ccLexer.java
	javac -cp $(classpath) $(GENERATED)

main.class: ccLexer.java main.java
	javac -cp $(classpath) $(GENERATED) main.java

run:	main.class
	java -cp $(classpath) main 01-hello-world.hw

clean:
	rm $(GENERATED) *.class prog.interp progLexer.interp progLexer.tokens prog.tokens

grun1:	ccLexer.class 01-hello-world.hw
	$(grun) cc start -gui -tokens 01-hello-world.hw

grun1b:	ccLexer.class 01b-hello-world-withdef.hw
	$(grun) cc start -gui -tokens 01b-hello-world-withdef.hw

grun2:	ccLexer.class 02-trafiklys-minimal.hw
	$(grun) cc start -gui -tokens 02-trafiklys-minimal.hw

grun3:	ccLexer.class 03-trafiklys.hw
	$(grun) cc start -gui -tokens 03-trafiklys.hw

grun4:	ccLexer.class 04-von-Neumann.hw
	$(grun) cc start -gui -tokens 04-von-Neumann.hw

clean:
	rm -rf $(GEN_DIR)/*.java *.class
