# WAT - Web Automation Template

This template was created as a starting point to web automation using Java, Cucumber and Gherkin.
Only chrome and Firefox are included here.

# Requirements:
* IntelliJ IDEA
* Cucumber for Java Plugin
* Gherkin Plugin

# How To:
* Get the WAT code:
  * Visit the website: https://github.com/reginaldosc/WAT_03
  * Click on green button "Code"
  * Tap "Download ZIP"

  
* Create your Repository:
  * Create a Repository using your Github
  * Name it [Project name]-web-automation
  * Insert the WAT code in this repository


* Set up the Project
  * Open the Repository in IntelliJ and Go to the “automation” Properties File
  * Fill the 'web.browser' Property with the Browser you wish to use (CHROME / FIREFOX)
  * Fill the 'web.system' Property with the Operating System you're using
  * Go to 'pom.xml' and Import Maven Dependencies / Turn ON Auto Import
  * Add the step Definitions of your tests inside the folder called (src/test/java/webDefs)
  * Add the Cucumber Test Cases of your tests inside the folder (src/test/resources/webFeatures)
  * Run the Class ‘RunWebTest’ to run the written tests


* Adding Web Drivers (Not Mandatory)
  * Download Web Driver Files to ‘browserDrivers’ folder (src/test/resources/browserDrivers)
  * Add on the ‘startWebBrowser’ method the name of your browser (Example: EDGE)
  * Add a new Switch Case step in WebUtility Class for the new Browser you added before
  * Add the Path of your Browser’s Driver in WebUtility Class. On the ‘setupDriverPaths’ method to configure ‘System’ 
  Properties

