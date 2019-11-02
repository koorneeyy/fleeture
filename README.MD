To build executable jar file, run in root project dir:

			mkdir build
			javac -d ./build src/de/fleeture/*.java
			cd build
			jar cfe TagFinder.jar de.fleeture.Main de/fleeture/*.class

Run program example:

     		       java -jar TagFinder.jar -f e:\music
Genre can be a number or word representation:    	
	       
     		       java -jar TagFinder.jar -f e:\music -g Other
     		       java -jar TagFinder.jar -f e:\music -g 12
    
