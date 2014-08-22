#**Nectirini Project** #
_______________________

## **How to run it** ##
1. Clone the project
1. Run it
             
    * Unix: In the root of the project type ". build_run"
    * Windows: Copy the content of the file build_run 
               and execute it directly in the command line


1. Test it: Got to [http://localhost:8888/test](Nectirini). 
   If everything is OK,you should get a 200-OK HTTP response with JSON data

## **Debug it** ##

**Intellij**

1. Go to "Edit Configurations" close to the upper right corner
1. Add a new "Application" configuration

    * Main class: com.cloudyrock.nectirini.App
    * Program arguments: server nectirini.yml
    * Working directory: ROOT_PROJECT_FOLDER
    * Use classpath of module: nectirini

1. Still in configuration. In the "Before launch", add the next commands:
    * Make
    * Run maven goal: clean
    * Run maven goal: install


**Eclipse**

...