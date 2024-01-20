package QAclickacademy;

import org.testng.annotations.Test;

public class AppiumTest {

	@Test
	public void NativeAppAndroid()
	{
		System.out.println("NativeAppAndroid");
	}
	
	@Test
	public void IOSApps()
	{
		System.out.println("IOSApps");
	}
	
	/*Your client came and told you that to just run only Appium test Java file and you have to run all the test cases present inside it just blindly.
	How do you do that?
	So here is the syntax: you have to pass that test file name, okay?
	mvn -Dtest AppiumTest test
	
	so only 2 test ran now
	
	Okay, so again, tomorrow your client came to you and asked to run only smoke profile.
	He want to execute only smoke tests. What do you do that?
	In that case, there is already a profile for us, which is smoke, which is referring to this XML file, right?
	Give the same command, change the profile name, that's all. Hit on enter, and you'll see that. Now you will see your execution has four test cases.
	So that's the beauty of using profiles in Maven. You can control your execution and you can control your TestNG xml files execution with this profiling.
	
	*/
	
	
}
